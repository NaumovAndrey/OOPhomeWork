public class Human {
    private String name;
    private String age;
    private TypeRelationship typeRelationship;

    public Human(String name, String age, TypeRelationship typeRelationship) {
        this.name = name;
        this.age = age;
        this.typeRelationship = typeRelationship;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public TypeRelationship getTypeRelationship() {
        return typeRelationship;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setTypeRelationship(TypeRelationship typeRelationship) {
        this.typeRelationship = typeRelationship;
    }
}
