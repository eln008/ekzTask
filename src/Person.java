import java.util.List;

public class Person {
    private String name;
    private int id;
    private List<Car> car;
    private static int idd = 1;


    public Person(String name, int id, List<Car> car) {
        this.name = name;
        this.id = id;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", car=" + car +
                '}';
    }
}
