package com;

class ArtExpo {

    // Insertion Sort to arrange registration times
    static void insertionSort(int[] registrationTimes) {
        for (int i = 1; i < registrationTimes.length; i++) {
            int current = registrationTimes[i];
            int j = i - 1;

            // Shift later registrations forward
            while (j >= 0 && registrationTimes[j] > current) {
                registrationTimes[j + 1] = registrationTimes[j];
                j--;
            }

            // Insert at correct position
            registrationTimes[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        // Registration times (in minutes since opening)
        int[] artistRegistrationTimes = {120, 90, 150, 110, 130};

        insertionSort(artistRegistrationTimes);

        System.out.println("Artists Sorted by Registration Time:");
        for (int time : artistRegistrationTimes) {
            System.out.print(time + " ");
        }
    }
}

