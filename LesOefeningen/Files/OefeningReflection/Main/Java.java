package LesOefeningen.Files.OefeningReflection.Main;

import java.util.LinkedList;
import java.util.List;
import java.util.*;

public class Java {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Tjen");
        names.add("Simon");
        names.add("Prema");

     //   Collections.sort(names, new ReverseNameComparator());

        for (String name : names) {
            System.out.println(name);
        }
    }

  //  class ReverseNameComparator implements Comparator<String> {
    //    @Override
      //  public int compare(String a, String b) {
        //    return a;
        //}
    //}

  //  Collections.sort(names, (String a, String b) -> (return b.CompareTo(a);
   // );



}
