import java.util.HashSet;
import java.util.Set;

public class task2 {
    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5, 7};
        int[] B = {3, 4, 5, 6, 7};

        Set<Integer> unionSet = new HashSet<>();

        for (int num : A) {
            unionSet.add(num);
        }

        for (int num : B) {
            unionSet.add(num);
        }

        System.out.println("Елементи об'єднання A і B:");
        for (int num : unionSet) {
            System.out.print(num + " ");
        }

        int sum = 0;
        for (int num : unionSet) {
            sum += num;
        }

        System.out.println("\nСума елементів об'єднання: " + sum);
    }
}