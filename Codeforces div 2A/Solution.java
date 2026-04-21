//https://codeforces.com/problemset/problem/71/A
import java.util.*;
public class Solution {
    static String fn(String s){
        int count=0,n=s.length();
        if(n<=10) return s;
        for(int i=1;i<n-1;i++){
            count++;
        }
        StringBuilder sb=new StringBuilder();
        sb.append(s.charAt(0));
        sb.append(count);
        sb.append(s.charAt(n-1));
        return sb.toString();
    }
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            String s=sc.nextLine();
            System.out.println(fn(s));
        }
   }
}