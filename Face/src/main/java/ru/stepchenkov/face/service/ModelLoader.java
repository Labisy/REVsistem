package ru.stepchenkov.face.service;

import lombok.extern.slf4j.Slf4j;
import org.deeplearning4j.nn.multilayer.MultiLayerNetwork;
import org.deeplearning4j.util.ModelSerializer;
import ru.stepchenkov.face.type.FileType;

import java.io.File;
import java.io.IOException;

// Класс для загрузки модели нейронной сети
@Slf4j
public class ModelLoader {

    public MultiLayerNetwork loadModel() throws IOException {
        // Получение файла модели
        File modelFile = new File(FileType.NET_MODEL.get());
        // Проверка существования файла модели
        if (!modelFile.exists()) {
            log.error("Ошибка в получении натренированной модели");
            return null;
        }
        // Восстановление многослойной нейронной сети из файла
        return ModelSerializer.restoreMultiLayerNetwork(modelFile);
    }
}