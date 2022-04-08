package AbstractFactory;


//TODO: Rename to a normal factory!!!!
public class ModernChairFactory implements FurnitureFactory{
    @Override
    public Chair createChair() {
        ModernChair modernChair = new ModernChair();
        return modernChair;
    }
}
