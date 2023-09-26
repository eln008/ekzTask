import java.util.List;

public class SocialMedia {
    private String name;
    private List<Person> person;

    public SocialMedia(String name, List<Person> person) {
        this.name = name;
        this.person = person;
    }

    public List<Person> getPerson() {
        return person;
    }

    public void setPerson(List<Person> person) {
        this.person = person;
    }
}
