package com;

class CropMonitor {

    static void quickSort(long[] timestamps, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(timestamps, low, high);
            quickSort(timestamps, low, pivotIndex - 1);
            quickSort(timestamps, pivotIndex + 1, high);
        }
    }

    static int partition(long[] timestamps, int low, int high) {
        long pivot = timestamps[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (timestamps[j] <= pivot) {
                i++;
                long temp = timestamps[i];
                timestamps[i] = timestamps[j];
                timestamps[j] = temp;
            }
        }

        long temp = timestamps[i + 1];
        timestamps[i + 1] = timestamps[high];
        timestamps[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        long[] sensorTimestamps = {
            1705123456L, 1705123000L, 1705123999L, 1705123200L
        };

        quickSort(sensorTimestamps, 0, sensorTimestamps.length - 1);

        System.out.println("Sorted Sensor Timestamps:");
        for (long time : sensorTimestamps) {
            System.out.print(time + " ");
        }
    }
}

