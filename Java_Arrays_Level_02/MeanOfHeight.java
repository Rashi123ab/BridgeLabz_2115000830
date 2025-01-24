import java.util.*;
public class MeanOfHeight{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
double[]Heights=new double[11];
double sum=0;
for(int i=0;i<11;i++){
System.out.println("Enter the heights: ");
Heights[i]=sc.nextDouble();
sum+=Heights[i];
}
double Mean=sum/11;
System.out.println("Mean of Heights of Players :"+Mean);
}
}
