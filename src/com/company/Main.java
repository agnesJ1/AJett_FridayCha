package com.company;
/* Comment Program
 *Agnes Jett
 *04/19/2019
 */
import java.util.Scanner;
public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();



            for (int i = 1; i <= num;  i++) {
                int count= 0;
                for (int j = 1; j <= i/2; j++) {
                    if (i % j == 0)
                        count = count + 1;

                }
                if (count == 2) {
                    System.out.println(i+ " is a prime number");
                }
                else
                System.out.println(i+ " is a not prime number");
            }

        }
    }
