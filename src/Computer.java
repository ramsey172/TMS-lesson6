public class Computer {
    String model;
    double price;
    Ram ram;
    Hdd hdd;

    Computer(String model, double price) {
        this.model = model;
        this.price = price;
        this.ram = new Ram();
        this.hdd = new Hdd();
    }

    Computer(String model, double price, Ram ram, Hdd hdd){
        this.model = model;
        this.price = price;
        this.ram = ram;
        this.hdd = hdd;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", ram=" + ram.toString() +
                ", hdd=" + hdd.toString() +
                '}';
    }

    public static void main(String[] args) {
        Computer computer1 = new Computer("ASUS", 2500);
        System.out.println(computer1);

        Ram ram = new Ram("DDR5", 32);
        Hdd hdd = new Hdd("TOSHIBA", 1024, "Внутрениий");
        Computer computer2 = new Computer("HP", 4500, ram, hdd);
        System.out.println(computer2);
    }
}


class Ram {
    String name;
    int capacity;


    Ram() {
        this.name = "DDR5";
        this.capacity = 16;
    }

    Ram(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Ram{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}

class Hdd {
    String name;
    int capacity;
    String type;


    Hdd() {
        this.name = "SEAGATE";
        this.capacity = 512;
        this.type = "Внешний";
    }

    Hdd(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Hdd{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", type=" + type +
                '}';
    }
}
