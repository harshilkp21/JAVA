package Unit4;

import java.util.*;

class RandomNumberThread extends Thread
{
    public void run()
    {
        Random random = new Random();
        for(int i=0;i<10;i++)
        {
            int randomInteger = random.nextInt(100);
            System.out.println("Random integer generated: "+randomInteger);
            if(randomInteger%2==0)
            {
                SquareThread sThread = new SquareThread(randomInteger);
                sThread.start();
            }
            else
            {
                CubeThread cThread = new CubeThread(randomInteger);
                cThread.start();
            }

            try{
                Thread.sleep(3000);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex);
            }
        }
    }
}

class SquareThread extends Thread
{
    int number;
    public SquareThread(int randomInteger)
    {
        number = randomInteger;
    }

    public void run()
    {
        System.out.println("Square of "+number+" = "+(number*number));
    }

}

class CubeThread extends Thread
{
    int number;
    public CubeThread(int randomInteger)
    {
        number = randomInteger;
    }

    public void run()
    {
        System.out.println("Cube of "+number+" = "+(number*number*number));
    }

}

public class Multithreading {
    public static void main(String[] args) 
    {
        RandomNumberThread r = new RandomNumberThread();
        r.start();
    }
}
