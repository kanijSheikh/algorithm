package FileProgram;// Unpublished Work (c) 2017 Deere & Company

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FileWrite {
    public static void main(String args[]) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File("Kanij.txt"));
            String s = "Hi Kanij Hi Hello Kanij Sheikh";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("kanij.txt");
            byte[] bytes1 = new byte[fileInputStream.available()];
            System.out.println(bytes1.length);
            fileInputStream.read(bytes1);

            System.out.println(bytes1.length);
            /////////////////
            String string1 = new String(bytes1);
            String s1 = string1.toUpperCase();
            FileOutputStream fileOutputStream1 = new FileOutputStream(new File("Kanij1.txt"));
            fileOutputStream1.write(s1.getBytes());
            fileOutputStream1.close();

            System.out.println(string1);

            //=======================================
            String[] split = string1.split("\\s");
            String s3 = "";
            StringBuilder stringBuilder = new StringBuilder();
            LinkedHashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
            for (String s2 : split) {
                map.put(s2, map.containsKey(s2) ? map.get(s2) + 1 : 1);
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > 1) {
                        stringBuilder = stringBuilder.append(entry.getKey()+ " ==>" + entry.getValue());
                        stringBuilder.append("\n");
                    }

                }
            }
            FileOutputStream fileOutputStream2 = new FileOutputStream(new File("Kanij2.txt"));
            fileOutputStream2.write(stringBuilder.toString().getBytes());
            fileOutputStream2.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
