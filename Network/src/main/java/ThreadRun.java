/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author TUF
 */
public class ThreadRun {

    public static void main(String[] args) {
        
        MyThreat mt1 = new MyThreat("Thread 1");
        MyThreat mt2 = new MyThreat("Thread 2");
        Thread t1 = new Thread(mt1);
        Thread t2 = new Thread(mt2);
        t1.start();
        t2.start();
    }
}
