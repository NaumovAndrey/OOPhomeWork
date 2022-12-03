public class Node {
    private int id;
    private Node node;

    public Node(int id) {
        setId(id);

    }

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
