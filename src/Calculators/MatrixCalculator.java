package Calculators;

import Menu.Calculators;

import java.util.Scanner;

public class MatrixCalculator extends Calculators {

    Scanner scanner = new Scanner(System.in);

    private int[][] matrix;
    private int[][] matrix2;
    private int matrixSize;
    private int sumResult = 0;
    private int[][] newMatrix;

//overrides runCalculator to perform matrix calculations
    @Override
    public void runCalculator() {
        System.out.println("enter size of a square matrix (e.g 3 for a 3x3 Matrix):");
        matrixSize = scanner.nextInt();
//initialize matrix based on inputted size 
        matrix = new int[matrixSize][matrixSize];
        matrix2 = new int[matrixSize][matrixSize];
//input values for first matrix
      for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                while (true) {
                    System.out.println("Enter number for " + row + "," + colum);
                    try {
                        matrix[row][colum] = scanner.nextInt();//fills in matrix1
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error:please enter a valid integer");
                        scanner.next();
                    }
                }
            }
        }
//displays matrix 1 
        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + matrix[row][colum]);
            }
            System.out.println();

        }
        //input values for matrix 2
        System.out.println("matrix #2");
        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
            while (true) {

                    System.out.println("Enter number for " + row + "," + colum);
                    try {
                        matrix2[row][colum] = scanner.nextInt();
                        break;
                    } catch (NumberFormatException e) {
                        System.out.println("Error:please enter a valid integer");
                        scanner.next();
                    }

                }
            }
        }

//displays matrix2
        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + matrix2[row][colum]);
            }
            System.out.println();

        }

        System.out.println("would you like to \n1 - add these matrices\n2 - subtract these matrices\n3 - multiply these matrices");
        scanner.nextLine();
        String choice = scanner.nextLine();
        switch (choice) {//handles users choice 
            case "1":
                System.out.println();
                add();
                break;
            case "2":
                subtract();
                System.out.println();
                subtract();
                break;
            case "3":
                System.out.println();
                square();
                break;
            default:
                System.err.println("Invalid choice");
                break;
        }

    }
//method to perform squaring of matrix 
    public void square() {
        int[][] newMatrix = new int[matrixSize][matrixSize];//creates a newMatrix to store 

        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                for (int counter = 0; counter < matrixSize; counter++) {
                    int b = matrix[counter][colum]*matrix2[row][counter];
                    sumResult += b;
                }
                newMatrix[row][colum]= sumResult;
                sumResult=0;
            }
        }
        System.out.println(newMatrix[0][0]);
//prints out product of matrixes
        System.out.println("product of matrix is:");
        for (int row = 0; row < matrixSize; row++) {
            for (int colum = 0; colum < matrixSize; colum++) {
                System.out.print("\t" + newMatrix[row][colum]);//prints our matrix
            }
            System.out.println();
        }
        System.out.println();
    }
//method to perform matrix addition
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
//method to perform matrix subtraction
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
