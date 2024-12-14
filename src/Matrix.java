import java.util.Scanner;
public class Matrix {
    int MatrixSize;
    Scanner scanner = new Scanner(System.in);
    int matrix[][];
    int fionn=0;
    public Matrix(int MatrixSize) {
        this.MatrixSize = MatrixSize;


        matrix = new int[MatrixSize][MatrixSize];
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

        System.out.println("would you like to multiply by a new matrix or square current");


        square();

    }

    public int square(){
        int[][] newmatrix = new int[MatrixSize][MatrixSize];

        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++) {
                for (int counter = 0;counter<MatrixSize;counter++) {

                    int b = matrix[counter][colum]*matrix[row][counter];
                    fionn += b;
                }
                newmatrix[row][colum]= fionn;
                fionn=0;
            }
        }

        System.out.println("square of matirx is:");
        for (int row = 0; row < MatrixSize; row++) {
            for (int colum = 0; colum < MatrixSize; colum++){
                System.out.print("\t"+newmatrix[row][colum]);
            }
            System.out.println();
        }
        System.out.println();

        return 1;
    }




}


