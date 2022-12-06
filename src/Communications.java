import java.util.ArrayList;
import java.util.List;

public class Communications extends Human{

    private TypeRelationship typeRelationship;
    private static List<Object> typeHuman = new ArrayList<>();

    public <humans> Communications() {
        super(getHumans());
    }
    public TypeRelationship getTypeRelationship() {
        return typeRelationship;
    }

    public void setTypeRelationship(TypeRelationship typeRelationship) {
        this.typeRelationship = typeRelationship;
    }

    public static List<Object> getTypeHuman() {
        return typeHuman;
    }

    public static void setTypeHuman(List<Object> typeHuman) {
        Communications.typeHuman = typeHuman;
    }
    public static void addTypeRelationship(String name, TypeRelationship typeRelationship, Human firstname){

    }
}