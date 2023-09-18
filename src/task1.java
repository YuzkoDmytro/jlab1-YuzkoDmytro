import java.util.Scanner;

public class task1 {

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        System.out.println("Введіть варіант вводу-виводу");
        System.out.println("1 - Вхідні дані та результат - дійсного типу");
        System.out.println("2 - Вхідні дані цілого типу, результат - дійсного");
        System.out.println("3 - Вхідні дані дійсного типу, результат - цілого");
        System.out.println("Enter: ");
        int enter = in.nextInt();

        switch (enter)
        {
            case 1:
            {
                float a, b;

                System.out.print("Введіть а: ");
                a = in.nextFloat();
                System.out.print("Введіть b: ");
                b = in.nextFloat();

                float sum = (((a * b) - ((a + b) * (a - b))) / ((b * b * b * b) + (a * a * a))) + (5 * b);
                System.out.println(sum);
            }
            case 2:
            {
                int a, b;

                System.out.print("Введіть а: ");
                a = in.nextInt();
                System.out.print("Введіть b: ");
                b = in.nextInt();

                float sum = (((a * b) - ((a + b) * (a - b))) / ((b * b * b * b) + (a * a * a))) + (5 * b);
                System.out.println(sum);
            }
            case 3:
            {
                float a, b;

                System.out.print("Введіть а: ");
                a = in.nextFloat();
                System.out.print("Введіть b: ");
                b = in.nextFloat();

                int sum = (int) ((((a * b) - ((a + b) * (a - b))) / ((b * b * b * b) + (a * a * a))) + (5 * b));
                System.out.println(sum);
            }
        }

        in.close();
    }
}