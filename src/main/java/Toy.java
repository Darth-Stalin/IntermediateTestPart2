public class Toy implements Comparable<Toy>{


    int id;

    String name;
    int quantity;
    int frequency;
    public Toy() {

    }

    public Toy(int id, String name, int quantity, int frequency) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.frequency = frequency;
    }

    @Override
    public int compareTo(Toy o) {
        return Integer.compare(o.quantity, this.quantity); // Сортировка по убыванию количества
    }
}