package STEP8_DIMENSIONAL_ARRAYS;
import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.Random;
public class A1_DIARRAY_Random_Row_Column {
    public static void main(String[] args) {
        Random inputRandom=new Random();
        int dimonsionalArray[][];
        dimonsionalArray=new int[inputRandom.nextInt(10)+1][inputRandom.nextInt(10)+1];

        for (int iRow=0;iRow<dimonsionalArray.length;iRow++){
            for (int jColumn=0;jColumn<dimonsionalArray[0].length;jColumn++){
                dimonsionalArray[iRow][jColumn]= inputRandom.nextInt(9)+1;
            }
        }
        for (int iRow=0;iRow<dimonsionalArray.length;iRow++){
            for (int jColumn=0;jColumn<dimonsionalArray[0].length;jColumn++){
                System.out.print(dimonsionalArray[iRow][jColumn] + "-");
            }
            System.out.println();
        }
        System.out.println("satir sayisi=" + dimonsionalArray.length + "sutun sayisi= " + dimonsionalArray[0].length);
    }
}
