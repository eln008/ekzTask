import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(1,"first car");
        Car car2 = new Car(2,"second car");
        List<Car> cars = new ArrayList<>(Arrays.asList(car2, car1));

        Person person1 = new Person("Name Person 1",1, cars);
        Person person2 = new Person("Name Person 2",2, cars);
        List<Person> personList = new ArrayList<>(Arrays.asList(person2,person1));

        SocialMedia socialMedia1 = new SocialMedia("first facebook",personList);
        SocialMedia socialMedia2 = new SocialMedia("second facebook",personList);
        List<SocialMedia> socialMediaList = new ArrayList<>(Arrays.asList(socialMedia2,socialMedia1));

        DataBase dataBase = new DataBase(cars,personList,socialMediaList);
        dataBase.setCar(cars);
        dataBase.setPerson(personList);
        dataBase.setSocialMedia(socialMediaList);



//        dataBase.saveCar(person1, "New Name",1);
//        dataBase.getCarById();
//        dataBase.getCarByPersonId(1);
//        dataBase.updateCarById(2,"newName");
//        dataBase.deleteCarById(2);







    }
}