package AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        ModernChairFactory modernChairFactory = new ModernChairFactory();
        VictorianChairFactory victorianChairFactory = new VictorianChairFactory();
        List<Chair> listOfChairs = new ArrayList<>();
        //We have a list of chairs!
        for (int i = 0; i < 11; i++) {
            listOfChairs.add(modernChairFactory.createChair());
            listOfChairs.add(victorianChairFactory.createChair());
        }

        for(Chair chair: listOfChairs){
            System.out.println(chair.design());
        }

        //Now we can add different furnitures to each Victorian and each Modern factory!
    }
}
