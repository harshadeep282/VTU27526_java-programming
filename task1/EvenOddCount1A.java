import java.util.Scanner; 
class EvenOddCount1A { 
public static void main(String[] args) { 
Scanner sc = new Scanner(System.in); 
int even = 0, odd = 0; 
System.out.println("Enter 5 numbers:"); 
for(int i=0; i<5; i++){ 
int num = sc.nextInt(); 
if(num % 2 == 0) 
even++; 
else 
odd++; 
} 
System.out.println("Even numbers = " + even); 
System.out.println("Odd numbers = " + odd); 
} 
}