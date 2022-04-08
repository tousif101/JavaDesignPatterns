package AbstractFactory;

public class VictorianChair implements Chair{

    @Override
    public String design(){
        return "Victorian";
    }

    @Override
    public boolean hasLegs() {
        return true;
    }

    @Override
    public boolean sitOn() {
        return true;
    }
}
