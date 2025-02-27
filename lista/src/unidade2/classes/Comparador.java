package unidade2.classes;

public class Comparador {
    public static int maiorInt(int a, int b) {
        return a > b ? a : b;
    }

    public static int maiorInt(int a, int b, int c) {
        return maiorInt(maiorInt(a, b), c);
    }

    public static int maiorInt(int a, int b, int c, int d) {
        return maiorInt(maiorInt(a, b), maiorInt(c, d));
    }

    public static int maiorInt(int a, int b, int c, int d, int e) {
        return maiorInt(maiorInt(a, b, c, d), e);
    }

    public static double maiorDouble(double a, double b) {
        return a > b ? a : b;
    }

    public static double maiorDouble(double a, double b, double c) {
        return maiorDouble(maiorDouble(a, b), c);
    }

    public static double maiorDouble(double a, double b, double c, double d) {
        return maiorDouble(maiorDouble(a, b), maiorDouble(c, d));
    }

    public static double maiorDouble(double a, double b, double c, double d, double e) {
        return maiorDouble(maiorDouble(a, b, c, d), e);
    }
}
