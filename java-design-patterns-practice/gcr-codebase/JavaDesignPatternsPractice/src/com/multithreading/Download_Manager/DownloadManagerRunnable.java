package com.multithreading.Download_Manager;

public class DownloadManagerRunnable {
    public static void main(String[] args) {

        FileDownloaderRunnable d1 = new FileDownloaderRunnable("Document.pdf");
        FileDownloaderRunnable d2 = new FileDownloaderRunnable("Image.jpg");
        FileDownloaderRunnable d3 = new FileDownloaderRunnable("Video.mp4");

        Thread t1 = new Thread(d1, "Thread-1");
        Thread t2 = new Thread(d2, "Thread-2");
        Thread t3 = new Thread(d3, "Thread-3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("All downloads complete!");
    }
}
