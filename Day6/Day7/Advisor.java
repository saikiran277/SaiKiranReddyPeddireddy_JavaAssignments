package ey.com.day7;

import java.util.Random;

public class Advisor {
    private static final String[] advices = {
        "Never begin to stop and never stop to begin.",
        "Only destination isn’t important, one should enjoy the journey.",
        "Impossible itself says ‘i m possible’"
    };

    public static void main(String[] args) {
        Random random = new Random();
        int index = random.nextInt(advices.length);
        System.out.println(advices[index]);
    }
}
