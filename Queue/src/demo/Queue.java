/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

/**
 *
 * @author user
 */
public class Queue
{
    private int queue[];
    private int size;
    private int front, rear;

    public Queue()
    {
        size = 10;
        queue = new int[size];
        front = -1;
        rear = -1;
    }

    public void put(int i)
    {
        if(isFull())
            System.out.println("Queue is already Full\n");
        else
        {
            rear = (rear+1)% size;
            queue[rear] = i;
            
            if(front == -1)
               front = 0;
        }
    }

    public boolean isFull()
    {
        return front == (rear+1)% size;
    }

    public boolean isEmpty()
    {
        return front == -1;
    }


    public int get()
    {
        int x = 0;
        if(isEmpty())
            System.out.println("The Whole Queue is empty");
        else if(front == rear)
        {
            x = queue[front];
            front = rear -1;    
        }
        else{
            x=queue[front];
            front=(front+1)%size;
        }
        return x;
    }
    
    public int peek(){
        if(isEmpty()){
            System.out.println("The Whole Queue is empty");
            return 0;
        }
        else{
            return queue[front];
        }
    }
}
