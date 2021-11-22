package src.lesson6;

/**
 * Java1.HomeWorkSix
 *
 * @author Pavel.Stolyarov
 * @version 22.11.2021
 */

public class HomeWorkSix {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Cat();
        animals[1] = new Dog();

        System.out.println("The cat statistic");

        animals[0].name("Barsik");
        animals[0].runSize(175);
        animals[0].swimSize(100);

        System.out.println("The dog statistic");

        animals[1].name("Bobik");
        animals[1].runSize(250);
        animals[1].swimSize(8);
    }
}
abstract class Animal {

        protected String name;

        void name(String name) {
            this.name = name;
            System.out.println("Name: " + name);

        }

        abstract void runSize(int runSize);
        abstract void swimSize(int swimSize);
}

class Cat extends Animal {

        @Override
        void name(String name) {
            super.name(name);
        }

        @Override
        void runSize(int runSize) {
            if (runSize > 200)
                System.out.println(name + " cant run over 200m");
            else if (runSize < 0)
                System.out.println("Error: the value cant be negative");
            else if (runSize == 0)
                System.out.println(name + " stands still");
            else System.out.println(name + " ran " + runSize + "m");
        }

        @Override
        void swimSize(int swimSize) {
            System.out.println(name + " cant swim");
        }
}
class Dog extends Animal {

        @Override
        void name(String name) {
            super.name(name);
        }

        @Override
        void runSize(int runSize) {
            if (runSize > 500)
                System.out.println(name + " cant run over 500m");
            else if (runSize < 0)
                System.out.println(" Error: the value cant be negative");
            else if (runSize == 0)
                System.out.println(name + " stands still");
            else System.out.println(name + " ran " + runSize + "m");
        }

        @Override
        void swimSize(int swimSize) {
            if (swimSize > 10)
                System.out.println(name + " cant swim over 10m");
            else if (swimSize < 0)
                System.out.println(name + " Error: the value cant be negative");
            else if (swimSize == 0)
                System.out.println(name + " doesnt swim");
            else System.out.println(name + " swam " + swimSize + "m");
        }
}