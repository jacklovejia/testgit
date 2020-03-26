package com.jack.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class Test02 {
    public static void main(String[] args) {
        List<PowerUserIdDo> remoteList = new ArrayList<>();
        remoteList.add(new PowerUserIdDo("1","1","1","1","1"));
        remoteList.add(new PowerUserIdDo("2","2","2","2","2"));
        remoteList.add(new PowerUserIdDo("2","3","3","3","3"));
        List<PowerUserIdDo> redisPowerUserIdDos = new ArrayList<>();
        redisPowerUserIdDos.add(new PowerUserIdDo("1","1","1","1","1111"));
        redisPowerUserIdDos.addAll(remoteList);

        System.out.println(redisPowerUserIdDos);
        ArrayList<PowerUserIdDo> collect = redisPowerUserIdDos.stream()
                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparing(PowerUserIdDo::getConsNo))), ArrayList::new));
        TreeSet<PowerUserIdDo> collect1 = redisPowerUserIdDos.stream().collect(toCollection(() -> new TreeSet<>(Comparator.comparing(PowerUserIdDo::getConsNo))));
        System.out.println("set:"+collect1);
//        System.out.println(collect);
//        collect.forEach(System.out::println);

    }
}
