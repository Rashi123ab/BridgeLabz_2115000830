import java.util.*;
public class Age{
public static void main(String[]args){
int[]ages=new int[10];
Scanner sc=new Scanner(System.in);
for(int i=0;i<ages.length;i++){
System.out.println("Enter age for student: ");
ages[i]=sc.nextInt();
}
for(int a:ages){
if(a<0){
System.out.println("Invalid age");
}else if(a>=18){
System.out.println("The student with the age " + a+" can vote");
}else{
System.out.println("The student with the age "+a+" cannot vote");
}
}
}
}
