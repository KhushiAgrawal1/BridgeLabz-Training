package com.multithreading.Download_Manager;

import java.util.Random;

public class FileDownloaderRunnable implements Runnable {
    private String fileName;

    public FileDownloaderRunnable(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        Random random = new Random();

        for (int i = 0; i <= 100; i += 10) {
            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + ": " + i + "%");

            try {
                Thread.sleep(random.nextInt(500));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
