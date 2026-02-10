import java.util.*;
public class adjustedsum{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int n=sc.nextInt();
int[] arr=new int[n];
int evensum=0;
int oddsum=0;
int adjsum=0;
System.out.println("enter array values");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
if(arr[i]%2==0){
evensum+=arr[i];
}else{
oddsum+=arr[i];
}
}
adjsum=evensum-oddsum;
System.out.println("final adjusted sum:"+adjsum);
}
}