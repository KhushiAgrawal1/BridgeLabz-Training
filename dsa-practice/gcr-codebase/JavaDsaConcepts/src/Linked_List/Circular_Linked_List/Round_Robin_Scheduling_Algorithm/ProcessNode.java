package Linked_List.Circular_Linked_List.Round_Robin_Scheduling_Algorithm;

public class ProcessNode {
    int processId;
    int burstTime;
    int remainingTime;
    int priority;

    ProcessNode next;

    public ProcessNode(int processId, int burstTime, int priority) {
        this.processId = processId;
        this.burstTime = burstTime;
        this.remainingTime = burstTime;
        this.priority = priority;
        this.next = null;
    }
}
