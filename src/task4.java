import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть текст: ");
        String text = scanner.nextLine();
        System.out.print("Введіть символ: ");
        char symbol = scanner.next().charAt(0);

        String[] words = text.split("[\\s\\p{Punct}]+");

        String maxFrequencyWord = "";
        int maxFrequency = 0;

        for (String word : words) {
            int frequency = getSymbolFrequency(word, symbol);

            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                maxFrequencyWord = word;
            }
        }

        if (!maxFrequencyWord.isEmpty()) {
            System.out.println("Слово з найбільшою кількістю символу '" + symbol + "': " + maxFrequencyWord);
            System.out.println("Кількість символів '" + symbol + "' у слові: " + maxFrequency);
        } else {
            System.out.println("Слова з символом '" + symbol + "' не знайдено.");
        }
    }

    private static int getSymbolFrequency(String word, char symbol) {
        int frequency = 0;
        for (char ch : word.toCharArray()) {
            if (ch == symbol) {
                frequency++;
            }
        }
        return frequency;
    }
}