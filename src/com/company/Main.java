package com.company;
/* Comment Program
 *Agnes Jett
 *04/19/2019
 */
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //String num = 0;
            int i = 0;
           int num = 0;

            String primeNumbers = "";

            for (i = 1; i <= 100; i++) {
                int counter = 0;
                for (num = i; num >= 1; num--) {
                    if (i % num == 0) {
                        counter = counter + 1;
                    }
                }
                if (counter == 2) {
                    //Appended the Prime number to the String
                    primeNumbers = primeNumbers + i + " ";
                    //primeNumbers= scanner.nextLine();
                }
            }
            System.out.println("Prime numbers from 1 to 100 are :");
            //num = scanner.nextLine();
            System.out.println(primeNumbers);
        }
    }
