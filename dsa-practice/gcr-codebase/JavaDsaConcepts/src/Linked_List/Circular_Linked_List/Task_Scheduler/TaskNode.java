package Linked_List.Circular_Linked_List.Task_Scheduler;

	public class TaskNode {
	    int taskId;
	    String taskName;
	    int priority;
	    String dueDate;

	    TaskNode next;

	    TaskNode(int taskId, String taskName, int priority, String dueDate) {
	        this.taskId = taskId;
	        this.taskName = taskName;
	        this.priority = priority;
	        this.dueDate = dueDate;
	        this.next = null;
	    }
	}
