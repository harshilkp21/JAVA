package Unit1;

class Student2
{
    int rn;
    String name;
    double percentage;

    void getData(int r,String n,double p)
    {
        rn=r;
        name=n;
        percentage=p;
    }

    void putdata()
    {
        System.out.println("Roll no: "+rn);
        System.out.println("Name: "+name);
        System.out.println("percentage: "+percentage);
    }
}


public class Simpleclass {
    public static void main(String args[])
    {
        Student2 s1 = new Student2();
        s1.getData(1,"Harshil", 90);
        s1.putdata();  

        Student2 s2 = new Student2();
        s2.getData(2,"Naruto", 90);
        s2.putdata();
    }
}
