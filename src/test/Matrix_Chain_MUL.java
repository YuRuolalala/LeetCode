package test;

public class Matrix_Chain_MUL {

    public static void MatrixChainMUL(int[] a) {
        int n=a.length-1;
        int[][] dp= new int[n+1][n+1];
        int[][] s = new int[n+1][n+1];
        int i,j,k,t;

        for(i=0;i<=n;i++) {
            dp[i][i]=0;
        }
        for(i=0;i<=n;i++) {
            s[i][i]=0;
        }

        for(t=2;t<=n;t++) {//从两个矩阵相乘开始，直到n个矩阵相乘
            for(i=1;i<=n-t+1;i++) {//从最坐边的第一个矩阵开始
                j=i+t-1;//j是三个元素相乘的最后一个元素的位置

                dp[i][j]=Integer.MAX_VALUE;

                for(k=i;k<=j-1;k++) {//在i和j—1之间找到一个最优k值
                    int temp=dp[i][k]+dp[k+1][j]+a[i-1]*a[k]*a[j];

                    if(temp<dp[i][j]) {
                        dp[i][j]=temp;//记下当前最小代价
                        s[i][j]=k;//记下当前是哪个矩阵
                    }

                }

            }

        }

        System.out.println("最小代价为");
        System.out.println(dp[1][n]);
        System.out.println("计算顺序为");
        MatrixSort(s,1,n);
        System.out.println("");

//        for(i=0;i<=n;i++){
//            for(j=0;j<=n;j++){
//                System.out.print(dp[i][j]+"     \t");
//            }
//            System.out.println();
//        }



    }

    public static void MatrixSort(int[][] s,int i,int j) {
        if(i==j) {
            System.out.print('A');
            System.out.print(i);

        }
        else {
            System.out.print('(');
            MatrixSort(s,i,s[i][j]);
            MatrixSort(s,s[i][j]+1,j);
            System.out.print(')');

        }
    }

    public static void main(String[] args) {
        int[] a = { 30,35,15,5,10,20,25 };
        int[] b = { 2, 7, 3, 6, 10 };
        int[] c = { 10, 3, 15, 12, 7, 2 };
        int[] d = { 7, 2, 4, 15, 20, 5 };


        System.out.println("<30,35,15,5,10,20,25>");
        MatrixChainMUL(a);
        System.out.println("<2, 7, 3, 6, 10>");
        MatrixChainMUL(b);
        System.out.println("<10, 3, 15, 12, 7, 2>");
        MatrixChainMUL(c);
        System.out.println("<7, 2, 4, 15, 20, 5>");
        MatrixChainMUL(d);

    }
}