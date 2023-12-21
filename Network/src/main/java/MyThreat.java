/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF
 */
public class MyThreat extends ClassA implements Runnable {
    String threadName;
    public MyThreat(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run()
    {
        printMsg();
    }
    public void printMsg()
    {
        while(true)
        {
            System.out.println("Thread : " + threadName);
        }
    }
}
