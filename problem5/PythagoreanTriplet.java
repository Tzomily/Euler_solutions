package problem5;

public class PythagoreanTriplet {
    public static boolean isTriplet(int a, int b, int c) {
        return a + b + c == 1000;
    }

    public static boolean Pythagorean(int a, int b, int c) {
        return Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2);
    }

    public static int findSol() {
        for (int c = 2; c < 500; c++) {
            for (int b = 1; b < c; b++) {
                for (int a = 0; a < b; a++) {
                    if (isTriplet(a, b, c) && Pythagorean(a, b, c)) {
                        return a * b * c;
                    }
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int sol = findSol();
        System.out.print(sol);
    }
}
