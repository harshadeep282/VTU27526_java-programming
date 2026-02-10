import java.util.Scanner;
class slidingwindowmax{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int n=sc.nextInt();
int[] nums=new int[n];
System.out.println("enter array values");
for(int i=0;i<n;i++){
num[i]=sc.nextInt();
}
System.out.println("enter the window size");
int k=nextInt();
int[] result =new int[n-k+1];
for(int i=0;i<=n-k;i++){
int max=nums[i];
for(int j=i;j<i+k;j++){
if(nums[j]>max){
max = nums[j];
}
}
result[i]=max;
}
for(int i=0;i<result.length;i++){
System.out.println(result[i]+"");
}
}
}