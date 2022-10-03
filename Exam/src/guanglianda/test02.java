package guanglianda;

import java.util.Scanner;

/**
 * 小A有一个由 0 到 9 组成的幸运数字串 S ，他每次在游戏里抽卡之前都会用这个串进行占卜。
 * 在占卜时，他会先随机出一个幸运数 k ，然后随机选出数字串 S 中的一些位置并将这些位置上的数按顺序拼起来。
 * 如果最终所得的数字可以被幸运数 k 整除，那么他会觉得自己这次抽卡出货概率很大，就会下血本进行抽卡。
 * 在数次尝试之后，他开始怀疑占卜流程的可靠性。现在他给了你幸运数 k 和幸运串 S ，
 * 他想知道有多少种挑选位置的方法可以使其得出抽中概率大的结论。
 * 即，串 S 中有多少个非空子序列组成的十进制数能够被 k 整除。
 *
 * 输入：
 * 第一行有两个正数n,k(2<=n<=1000,1<=k<=10000)，分别代表串 S的长度和幸运数 k 。
 * 第二行有一个长度为 n 的字符串 S ，仅由字符 0 到 9 组成。
 *
 * 输出：
 * 输出一个非负整数，代表所求的答案。因为答案可能很大，你只需要输出答案除以1000000007所得的余数。
 */

public class test02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
//        System.out.println();
        String s=in.next();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=(int)s.charAt(i);
        }
        int count=0;

        for(int i=0;i<n;i++){
            if(arr[i]%3==0){
                count++;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if((arr[i]*10+arr[j])%3==0){
                    count++;
                }
            }
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int x=j+1;x<n;x++){
                    if((arr[i]*100+arr[j]*10+arr[x])%3==0){
                        count++;
                    }
                }
            }
        }


        System.out.println(count);

    }
}
