package problem3;

public class SumSquareDif {
    public static double difference(int N) {
        double sumOfSquares = 0;
        double sumOfNaturals = 0;
        for (double i = 0; i <= N; i++) {
            sumOfSquares = sumOfSquares + Math.pow(i, 2);
        }

        for (double i = 0; i <= N; i++) {
            sumOfNaturals += i;
        }

        sumOfNaturals = Math.pow(sumOfNaturals, 2);

        return sumOfNaturals - sumOfSquares;

    }

    public static void main(String[] args) {
        double sum = difference(100);
        System.out.print((int) sum);
    }

}
