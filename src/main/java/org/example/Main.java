package org.example;



import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

@Slf4j
public class Main {

    public static void main(String[] args) {
        int[] result; // this will be the mandatory variable to response
        int[] seatsArray = {0,846,81,261,63,1,6,993,7,5,18,87,34,318,67,65,193,75,16,39,91,4,8,1,3,6,1,7,8,9,21,13,17,13,16,74};
        List<Integer> seats = transformArray(seatsArray);
        seats = streamParameters(seats, s -> s < 0);
        int[] newArray = transformToArray(seats);
        result = Arrays.copyOf(newArray, newArray.length);
        checkResultArray(result);
    }

    private static void checkResultArray(int[] array){
        int counter = 0;
        if(array.length == 0){
            log.error("Result array is empty");
        }
        for (int i : array) {
            if(counter == 0){
                log.info("[INFO] Retrieving result array");
            }
            System.out.print("[" + i + "] ");
            counter++;
        }
    }
    private static int[] transformToArray(List<Integer> list){
        int counter = 0;
        int[] newValues = new int[list.size()];
        for (Integer i : list){
            newValues[counter] = i;
            counter++;
        }
        return newValues;
    }
    private static List<Integer> transformArray(int[] array){
        List<Integer> list = new ArrayList<>();
        for(int i : array){
            list.add(i);
        }
        return list;
    }
    private static List<Integer> streamParameters(List<Integer> list, Predicate<Integer> predicate){
        return list.stream()
                .filter(predicate)
                .distinct()
                .sorted()
                .toList();
    }

}


