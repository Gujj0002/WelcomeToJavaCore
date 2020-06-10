package com.company;

public class Main {

    public static void main(String[] args) {

        // ASCII value

        for (int i=0; i<= 127; i++){

            System.out.printf("%d : %c \n",i,i);
        }


       // logic for loop with stars pattern

        for (int i = 1; i <= 4; i++) { // Rows

            for (int j = 1; j <= 4; j++) { // columns

                int k = i + j - 1;
                if (k > 4)
                    System.out.printf(k - 4 + " ");
                 else
                    System.out.printf(k + " ");
            }
            System.out.println("");
        }
        System.out.println("");


        int i;
        int j;

        for (i = 1; i <= 5; i++){

            for (j = 1; j <= i; j++){

                if ((i + j) %2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println("");
        }
        System.out.println("");

    }
}
