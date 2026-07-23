// Main class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }

    void move() {
        System.out.println("This animal moves in its own way.");
    }
}

// Subclass 1: Dog
class Dog extends Animal {
    @Override
    void move() {
        System.out.println("The dog runs.");
    }

    void bark() {
        System.out.println("The dog barks.");
    }
}

// Subclass 2: Cat
class Cat extends Animal {
    @Override
    void move() {
        System.out.println("The cat walks silently.");
    }

    void meow() {
        System.out.println("The cat meows.");
    }
}

// Subclass 3: Bird
class Bird extends Animal {
    @Override
    void move() {
        System.out.println("The bird flies.");
    }

    void chirp() {
        System.out.println("The bird chirps.");
    }
}

// Subclass 4: Fish
class Fish extends Animal {
    @Override
    void move() {
        System.out.println("The fish swims.");
    }

    void swim() {
        System.out.println("The fish swims in water.");
    }
}

public class animaltest {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Fish fish = new Fish();

        System.out.println("Dog:");
        dog.eat();
        dog.move();
        dog.bark();

        System.out.println("\nCat:");
        cat.eat();
        cat.move();
        cat.meow();

        System.out.println("\nBird:");
        bird.eat();
        bird.move();
        bird.chirp();

        System.out.println("\nFish:");
        fish.eat();
        fish.move();
        fish.swim();
    }
}