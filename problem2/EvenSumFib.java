package problem2;

public class EvenSumFib {
    public static int sumFib() {
        int sum = 0;
        int[] fibNumbers = { 1, 2 };
        int n = 2;
        while (n < 4000000) {

            if (n % 2 == 0) {
                sum += n;
            }
            n = fibNumbers[0] + fibNumbers[1];
            fibNumbers[0] = fibNumbers[1];
            fibNumbers[1] = n;
        }

        return sum;
    }

    public static void main(String[] args) {
        int sum = sumFib();
        System.out.print(sum);
    }
}