package com.rohankadam.dsa.stack;

public class Stack {
    private int arr[]; //initialing a container in our case its an array
    private int size; // size on container
    private int top;// top position of array

    public Stack(int size) {
        this.arr = new int[size];
        this.top = -1;
        this.size = size;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public String push(int value) {
        if (isFull()) {
            System.out.println("The Stack is already Full--overflow");
            return "The Stack is already Full--overflow";
        }

        top = top + 1;
        this.arr[top]=value;
        return "The Value Added Successfully.:-   " +this.arr[top];

    }

    public String pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return "Stack is empty";
        }
        top= top-1;
         return String.valueOf(this.arr[top]);
    }

    public void printArray(){
        for (int value:this.arr) {
            System.out.println("Value:--  "+value);
        }
    }
}
