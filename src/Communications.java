import java.util.ArrayList;
import java.util.List;

public class Communications {
    private List<Communications> communications;

    public Communications(){
        communications = new ArrayList<>();
        communications.add(new Human()); //
    }
}
