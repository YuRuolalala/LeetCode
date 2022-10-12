package guanglianda;


import java.util.Scanner;

/**
 * 小树在生日那天收到一个特别的礼物，是一个长度为 n 的数列。这个数列有一个神奇的性质，
 * 数列中任意两个奇偶性不同的数的位置可以被交换。小树想知道经过任意次变换后（或者不变）
 * 可以得到的字典序最小的数列是什么。
 *
 * 对于两个数列 a、b，第 i 个数分别为 ai ,bi，a 的字典序小于 b 的字典序当且仅当存在一个位置 k，
 * ak<bk，且当 i 小于 k 时 ai=bi。
 *
 * 输入：
 * 第一行有一个整数 n（1<=n<=105），代表数列长度。
 * 第二行有 n 个整数a1,a2,...,an（1<=ai<=109），代表数列中的元素。
 * 输出：
 * 输出 n 个整数，代表能得到的字典序最小的数列。
 */
public class test01 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        for(int i=0;i<n-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print(arr[n-1]);



    }
}
