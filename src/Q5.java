import java.util.ArrayList;
import java.util.Iterator;

public class Q5 {
    public static void main(String[] args) {
        ArrayList employeeName = new ArrayList();
        employeeName.add("Patel");
        employeeName.add("Khan");
        employeeName.add("Piter");
        employeeName.add("Jatan");
        employeeName.add("Chetan");
        employeeName.add("Anas");

        Iterator itr = employeeName.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
