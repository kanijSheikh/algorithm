import InnerClasses.OuterClass;
import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class TestClass {
    public static void main(String[] args){
        Employee employee = new Employee();

        ArrayList a = new ArrayList();
        a.add(8);
        a.add(6);
        a.add(3);

        ArrayList b = new ArrayList();
       b = (ArrayList) a.clone();
        b.add(2);
        b.remove(2);
        System.out.println(b.equals(a));
    }

//        Employee employee = new Employee();
//        employee.setEmpId(1);
//        employee.setEmployeeName("Kanij");
//
//        Employee employee1 = new Employee();
//        employee1.setEmpId(1);
//        employee1.setEmployeeName("Kanij");
//        boolean equals = employee == (employee1);
//        boolean equals1 = employee.getEmployeeName() == (employee1.getEmployeeName());
//        System.out.println(equals);
//        System.out.println(equals1);



    }

//    public static int GetJumpCount(int input1,int input2,int[] input3)
//    {
//        input1=5;
//        input2=1;
//        input3= new int[] {9,10};
//        int count=0;
//        int remaining=0;
//        for (int heightOfWall : input3) {
//            if(heightOfWall == input1){
//                return count++;
//            }else{
//                for(int i = 0; i <= remaining;i++){
//                    remaining = heightOfWall-input1;
//                    int test=remaining + input1;
//                    count++;
//                }
//
//                }
//
//            }
//        }
//
//        return count;
//    }




