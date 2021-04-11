package STEP8_DIMENSIONAL_ARRAYS;
import java.util.Random;
public class A1_Basic {
    public static void main(String[] args) {
        Random inputRandom=new Random();

        int dimensioanlArray[][];
        dimensioanlArray=new int[4][5];

        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                dimensioanlArray[i][j]=inputRandom.nextInt(10)+1;
            }
        }
        for (int i=0;i<4;i++){
            for (int j=0;j<5;j++){
                System.out.print(dimensioanlArray[i][j] + "-");
            }
            System.out.println();
        }
    }
}
