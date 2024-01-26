package fibonacciSuite;

public class CalculMethods {

    // Classic methode
    public void calculClassique(int nbrTerme) {
        int firstValue = 0;
        int secondValue = 1;
        for (int i = 0; i < nbrTerme; i++) {
            System.out.println(firstValue + "");
            int sum = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = sum;
        }
    }

    // Recursive methode
    public  int recursionCalcul(int n) {
        if (n <= 1) {
            return n;
        } else {
            return recursionCalcul(n - 1) + recursionCalcul(n - 2);
        }
    }
}