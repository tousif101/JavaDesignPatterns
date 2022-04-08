package AbstractFactory;

public class ModernChair implements Chair{

    @Override
    public String design(){
        return "Modern";
    }

    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public boolean sitOn() {
        return false;
    }


}
