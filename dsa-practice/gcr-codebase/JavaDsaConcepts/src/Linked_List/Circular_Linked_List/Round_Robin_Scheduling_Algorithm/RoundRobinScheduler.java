package Linked_List.Circular_Linked_List.Round_Robin_Scheduling_Algorithm;

public class RoundRobinScheduler {

    public static void main(String[] args) {

        RoundRobinCircularList scheduler = new RoundRobinCircularList();

        scheduler.addProcess(1, 10, 1);
        scheduler.addProcess(2, 5, 2);
        scheduler.addProcess(3, 8, 1);
        scheduler.addProcess(4, 6, 3);

        int timeQuantum = 3;

        System.out.println("Round Robin Scheduling (Time Quantum = " + timeQuantum + ")");
        scheduler.simulate(timeQuantum);
    }
}
