import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaximumFinder {
    public static Integer findMaximum(Integer num1, Integer num2, Integer num3) {
        Integer max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static Float findMaximum(Float num1, Float num2, Float num3) {
        Float max = num1;
        if (num2.compareTo(max) > 0) {
            max = num2;
        }
        if (num3.compareTo(max) > 0) {
            max = num3;
        }
        return max;
    }

    public static String findMaximum(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }
   //Generic Method
   
    public static <T extends Comparable<T>> T findMaximum(T ele1, T ele2, T ele3) {
        T max = ele1;
        if (ele2.compareTo(max) > 0) {
            max = ele2;
        }
        if (ele3.compareTo(max) > 0) {
            max = ele3;
        }
        return max;
    }

     public static <T extends Comparable<T>> T findMaximum(T... values) {
        List<T> valueList = Arrays.asList(values);
        Collections.sort(valueList, Collections.reverseOrder());
        T max = valueList.get(0);
        printMax(max);
        return max;
    }

    public static <T> void printMax(T max) {
        System.out.println("Max value: " + max);
    }
    }





