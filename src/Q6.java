import java.util.ArrayList;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Ava");
        arrayList.add("Bobby");
        arrayList.add("Cameron");
        arrayList.add("Dylan");
        arrayList.add("Emily");
        arrayList.add("Faith");
        arrayList.add("George");
        arrayList.add("Harry");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an index number between 0 and 7");
        int index = scanner.nextInt();


        if (index == 0) {
            System.out.println("Ava");
        } else if (index == 1) {
            System.out.println("Bobby");
        } else if (index == 2) {
            System.out.println("Cameron");
        } else if (index == 3) {
            System.out.println("Dylan");
        } else if (index == 4) {
            System.out.println("Emily");
        } else if (index == 5) {
            System.out.println("Faith");
        } else if (index == 6) {
            System.out.println("George");
        } else if (index == 7) {
            System.out.println("Harry");
        } else {
            System.out.println("Invalid index number is entered");

        }
    }
}