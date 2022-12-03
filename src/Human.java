import java.util.ArrayList;
import java.util.List;

public class Human {
    private String name;
    private int age;
    private Gender gender;
    private List<Human> humans = new ArrayList<>();

    public Human(String name, int age, Gender gender) {
        setName(name);
        setAge(age);
        setGender(gender);
        humans.add(Human.this);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Human> getHumans() {
        return humans;
    }

    public void setHumans(List<Human> humans) {
        this.humans = humans;
    }

    @Override
    public String toString() {
        return "Human{" +
                "humans=" + humans +
                '}';
    }
}
