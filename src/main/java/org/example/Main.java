package org.example;

import  java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput;

        logger.info("Program Started. Displaying pattern menu");

        System.out.println("\nPlease select a pattern to view. \n\n 01. Star Pattern - i\n 02. Reverse Star Pattern - i \n 03. Star Pattern - ii\n 04. Star Pattern - iv\n 05. Star Pattern - v\n" +
                " 06. Triangle Star Pattern\n 07. Right Arrow Head\n 08. Diamond Shape Pattern\n 09. Triangle Outline\n 10. Reverse Z Pattern\n 11. Square Outline Pattern\n 12. Z Pattern\n"
        );
        System.out.print("Enter your choice pattern number :");

        userInput =  scanner.nextInt();
        logger.info("User input correctly, Entered number :{}",userInput);


        // starPattern01(5);
        //  reverseStarPattern01(5);
        //  starPattern03(3);
        //  starPattern04(6);
        //  starPattern05(6);
        // triangleStarPattern(6);
        // rightArrowHead(6);
        //  diamonShapePattern(6);
        // triangleOutline(8);
        //  reverseZPattern(5);
        //  squreOutlinePattern(5);
        // zPattern(5);

    }


    public static void starPattern01(int lineCount) {



        for (int i = 1; i <= lineCount; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println("");
        }

    }

    public static void reverseStarPattern01(int linecount) {


        for (int i = linecount; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void starPattern03(int n) {   // Squre Star pattern

        int i, j;

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void starPattern04(int n)    // sqare with middle blanks
    {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("");
                }

            }
            System.out.println("");
        }
    }


    public static void starPattern05(int n) {

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void triangleStarPattern(int n)   // Full Triangle
    {
        for(int i=0; i<n ; i++)
        {
            for(int j=i ; j<n ; j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<(i*2)-1;k++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void rightArrowHead(int n)
    {
        for(int i=0 ; i<n ; i++)
        {
            for(int j=0; j<=i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-1 ; i>0 ; i--)
        {
            for(int j=0 ; j<i ; j++)
            {
                System.out.print("*");
            }
            System.out.println("");
        }
    }


    public static void diamonShapePattern(int n)  // not finished last part of the diamond
    {
        for(int i=0; i<n ; i++)
        {
            for(int j=i ; j<=n ; j++)
            {
                System.out.print(" ");
            }

            for(int j=0 ; j<(2*i)-1 ; j++)
            {
                System.out.print("*");
            }

            System.out.println("");
        }
        for( int i=0 ; i<n ; i++)
        {
            for(int j=0 ; j<=i ; j++)
            {
                System.out.print(" ");
            }
            for(int j=i ; j<n*2-1; j++)
            {
                System.out.print("*");
            }


            System.out.println("");
        }
    }


    public static void triangleOutline(int lineCount)
    {
        for(int i=0 ; i<lineCount ; i++)
        {
            for(int j=lineCount ; j>i ; j--)
            {
                System.out.print(" ");
            }

            if(i==0||i==lineCount){
                for(int k = 0 ; k<=i ; k++)
                {
                    System.out.print("* ");
                }
            }
            else{
                System.out.print("*");

                for (int k = 1; k  <  i; k++) {
                    System.out.print("  ");
                }

                System.out.print(" *");
            }


            System.out.println();
        }
    }


    public static void reverseZPattern(int lineCount)
    {
        for(int i=0; i<lineCount ; i++)
        {
            for(int j=0;j<lineCount; j++)
            {
                if(i==0 || i==lineCount-1 ||i==j) {
                    System.out.print(" *");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void squreOutlinePattern(int lineCount)
    {
        for(int raw =0 ; raw<lineCount ; raw++)
        {
            for(int column = 0; column<lineCount ; column++)
            {
                if(raw==0 || raw ==lineCount-1 || column==0 || column==lineCount-1)
                {
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    public static void zPattern(int lineCount)
    {
        for(int raw=0; raw<lineCount;raw++)
        {
            for(int column=0; column<lineCount ; column++)
            {
                if( raw==0 || raw==lineCount-1     ) {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }
}