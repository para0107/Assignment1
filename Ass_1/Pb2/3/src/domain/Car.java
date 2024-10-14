package domain;

public class Car {
    private String model;
    private int year;
    private int hp;
    private boolean avaliable;

    public Car(String model, int year, int hp) {
        this.model = model;
        this.year = year;
        this.hp = hp;
        this.avaliable = true;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
    public void tune_car()
    {
        this.hp *= 2;
    }

    public boolean isAvaliable() {
        return avaliable;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", hp=" + hp +
                '}';
    }
}
