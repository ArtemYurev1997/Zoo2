package by.pvt.zoopark;

public class Lion extends Animals {
    private String name;
    private String breed;
    private int weight;
    private int id;

    public Lion(String name, String breed, int weight, String color, int maxLife, String typeOfEat) {
        super( color, maxLife, typeOfEat);
        id = 0;
        this.name = name;
        this.breed = breed;
        this.weight = weight;
    }

    public void setId() {
        id = nextId;
        nextId++;
    }
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void rychyat() {
        System.out.println(getName() + " �����");
    }
    public void kusat() {
        System.out.println(getName() +" ������");
    }
    public void begat() {
        System.out.println(getName() + " ������");
    }
    public void igrat() {
        System.out.println(getName() + " ������");
    }
    public void prygat() {
        System.out.println(getName() + " �������");
    }

    public String toString() {

        return "���: " + name + "  " + "������: " + breed + "  " + "�����: " + weight + "  " + super.toString();
    }
    @Override
    public void sound() {
        rychyat();
    }
    public void play() {
        igrat();
    }
}
