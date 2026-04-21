package div2A;//https://codeforces.com/problemset/problem/1903/Apackage div2A;
import java.util.*;
public class Solution {
    //saara equal y phir increasing
    //1 3 6 4
    // 3 2 1
    static boolean fn(int nums[], int k){
         int n=nums.length;
         boolean flag=true;

         for(int i=0;i<n-1;i++){
             if(nums[i]>nums[i+1]){
                 flag=false;
                 break;
             }
         }

        return flag ||  k >= 2;

    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            int nums[]=new int[n];
            int k=sc.nextInt();
            for(int i=0;i<n;i++){
                nums[i]=sc.nextInt();
            }
            if(fn(nums,k))System.out.println("YES");
            else System.out.println("NO");
        }
   }
}