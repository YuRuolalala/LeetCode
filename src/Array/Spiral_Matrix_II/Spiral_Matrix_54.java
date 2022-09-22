package Array.Spiral_Matrix_II;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Spiral_Matrix_54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();

        int row=matrix.length-1;
        int column=matrix[0].length-1;
        int r=0,c=0;
        while(r<=row&&c<=column){
            for(int i=c;i<=column;i++){
                list.add(matrix[r][i]);
            }
            for(int j=r+1;j<=row;j++){
                list.add(matrix[j][column]);
            }
            if(r<row&&c<column){
                for(int k=column-1;k>=c;k--){
                    list.add(matrix[row][k]);
                }
                for(int m=row-1;m>r;m--){
                    list.add(matrix[m][c]);
                }
            }
            r++;
            row--;
            c++;
            column--;
        }

        return list;
    }

    @Test
    public void test(){
        int [][] arr={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        List<Integer> integers = spiralOrder(arr);

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
        }

        System.out.print(spiralOrder(arr));
    }
}
