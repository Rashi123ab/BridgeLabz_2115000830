public class AreaOfCircle{
   public static void main(String args[]){
      CircleArea c=new CircleArea(5);
      c.area();
      c.circumference();
   }
}

class CircleArea{
     double radius;
     public CircleArea(double radius){
        this.radius=radius;
     }
     public void area(){
         System.out.println("Area of circle is "+(3.14*radius*radius));
     }
     public void circumference(){
         System.out.println("Circumference of circle is "+(2*3.14*radius));
     }
}

