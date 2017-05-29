package sachTest;// Unpublished Work (c) 2017 Deere & Company

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MainClass {



    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("abc");
        StringBuffer stringBuffer1 = new StringBuffer("abc");
        System.out.println(stringBuffer.toString().equals(stringBuffer1.toString()));
        System.out.println(stringBuffer == stringBuffer1);
        List<Integer> integers = Arrays.asList(1,2, 2, 3, 4, 5);
       // integers.stream().filter(a -> a==2).collect(Collectors.toList());
        HashSet hashSet = new HashSet(integers);
        Set<Object> collect = integers.stream().collect(Collectors.toSet());
        System.out.println(integers);
        System.out.println(hashSet);



        //  String s1 = new String("abc");
       //String s2 = new String("abc");
        //String s2 = "abc";

       // System.out.println(s1.equals(s2));
        //System.out.println(s1==s2);

    }


    public static int summation(int[] numbers) {
        int length = numbers.length;
        int sum=0;


        for (int i =0; i <= length; i++){

        }

        return 1;


    }

    public static float calculateFactor(int d) {
        {
            int sum, i, j, k = 0, p;
            for (i = 2; i <= 4; i++) {
                for (j = i; j <= 4; j++) {
                    sum = i + j;
                    if (sum == d)
                        System.out.println(i + " ”" + " ”" + j);
                    else {
                        for (k = 2; k <= 4; k++) {
                            sum = sum + k;
                            if (sum < d)
                                continue;
                            else
                                break;
                        }
                        if (sum == d) {
                            System.out.print(i + j);
                            for (p = 2; p <= k; p++)
                                System.out.print(" ”" + " ”" + p);
                            System.out.print(" ”" + " ”" + p);
                        }
                    }
                }
            }


            return 22;

        }


    }}
