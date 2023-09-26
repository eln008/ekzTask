import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataBase {
    private List<Car> car;
    private List<Person> person;
    private List<SocialMedia> socialMedia;

    public DataBase(List<Car> car, List<Person> person, List<SocialMedia> socialMedia) {
        this.car = car;
        this.person = person;
        this.socialMedia = socialMedia;
    }

    public DataBase() {
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }

    public List<SocialMedia> getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(List<SocialMedia> socialMedia) {
        this.socialMedia = socialMedia;
    }



    public void saveCar(Person per, String name, int id) {
        Car newCar = new Car(id, name);

        for (Person p: person) {
           if(p.getName().equals(per)){
               setCar((List<Car>) newCar);
           }
        }
        System.out.println("Машина добавлена.");
    }


    public Car getCarByPersonId(int id) {
        for (Person person : person) {
            if (person.getId() == id) {
                System.out.println(person.getCar());
                return (Car) person.getCar();

            }
        }

        System.out.println(" не найденo");
        return null;
    }




    void getCarById(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите id: ");
        int id = scan.nextInt();
            for (Car c:car) {
               if(c.getId() == id){
                   System.out.println(c);
               }
            }
    }

        public void updateCarById(int id, String newName) {
        for (Car c : car) {
        if (c.getId() == id) {
            c.setName(newName);
            System.out.println("обнавлено");
        }
    }
    }
    public void deleteCarById(int id) {
        for (Person c:person) {
            if(c.getId() == id){
                 c.getCar();
                person.remove(c.getCar());
            }
        }

        System.out.println("не найдена.");
    }

}
