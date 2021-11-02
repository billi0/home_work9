import java.util.Map;

public class Q9 {
    public static void main(String[] args)
    {
        Map<String, Integer> people = new java.util.HashMap<>();
        people.put("A", 100);
        people.put("B", 200);
        people.put("C",300);
        people.put("D",400);

        for (Integer i : people.values())
        {
            System.out.println(i);
        }
    }
}
