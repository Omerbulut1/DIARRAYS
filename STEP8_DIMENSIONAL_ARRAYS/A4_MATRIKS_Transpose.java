package STEP8_DIMENSIONAL_ARRAYS;
import java.util.Random;
public class A4_MATRIKS_Transpose {
    public static void main(String[] args) {
        Random inputRandom=new Random();

        int array[][],arrayTranspose[][];
        array=new int[inputRandom.nextInt(5)+1][inputRandom.nextInt(5)+1];
        arrayTranspose=new int[array[0].length][array.length];

        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                array[i][j]= inputRandom.nextInt(9)+1;
            }
        }
        for (int i=0;i<array[0].length;i++){
            for (int j=0;j<array.length;j++){
                arrayTranspose[j][i]=array[i][j];
            }
        }
        for (int i=0;i<array.length;i++){
            for (int j=0;j<array[0].length;j++){
                System.out.print(array[i][j] + "-");
            }
            System.out.println();
        }
        for (int i=0;i<array[0].length;i++){
            for (int j=0;j<array.length;j++){
                System.out.print(arrayTranspose[j][i] + "-");
            }
            System.out.println();
        }


    }
}
