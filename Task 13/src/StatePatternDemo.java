// State interface
interface State {
    void handle();
}

// Concrete States
class HappyState implements State {
    @Override
    public void handle() {
        System.out.println("I'm happy!");
    }
}

class SadState implements State {
    @Override
    public void handle() {
        System.out.println("I'm sad.");
    }
}

// Context
class Person {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void express() {
        state.handle();
    }
}

// Main
public class StatePatternDemo {
    public static void main(String[] args) {
        Person person = new Person();

        person.setState(new HappyState());
        person.express();

        person.setState(new SadState());
        person.express();
    }
}
