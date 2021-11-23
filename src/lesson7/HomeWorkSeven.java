package src.lesson7;

/**
 * Java1.HomeWorkSeven
 *
 * @author Pavel.Stolyarov
 * @version 23.11.2021
 */
class HomeWorkSeven {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat("Barsik", 15),
                new Cat("Fluffy", 25),
                new Cat("Big Boss", 40),
                new Cat("Murzik", 8),
                new Cat("Vasiliy", 1)
        };
        Plate plate = new Plate(50);

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }

        plate.info();
        plate.addFood(39);
        plate.info();

        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();

        }
        plate.info();
    }
}

class Cat {
    String name;
    int appetite;
    boolean satiety;

    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = true;
    }

    void info() {
        String isSatiety = !satiety ? "fed up" : "hungry";
        System.out.println(name + ": " + isSatiety);

    }
    void eat(Plate plate) {
        if (satiety && plate.decreaseFood(appetite))
            satiety = false;
    }
}

class Plate {
    int food;

    Plate(int food) {
        this.food = food;
    }

    boolean decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }

    void addFood(int food) {
        System.out.println("Adding food");
        this.food += food;
    }

    void info() {
        System.out.println("plate: " + food);
    }
}
