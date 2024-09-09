public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        int i = 0;
        while (i <= 1000) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                count++;
            }
            i++;
        }
        System.out.println("There are " + count + " multiples of 3 or 5 below 1000.");
    }
}
