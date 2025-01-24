import java.util.*;
public class CheckNum{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int[]num=new int[5];
for(int i=0;i<num.length;i++){
System.out.println("Enter the number :");
num[i]=sc.nextInt();
}
for(int 
n:num){
if(n>0){
if(n%2==0){
System.out.println("Even Number");
}else{
System.out.println("Odd Number");
}
}else if(n<0){
System.out.println("Negative Number");
}else{
System.out.println("Zero");
}
}
if(num[0]==num[4]){
System.out.println("The first and last number are equal");
}else if(num[0]>num[4]){
System.out.println("The first number is greater than last number");
}else{
System.out.println("The first number is smaller than the last number");
}
}
}
