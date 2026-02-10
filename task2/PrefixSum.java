import java.util.Scanner;
public class PrefixSum {
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
System.out.print("Enter array size:");
int n =sc.nextInt();
int[] arr=new int[n];
int[] prefixSum=new int[n];
System.out.println("Ener array elements:");
for (int i =0;i<n;i++){
arr[i]=sc.nextInt();
}
prefixSum[0]=arr[0];
for(int i =1;i<n;i++){
prefixSum[i] = prefixSum[i-1]+arr[i];
}
System.out.println("Presix Sum Array:");
for(int i=0;i<n;i++){
System.out.print(prefixSum[i] + " ");
}
}
}