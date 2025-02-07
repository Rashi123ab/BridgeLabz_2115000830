class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void makeSound(){
        System.out.println("Animal makes sound");
    }
}
class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("bark");
    }
}
class Cat extends Animal{
    Cat(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("meow");
    }
}
class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);
    }
    public void makeSound(){
        System.out.println("fly");
    }

    public static void main(String[] args) {
        Animal dog = new Dog("Jimmy", 3);
        Animal cat = new Cat("kitty", 2);
        Animal bird = new Bird("Mitthu", 1);
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}
