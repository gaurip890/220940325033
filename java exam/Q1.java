import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        ArrayList <String>  arr= new ArrayList<String> ();
        arr.add(" white");
        arr.add("green");
        arr.add(" orange");
        arr.add("red");
        arr.add(" pink");
        arr.add("black");

        System.out.println("array using for loop");
        for (int i =0;i<arr.size();i++)
        {
            System.out.println(arr.get(i));
        }


    }


}
