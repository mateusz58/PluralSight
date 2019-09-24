package Generators;

import java.util.concurrent.ThreadLocalRandom;
import org.junit.jupiter.api.Test;

public class NumberGenerator {

    public static int generateRandomNumber(int length) {
        int size = (int) Math.pow(10, length - 1);

        return ThreadLocalRandom.current().nextInt(1,100) + size;
    }
    @Test
    void test()
    {

    }

}
