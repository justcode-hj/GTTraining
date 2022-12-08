package Multithreading;

public class Threading extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
        for(int i=1;i<5;i++)
        {
            try
            {
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
            System.out.println(i);
        }
    }
    public static void main(String args[])
    {
        Threading thread1=new Threading();
        Threading thread2=new Threading();
        Threading thread3=new Threading();
        thread1.setPriority(Thread.MAX_PRIORITY);
        thread1.start();
        System.out.println("Check Thread2 isAlive: "+thread2.isAlive());
        thread2.start();
        System.out.println("Check Thread2 isAlive: "+thread2.isAlive());
        thread2.setName("GT Training");
        thread3.start(); // Starts Thread 3
        thread3.suspend(); // Stops Thread3
    }
}
