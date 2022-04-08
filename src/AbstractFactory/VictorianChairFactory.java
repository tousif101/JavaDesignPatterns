package AbstractFactory;

public class VictorianChairFactory implements FurnitureFactory{

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}

