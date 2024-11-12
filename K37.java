package pkg1;
class Animal {
    void sound() { System.out.println("animal"); }
}
class Dog extends Animal {
    @Override void sound()
    {
        System.out.println("Dog can bark");
    }
}
public class K37{
    public static void main(String[] args)
    {
        Animal obj1 = new Animal();
        obj1.sound();
        Dog obj2 = new Dog();
        obj2.sound();
    }
}