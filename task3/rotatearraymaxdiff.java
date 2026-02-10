import java.util.*;
public class rotatearraymaxdiff{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter array size");
int n=sc.nextInt();
int[] arr=new int[n];
System.out.println("enter array values");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.println("enter no of rotations");
int k=sc.nextInt();
int[] rotated=new int[n];
for(int i=0;i<n;i++){
rotated[(i+k)%n]=arr[i];
}
int maxdiff=0;
for(int i=0;i<n-1;i++){
int diff=Math.abs(rotated[i]-rotated[i+1]);
if(maxdiff<diff){
maxdiff=diff;
}
}
System.out.println("maximum absolute difference:"+maxdiff);
}
}