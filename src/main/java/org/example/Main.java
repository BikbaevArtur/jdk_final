package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Map<Integer, Boolean> map = new HashMap<>();
        int countTrue = 0;
        int countFalse =0;
        for (int i = 0; i < 1000; i++) {

            int car = random.nextInt(3);
            int target = random.nextInt(3);
            int openDoorShowman;
            do {
                openDoorShowman = random.nextInt(3);
            } while (openDoorShowman == target || openDoorShowman == car);
            target = 3 - target - openDoorShowman;
            if (target == car) {
                map.put(i, true);
                countTrue++;
            }
            else{
                map.put(i,false);
                countFalse++;
            }

        }


        double win = ((double) countTrue /1000)*100;
        double lost = ((double) countFalse / 1000) * 100;
        System.out.printf("Участник выграл машину %d раз из 1000, %.2f%%   вероятность выйграть если поменять дверь\n",countTrue,win);
        System.out.printf("Участник выйграл машину %d раз из 1000, %.2f%% вероятность выйграть если не поменять дверь ",countFalse,lost);


    }
}