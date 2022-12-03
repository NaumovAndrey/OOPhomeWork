import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
//        Human ivanov = new Human("Иванов", 25, Gender.Man);
//        Human ivanova = new Human("Иванова", 20,Gender.Woman);
//        Human petrov = new Human("Петров", 36, Gender.Man);
//        Human petrova = new Human("Петрова", 29,Gender.Woman);
//        Human sidorov = new Human("Сидоров", 47, Gender.Man);
//        Human sidorova = new Human("Сидорова", 38,Gender.Woman);
//        Human fedorov = new Human("Фёдоров", 58, Gender.Man);
//        Human fedorova = new Human("Фёдорова", 47,Gender.Woman);
//
//        System.out.println();


        Node parent = new Node(25);
        Node parentNext = new Node(47);
//        System.out.println(node.getId());
        parent.setId(15);
//        System.out.println(node.getId());

//        System.out.println(node.getNode());
//        //System.out.println(node.getNode().getId());
//        int myId = node.getId();
//        System.out.println(myId);
//        Node myNode = node.getNode();
//        System.out.println(myNode);

        //parent.setNode(new Node(47));
        //System.out.println(parent.getId());
        //System.out.println(parent.getNode().getId());

        parent.setNode(parentNext);
        System.out.println(parent.getNode().getId());

        System.out.println(parent.getId());
    }
}
