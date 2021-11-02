import java.util.ArrayList;

public class Q4 {
    public static void main(String[] args)
    {

        ArrayList rainbow = new ArrayList();
        rainbow.add("Red");
        rainbow.add("Orange");
        rainbow.add("Yellow");
        rainbow.add("Green");
        rainbow.add("Blue");
        rainbow.add("Purple");


        for (Object value : rainbow)
        {
            System.out.println(value);
        }
    }
}
