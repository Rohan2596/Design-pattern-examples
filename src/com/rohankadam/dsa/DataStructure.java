package com.rohankadam.dsa;

import com.rohankadam.dsa.queue.CircularQueue;
import com.rohankadam.dsa.queue.Queue;
import com.rohankadam.dsa.stack.Stack;

public class DataStructure {



    public static void main(String[] args) {
//        Stack stack = new Stack(5);
//        stack.pop();
//        stack.push(10);
//        stack.push(11);
//        stack.push(12);
//        stack.pop();
//        stack.printArray();


//        Queue queue= new Queue(5);
//        queue.deQueue();
//        queue.enQueue(10);
//        queue.enQueue(11);
//        queue.enQueue(12);
//        queue.printArray();
//        queue.deQueue();
//        queue.deQueue();
//        queue.printArray();

        CircularQueue circularQueue= new CircularQueue(3);
        circularQueue.add(2);
        circularQueue.add(3);
        circularQueue.add(4);
        circularQueue.printArray();
        circularQueue.add(4);
        circularQueue.delete();
        circularQueue.delete();
        circularQueue.delete();

        circularQueue.printArray();

    }
}
