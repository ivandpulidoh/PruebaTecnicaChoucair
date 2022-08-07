package starter.utils;

import java.util.Random;

public class RandomNumber {
    public static Integer generateNumber(){
        Random rand = new Random();
        int upperbound = 999;
        int int_random = rand.nextInt(upperbound);
        return int_random;
    }
}
