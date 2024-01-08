import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la dimensione: ");
        int n = scanner.nextInt();
        int[] a = new int[n];

        System.out.println("Inserisci gli elementi:");
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.print("Inserisci valore di k: ");
        int k = scanner.nextInt();

        // Chiamo il metodo "divisori"
        int[] b = divisori(a, k);

        // Stampo
        System.out.println("Array (divisibile per " + k + "):");
        for (int i : b) {
            System.out.print(i + " ");
        }
    }

    // Conto il numero di numeri divisibili per k
    public static int[] divisori(int[] a, int k) {
        int contatore = 0;
        for (int num : a) {
            if (num % k == 0) {
                contatore=contatore+1;
            }
        }

        int[] b = new int[contatore];
        int indice = 0;

        for (int num : a) {
            if (num % k == 0) {
                b[indice+1] = num;
            }
        }

        return b;
    }
}
