/*
 * finally is generally used for closing the resources
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FinallyConcept {
    public static void main(String[] args) throws NumberFormatException, IOException {

        int num = 0;

        // try with resources
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

            System.out.println("Enter a number:");
            num = Integer.parseInt(br.readLine());
            System.out.println("Value of num is: " + num);
        }

        System.out.println("After Taking the Input");
    }
}
