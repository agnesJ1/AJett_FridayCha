package com.company;
/* Comment Program
 *Agnes Jett
 *04/19/2019
 */

public class Main {
    public static void main(int n) {
        int i, m = 0, flag = 0;
        m = n / 2;
        if (n == 0 || n == 1) {
            System.out.println(n + " is not prime number");
        } else {
            for (i = 2; i <= m; i++) {
                if (n % i == 0) {
                    System.out.println(n + " is not prime number");
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(n + " is prime number");
            }
        }//end of else
    }

    public static void main(String args[]) {
        main(1);
        main(2);
        main(3);
        main(4);
        main(5);
        main(6);
        main(7);
        main(8);
        main(9);
        main(10);
    }
}