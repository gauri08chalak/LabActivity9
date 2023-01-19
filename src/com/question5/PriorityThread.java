//Author: Gauri Chalak
// WAP to show priority of a thread

package com.question5;

public class PriorityThread implements Runnable
{
public void run()
{
  System.out.println(Thread.currentThread()); // This method is static.
}
public static void main(String[] args) 
{
 PriorityThread a = new PriorityThread();
 Thread t = new Thread(a, "GauriThread");
 
 System.out.println("Priority of Thread: " +t.getPriority());
 System.out.println("Name of Thread: " +t.getName());
 t.start();
  }
}