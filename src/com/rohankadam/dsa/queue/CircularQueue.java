package com.rohankadam.dsa.queue;

public class CircularQueue {

    private int size;
    private int front;
    private int rear;
    private int arr[];

    public CircularQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
        this.size = size;
    }

    public boolean isEmpty() {
        if (front == -1 && rear == -1)
            return true;
        return false;
    }

    public boolean isFull() {
        if (front != -1 && rear == this.size - 1)
            return true;
        return false;
    }

    public void add(int value) {
        if (isFull()) {
            System.out.println("Queue is fulll..");
        } else {
            if (this.front == -1) {
                this.front = 0;
                this.rear = 0;
                this.arr[this.rear] = value;
            }else {
                this.rear = this.rear + 1;
                if (this.rear > size - 1) {
                    this.arr[this.rear%(size-1)]=value;
                }
            }
                this.arr[this.rear] = value;


        }
    }

    public void delete(){
        if(isEmpty()){
            System.out.println("Circular Queue is empty");
        }else {
            if(this.front>size-1){
                this.front=this.front%(size-1);
            }
            System.out.println(this.arr[front]);
            this.front++;

        }

    }

    public void printArray(){
        for (int value:this.arr) {
            System.out.println("Value:--  "+value);
        }
    }

}
