package Generators;

import java.util.concurrent.ThreadLocalRandom;

public class NumberGenerator {

    public static int generateRandomNumber(int from,int to)
    {
        return ThreadLocalRandom.current().nextInt(from,to);
    }
}
