/*
 * System.out.println:
 * println is a method of PrintStream class
 * out is a static object of of PrintStream class 
 * out object is created in System class
 * in is a static object created inn System class
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInputBufferReaderScanner {
    public static void main(String[] args) throws IOException {
        // First Way of Reading the Input Number
        // System.out.println("Enter a Number:");
        // int num = System.in.read(); //Reading the ASCII value and only one character
        // at a time
        // System.err.println(num-48);

        // Second Way of Reading the Input Number
        // System.out.println("Enter a Number");
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader br = new BufferedReader(in);
        // int num = Integer.parseInt(br.readLine()) ;//Converting string to integer

        // System.out.println(num);
        // br.close();
        // in.close();

        // Third Way of Reading the Input Number
        System.out.println("Enter the second Number");
        Scanner sc = new Scanner(System.in);
        int num2 = sc.nextInt();
        System.out.println(num2);

    }
}
