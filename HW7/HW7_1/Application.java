package HW7_1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {

    public static void main(String[] args) {
     Set<Integer> set1 = new HashSet<Integer>();
     Set<Integer> set2 = new HashSet<Integer>();
     set1.addAll(Arrays.asList(10,12,13,24,35,44,93,45,100,2));
     set2.addAll(Arrays.asList(24,55,90,99,2,13,25,48,39,41));

     intersectionSets(set1,set2);
     unionSets(set1,set2);
     unionTwoSet(set1,set2);

    }
    public static void unionSets(Set<Integer>hashSet,Set<Integer>set){
        hashSet.addAll(set);
        System.out.println(hashSet);
    }
    public  static void unionTwoSet(Set<Integer>hashSet, Set<Integer>set){
        Set<Integer> combined = Stream.concat(hashSet.stream(), set.stream())
                .collect(Collectors.toSet());
        System.out.println(combined);
    }
    public static void intersectionSets(Set<Integer>set1, Set<Integer>set2){
        Set<Integer> mutalSets = new HashSet<Integer>(set1);
        mutalSets.retainAll(set2);
        System.out.println(mutalSets);
    }
}