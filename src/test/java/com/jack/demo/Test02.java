package com.jack.demo;

import com.alibaba.fastjson.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.collectingAndThen;
import static java.util.stream.Collectors.toCollection;

public class Test02 {
    @Test
    void name() {
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasPrevious()){
            String previous = stringListIterator.previous();
            System.out.println(previous);
        }
        System.out.println("1");

//        List<PowerUserIdDo> redis = JSONObject.parseArray(s, PowerUserIdDo.class);
//        List<PowerUserIdDo> remote = new ArrayList<>();
//        List<PowerUserIdDo> list = new ArrayList<>();
//        remote.add(new PowerUserIdDo("6023256874","q","q","33101","01"));
//        remote.add(new PowerUserIdDo("6023256871","q","q","33101","01"));
//        remote.add(new PowerUserIdDo("6023256872","213","123","33111","01"));
////        remote.removeAll(redis);
//        HashSet<PowerUserIdDo> h1 = new HashSet<>(redis);
//        HashSet<PowerUserIdDo> h2 = new HashSet<>(remote);
//        h2.removeAll(h1);
//        list.addAll(h2);
//        new ArrayList<>(h2).forEach(System.out::println);
//        System.out.println(1<1);
//        Map<String, String> map = new HashMap<>();
//        map.put("provinceCode","33101");
//        map.put("powerUserId","6023256871");
//        List<PowerUserIdDo> remote = new ArrayList<>();
//        remote.add(new PowerUserIdDo("6023256874","q","q","33101","01"));
//        remote.add(new PowerUserIdDo("6023256871","q","q","33101","01"));
//        remote.add(new PowerUserIdDo("6023256872","213","123","33111","01"));
//        remote.removeIf(x->x.getProNo().equals(map.get("provinceCode")) && x.getConsNo().equals(map.get("powerUserId")));
//        remote.stream().forEach(System.out::println);
//        Iterator<PowerUserIdDo> iterator = remote.iterator();
//        while (iterator.hasNext()){
//            PowerUserIdDo next = iterator.next();
//            String proNo = next.getProNo();
//            String consNo = next.getConsNo();
//            if(redis.contains(proNo))
//        }
//        remote.removeIf(powerUserIdDo ->);

//        remote.addAll(powerUserIdDos);
//        remote.stream()
//                .collect(collectingAndThen(toCollection(() ->
//                        new TreeSet<>(Comparator.comparing(x -> x.getProNo() + ";" + x.getConsNo()))), ArrayList::new))
//                .forEach(System.out::println);




//        powerUserIdDos.forEach(System.out::println);
//        List<PowerUserIdDo> remoteList = new ArrayList<>();
//        remoteList.add(new PowerUserIdDo("1","1","1","1","1"));
//        remoteList.add(new PowerUserIdDo("2","2","2","2","2"));
//        remoteList.add(new PowerUserIdDo("2","3","3","3","3"));
//        List<PowerUserIdDo> redisPowerUserIdDos = new ArrayList<>();
//        redisPowerUserIdDos.add(new PowerUserIdDo("1","1","1","1","1111"));
//        redisPowerUserIdDos.addAll(remoteList);
//
//        System.out.println(redisPowerUserIdDos);
//        ArrayList<PowerUserIdDo> collect = redisPowerUserIdDos.stream()
//                .collect(collectingAndThen(toCollection(() -> new TreeSet<>(Comparator.comparing(PowerUserIdDo::getConsNo))), ArrayList::new));
//        TreeSet<PowerUserIdDo> collect1 = redisPowerUserIdDos.stream().collect(toCollection(() -> new TreeSet<>(Comparator.comparing(PowerUserIdDo::getConsNo))));
//        System.out.println("set:"+collect1);
//        System.out.println(collect);
//        collect.forEach(System.out::println);

    }
}
