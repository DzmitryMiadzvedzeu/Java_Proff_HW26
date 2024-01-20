package com.telran.org.homework_26;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hippodrome {
    public static void main(String[] args) {

        String[] names = genName(15);

        List<Horse> horses = new ArrayList<>();
        for (int i =0; i < 15 ; i++){
            horses.add(new Horse(names[i],(int) ((Math.random() * 5) + 1)));
        }

        List<Thread> collect = horses.stream().map(Thread::new ).collect(Collectors.toList());
        collect.stream().forEach(Thread::start);
    }

    private static String[] genName(int numOfHorses) {
        String[] names = new String[numOfHorses];
        for (int i = 0; i < numOfHorses; i++) {
            names[i] = "with number " + (i + 1);
        }
        return names;
    }
}
