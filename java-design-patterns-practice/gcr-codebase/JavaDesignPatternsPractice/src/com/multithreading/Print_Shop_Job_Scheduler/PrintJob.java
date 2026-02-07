package com.multithreading.Print_Shop_Job_Scheduler;

public class PrintJob implements Runnable {

    private String jobName;
    private int pages;
    private int priority;

    public PrintJob(String jobName, int pages, int priority) {
        this.jobName = jobName;
        this.pages = pages;
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }

    public String getJobName() {
        return jobName;
    }

    private String getPriorityLabel() {
        if (priority >= 7) {
            return "High Priority";
        } else if (priority >= 5) {
            return "Medium Priority";
        } else {
            return "Low Priority";
        }
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= pages; i++) {
                System.out.println("[" + getPriorityLabel() + "] Printing "
                        + jobName + " - Page " + i + " of " + pages);

                Thread.sleep(100); // 100 ms per page
            }

            System.out.println(jobName + " completed.");

        } catch (InterruptedException e) {
            System.out.println(jobName + " was interrupted.");
        }
    }
}

