package oop;

public class Animal {
  public void eat() {
    System.out.println("I can eat");
  }
}

class Dog extends Animal {
  public static void main(String[] args) {
    Dog myDog = new Dog();
    myDog.eat();
  }
}


 