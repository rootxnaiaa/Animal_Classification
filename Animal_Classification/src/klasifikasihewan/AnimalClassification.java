package klasifikasihewan;

import java.util.Scanner;
public class AnimalClassification {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Animal Classification System");
        System.out.println("=======================================");
        System.out.println("=========Made with love by naia========");
        System.out.println("Please choose the type of animal:");
        System.out.println("1. Warm blooded");
        System.out.println("2. Cold blooded");
        int choice1 = input.nextInt();
        Animal animal;
        switch (choice1) {
            case 1:
                System.out.println("Please choose the class of warm blooded animal:");
                System.out.println("1. Mammals");
                System.out.println("2. Birds");
                int choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        animal = new Mammal();
                        animal.printClass();
                        break;
                    case 2:
                        animal = new Bird();
                        animal.printClass();
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;
            case 2:
                System.out.println("Please choose the class of cold blooded animal:");
                System.out.println("1. Fish");
                System.out.println("2. Reptiles");
                System.out.println("3. Amphibians");
                choice2 = input.nextInt();
                switch (choice2) {
                    case 1:
                        animal = new Fish();
                        animal.printClass();
                        break;
                    case 2:
                        animal = new Reptile();
                        animal.printClass();
                        break;
                    case 3:
                        animal = new Amphibian();
                        animal.printClass();
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        input.close();
    }
}

class Animal {
    public void printClass() {
        System.out.println("Animal class");
    }
}

class WarmBloodedAnimal extends Animal {
    @Override
    public void printClass() {
        System.out.println("Warm blooded animal class");
    }
}

class ColdBloodedAnimal extends Animal {
    @Override
    public void printClass() {
        System.out.println("Cold blooded animal class");
    }
}

class Mammal extends WarmBloodedAnimal {
    @Override
    public void printClass() {
        System.out.println("Mammal class");
        System.out.println("The following mammals belong to the warm blooded class:");
        System.out.println("- Bear");
        System.out.println("- Tiger");
        System.out.println("- Whale");
    }
}

class Bird extends WarmBloodedAnimal {
    @Override
    public void printClass() {
        System.out.println("Bird class");
        System.out.println("The following birds belong to the warm blooded class:");
        System.out.println("- Ostrich");
        System.out.println("- Peacock");
        System.out.println("- Eagle");
    }
}

class Fish extends ColdBloodedAnimal {
    @Override
    public void printClass() {
        System.out.println("Fish class");
        System.out.println("The following fish belong to the cold blooded class:");
        System.out.println("- Salmon");
        System.out.println("- Gold Fish");
        System.out.println("- Guppy");
    }
}

class Reptile extends ColdBloodedAnimal {
    @Override
    public void printClass(){
        System.out.println("Reptiles class");
        System.out.println("The following fish belong to the cold blooded class : ");
        System.out.println("- Turtle");
        System.out.println("- Crocodile");
        System.out.println("- Snake");
    }
}

class Amphibian extends ColdBloodedAnimal {
    @Override
    public void printClass(){
        System.out.println("Amphibians class");
        System.out.println("The folllowing amphibians belong to the cold blooded class : ");
        System.out.println("- Frog");
        System.out.println("- Toad");
        System.out.println("- Newt");
    }
}
