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
import java.util.Scanner;

public class Demo {
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        Queue queue = new Queue();
        while(true)
        {
            System.out.print("Enter Non negative integer Value: ");
            int value = input.nextInt();
            
            if(value > 0)
            {
                if(!queue.isFull())
                {
                    queue.put(value);
                }
                else
                {
                    System.out.println("\nQueue is already Full\n");
                }
            }
            else if(value == 0)
            {
                if(!queue.isEmpty())
                {
                    System.out.println("\n"+queue.get()/*+"\n"*/);
                }
                else
                {
                    System.out.println("\nQueue is Empty\n");
                }
            }
            else if(value == -1)
            {
                break;
            }
        }
    }
}