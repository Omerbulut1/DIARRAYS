package STEP8_DIMENSIONAL_ARRAYS;
import java.util.Random;
public class A3_DIARRAY_Total {
    public static void main(String[] args) {


        Random inputRandom=new Random();

        int array1[][],array2[][],arrayResult[][],row,column;

        row=inputRandom.nextInt(9)+1;
        column=inputRandom.nextInt(9)+1;

        array1=new int[row][column];
        array2=new int[row][column];
        arrayResult=new int[row][column];
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                array1[i][j]=inputRandom.nextInt(9)+1;
                array2[i][j]=inputRandom.nextInt(9)+1;
            }
        }
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                arrayResult[i][j]=array1[i][j]+array2[i][j];
            }
        }

        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("ARTI");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(array2[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("RESULT=");
        for (int i=0;i<row;i++){
            for (int j=0;j<column;j++){
                System.out.print(arrayResult[i][j]+" ");
            }
            System.out.println();
        }




    }

}
