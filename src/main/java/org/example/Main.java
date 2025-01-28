package org.example;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int userInput, lineCount;


        logger.info("Program Started. Displaying pattern menu");

        System.out.println("\nPlease select a pattern to view. " +
                "\n\n 01. Star Pattern - i\n" +
                " 02. Reverse Star Pattern - i \n" +
                " 03. Star Pattern - ii\n" +
                " 04. Star Pattern - iv\n" +
                " 05. Star Pattern - v\n" +
                " 06. Triangle Star Pattern\n" +
                " 07. Right Arrow Head\n" +
                " 08. Diamond Shape Pattern\n" +
                " 09. Triangle Outline\n" +
                " 10. Reverse Z Pattern\n" +
                " 11. Square Outline Pattern\n" +
                " 12. Z Pattern\n"
        );
        System.out.print("Enter your choice pattern number :");

        userInput = scanner.nextInt();
        logger.info("Pattern Selected, Entered number :{}", userInput);

        System.out.print("Enter the line count: ");
        lineCount = scanner.nextInt();
        logger.info("Line count entered, Line count :{}", lineCount);

        try {
            switch (userInput) {
                case 1:
                    starPattern01(lineCount);
                    logger.error("Hi this is a test");
                    break;
                case 2:
                    reverseStarPattern01(lineCount);
                    break;
                case 3:
                    starPattern03(lineCount);
                    break;
                case 4:
                    starPattern04(lineCount);
                    break;
                case 5:
                    starPattern05(lineCount);
                    break;
                case 6:
                    triangleStarPattern(lineCount);
                    break;
                case 7:
                    rightArrowHead(lineCount);
                    break;
                case 8:
                    diamonShapePattern(lineCount);
                    break;
                case 9:
                    triangleOutline(lineCount);
                    break;
                case 10:
                    reverseZPattern(lineCount);
                    break;
                case 11:
                    squreOutlinePattern(lineCount);
                    break;
                case 12:
                    zPattern(lineCount);
                    break;
                default:
            }

            logger.info("Program finished.");

        } catch (Exception e) {

            logger.error("There is an error, while printing patterns : {}", e.getMessage(), e);
        }
    }


    public static void starPattern01(int lineCount) {

        StringBuilder stars = new StringBuilder();

        for (int i = 1; i <= lineCount; i++) {

            for (int j = 0; j < i; j++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }

    }

    public static void reverseStarPattern01(int linecount) {


        StringBuilder stars = new StringBuilder();

        for (int i = linecount; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }

    public static void starPattern03(int n) {   // Square Star pattern

        int i, j;
        StringBuilder stars = new StringBuilder();

        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }


    public static void starPattern04(int n)    // square with middle blanks
    {
        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 0 || j == 0 || i == n - 1 || j == n - 1) {
                    stars.append("*");
                } else {
                    stars.append("");
                }

            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }


    public static void starPattern05(int n) {

        StringBuilder stars = new StringBuilder();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }

        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }


    public static void triangleStarPattern(int n)   // Full Triangle
    {
        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                stars.append(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }


    public static void rightArrowHead(int n) {

        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
        for (int i = n - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                stars.append("*");
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }


    public static void diamonShapePattern(int n)  // not finished last part of the diamond
    {
        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = i; j <= n; j++) {
                stars.append(" ");
            }

            for (int j = 0; j < (2 * i) - 1; j++) {
                stars.append("*");
            }

            logger.info(stars.toString());
            stars.setLength(0);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                stars.append(" ");
            }
            for (int j = i; j < n * 2 - 1; j++) {
                stars.append("*");
            }


            logger.info(stars.toString());
            stars.setLength(0);
        }
    }


    public static void triangleOutline(int lineCount) {

        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < lineCount; i++) {
            for (int j = lineCount; j > i; j--) {
                stars.append(" ");
            }

            if (i == 0 || i == lineCount) {
                for (int k = 0; k <= i; k++) {
                    stars.append("* ");
                }
            } else {
                stars.append("*");

                for (int k = 1; k < i; k++) {
                    stars.append("  ");
                }

                stars.append(" *");
            }


            logger.info(stars.toString());
            stars.setLength(0);
        }
    }


    public static void reverseZPattern(int lineCount) {

        StringBuilder stars = new StringBuilder();

        for (int i = 0; i < lineCount; i++) {
            for (int j = 0; j < lineCount; j++) {
                if (i == 0 || i == lineCount - 1 || i == j) {
                    stars.append(" *");
                } else {
                    stars.append("  ");
                }
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }

    public static void squreOutlinePattern(int lineCount) {

        StringBuilder stars = new StringBuilder();

        for (int raw = 0; raw < lineCount; raw++) {
            for (int column = 0; column < lineCount; column++) {
                if (raw == 0 || raw == lineCount - 1 || column == 0 || column == lineCount - 1) {
                    stars.append("* ");
                } else {
                    stars.append("  ");
                }
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }

    public static void zPattern(int lineCount) {

        StringBuilder stars = new StringBuilder();

        for (int raw = 0; raw < lineCount; raw++) {
            for (int column = 0; column < lineCount; column++) {
                if (raw == 0 || raw == lineCount - 1) {
                    stars.append("* ");
                } else {
                    stars.append("  ");
                }
            }
            logger.info(stars.toString());
            stars.setLength(0);
        }
    }
}