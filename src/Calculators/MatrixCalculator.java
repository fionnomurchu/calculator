package Calculators;

import Menu.Calculators;

import java.util.Scanner;

public class MatrixCalculator extends Calculators {

    Scanner scanner = new Scanner(System.in);
    int[][] matrix;
    int[][] matrix2;
    int matrixSize;
    int fionn = 0;
    int[][] newMatrix;


    @Override
    public void runCalculator() {
        System.out.println("enter size of a square matrix:");
        int matrixSize = scanner.nextInt();

        matrix = new int[matrixSize][matrixSize];
        matrix2 = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.println("Enter number for " + row + "," + colum);
                matrix[row][colum] = scanner.nextInt();
            }
        }

        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + matrix[row][colum]);
            }
            System.out.println();

        }

        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.println("Enter number for " + row + "," + colum);
                matrix2[row][colum] = scanner.nextInt();
            }
        }


        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + matrix2[row][colum]);
            }
            System.out.println();

        }

        System.out.println("1 - add two matrices\n2 - subtract two matrices\n3 - multiply two matrices");
        scanner.nextLine();
        String choice = scanner.nextLine();
        switch (choice) {
            case "1":
                System.out.println();
                add();
                break;
            case "2":
                subtract();
                System.out.println();
                break;
            case "3":
                System.out.println();
                break;
            case "4":
                System.out.println();
                square();
                break;
            default:
                System.out.println("invalid choice");
                break;

        }

    }

    public void square() {
        int[][] newMatrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                for (int counter = 0; counter < matrixSize; counter++) {

                    int b = matrix[counter][colum] * matrix2[row][counter];
                    fionn += b;
                }
                newMatrix[row][colum] = fionn;
                fionn = 0;
            }
        }

        System.out.println("product of matrix is:");
        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + newMatrix[row][colum]);
            }
            System.out.println();
        }
        System.out.println();
    }

    public void add() {
        int[][] newmatrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {


                int b = matrix[row][colum] + matrix2[row][colum];
                newmatrix[row][colum] = b;
            }
        }
        System.out.println("Sum of matrices is:");
        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + newmatrix[row][colum]);
            }
            System.out.println();
        }
    }

    public void subtract() {
        int[][] newmatrix = new int[matrixSize][matrixSize];

        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                int b = matrix[row][colum] - matrix2[row][colum];
                newmatrix[row][colum] = b;
            }
        }

        System.out.println("Difference of matrices is:");
        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + newmatrix[row][colum]);
            }
            System.out.println();


        }
    }
}
