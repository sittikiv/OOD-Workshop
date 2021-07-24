package dip;

import java.util.Random;

public class GenerateIdService {
    public String getId() {
        Random random = new Random();

        return "XXX" + random.nextInt(10);
    }
}
