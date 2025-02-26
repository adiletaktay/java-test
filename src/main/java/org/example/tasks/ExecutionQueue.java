package org.example.tasks;

/*
Что будет выведено на экран?
 */

public class ExecutionQueue {
    private static String msg;

    static {
        msg = "static block";
    }

    {
        msg = "regular init block";
    }

    public ExecutionQueue() {
        msg = "constructor value";
    }

    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(executionQueue.msg);
    }
}
