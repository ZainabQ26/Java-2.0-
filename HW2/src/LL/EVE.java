package LL;
import java.util.Scanner;

public class EVE {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of suitors: ");
        int n = scanner.nextInt();
        CLL suitorsList = new CLL();
        for (int i = 1; i <= n; i++) {
            suitorsList.addSuitor(i);
        }
        int luckyWinner = suitorsList.eliminateSuitors(3);
        System.out.println("\n      Suitor " + luckyWinner + " is the lucky winner!");
    }
}

