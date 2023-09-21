package ru.stepchenkov.net;

import ru.stepchenkov.net.controllers.TrainerController;
import ru.stepchenkov.net.service.DataReaderImpl;
import ru.stepchenkov.net.service.TrainingService;

public class Runner {
    public static void runTraining() {
        TrainerController modelTrainer = new TrainerController(new TrainingService(), new DataReaderImpl());
        modelTrainer.trainModel(4);
    }

}