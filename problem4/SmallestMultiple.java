package problem4;

public class SmallestMultiple {

    public static int smallMultiple(int N) {
        int number = N-1;
    
        while (true) {           
            if (isDividable(N, number)) {
                return number;
            }
            number++;
        }

    }

    public static boolean isDividable(int N, int number) {
        
        for (int i = 1; i <= N; i++) {
            if (number % i != 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int sum = smallMultiple(20);
        System.out.print(sum);
    }
}
