package com.rohankadam.dsa.queue;

public class Queue {

    private int arr[];
    private int front;
    private int rear;
    private int size;

    public Queue(int size){
        this.arr=new int[size];
        this.front=-1;
        this.rear=-1;
        this.size=size;
    }

    public boolean isEmpty(){
        if(this.front==-1 && this.rear==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(this.front==0 && this.rear==size-1){
            return true;
        }
        return false;
    }

    public void enQueue(int value){
        if(isEmpty()){
            this.front=0;
            this.rear=0;
            this.arr[this.rear]=value;
        }
        if(!isFull()){
            this.arr[this.rear++]=value;
        }

    }

    public String deQueue(){
        int element;
        if(isEmpty()){
            return "Queue is empty";
        }
        element=this.arr[this.front];
        this.front++;
        return String.valueOf(element);
    }

    public void printArray(){
        for (int value:this.arr) {
            System.out.println("Value:--  "+value);
        }
    }
}
