import java.util.Scanner;
public class Matrix {
    int MatrixSize;
    Scanner scanner = new Scanner(System.in);
    int matrix[][];
    int matrix2[][];
    int fionn=0;
    int newmatrix[][];




    public Matrix(int MatrixSize) {
        this.MatrixSize = MatrixSize;


        matrix = new int[MatrixSize][MatrixSize];
        matrix2 = new int[MatrixSize][MatrixSize];

        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++) {
                System.out.println("enter number for " +row+","+ colum);
                matrix[row][colum] = scanner.nextInt();
            }
        }

        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++){
                System.out.print("\t"+matrix[row][colum]);
            }
            System.out.println();

        }

        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++) {
                System.out.println("enter number for " +row+","+ colum);
                matrix2[row][colum] = scanner.nextInt();
            }
        }


        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++){
                System.out.print("\t"+matrix2[row][colum]);
            }
            System.out.println();

        }

        System.out.println("would u like to \n1. add two matrices\n2. subtract two matrices\n3. multiply two matrices");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println();
                add();

                break;
            case 2:
                System.out.println();
                break;
            case 3:
                System.out.println();
                break;

            case 4:
                System.out.println();
                square();
                break;

            default:
                System.out.println("invalid choice");
                break;

        }



    }

    public void square(){
        int[][] newmatrix = new int[MatrixSize][MatrixSize];

        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++) {
                for (int counter = 0;counter<MatrixSize;counter++) {

                    int b = matrix[counter][colum]*matrix2[row][counter];
                    fionn += b;
                }
                newmatrix[row][colum]= fionn;
                fionn=0;
            }
        }

        System.out.println("product of matrix is:");
        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++){
                System.out.print("\t"+newmatrix[row][colum]);
            }
            System.out.println();
        }
        System.out.println();
    }




    public void add(){
        int[][] newmatrix = new int[MatrixSize][MatrixSize];

        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++) {


                    int b = matrix[row][colum]+matrix2[row][colum];
                newmatrix[row][colum]= b;
            }
        }




    }




}


