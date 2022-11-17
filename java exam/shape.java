public class shape {

    void draw ()
    {
        System.out.println(" i am draw");
    }

    void erase ()
    {
        System.out.println(" i am erase");
    }
}



class circle extends shape
{
    void draw ()
    {
        System.out.println(" i am  circle draw");
    }

    void erase ()
    {
        System.out.println(" i am  circle erase");
    }
}

class triangle extends shape
{
    void draw ()
    {
        System.out.println(" i am  triangle draw");
    }

    void erase ()
    {
        System.out.println(" i am  triangle erase");
    }
}

class square extends shape
{
    void draw ()
    {
        System.out.println(" i am  square draw");
    }

    void erase ()
    {
        System.out.println(" i am square  erase");
    }
}

class test
{
    public static void main(String[] args) {
        shape c= new circle();
        shape t = new triangle();
        shape s = new square();
        c.draw();
        c.erase();
        t.draw();
        t.erase();
        s.draw();
        s.erase();


    }
}