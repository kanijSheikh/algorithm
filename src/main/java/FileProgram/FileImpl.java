package FileProgram;// Unpublished Work (c) 2017 Deere & Company

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class FileImpl implements Files {
    public void WriteFile(File file) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String data = "Hi Kanij . Hi Hi Kanij";
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public File ReadAndConvertToUpperCase(String sourceFile, String destinationFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFile);
            byte[] bytes = new byte[fileInputStream.available()];
            fileInputStream.read(bytes);

            String data = new String(bytes);
            String s = data.toUpperCase();
            FileOutputStream fileOutputStream = new FileOutputStream(destinationFile);
            fileOutputStream.write(s.getBytes());
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public File findRepeatingWordsFrom(String sourceFileName, String targetFile) {
        try {
            FileInputStream fileInputStream = new FileInputStream(sourceFileName);
            byte[] bytes = new byte[fileInputStream.available()];
           fileInputStream.read(bytes);

            String inputData = new String(bytes);
            String[] split = inputData.split("\\s");
            LinkedHashMap<String, Integer> count = new LinkedHashMap<String, Integer>();
            StringBuilder stringBuilder = new StringBuilder();
            for (String s : split) {
                count.put(s, count.containsKey(s) ? count.get(s) + 1 : 1);
            }
                Set<Map.Entry<String, Integer>> entries = count.entrySet();
                for (Map.Entry<String, Integer> entry : entries) {
                    if (entry.getValue() > 1) {
                        stringBuilder.append(entry.getKey() + "==>" + entry.getValue());
                        stringBuilder.append("\n");
                    }
            }

            FileOutputStream fileOutputStream = new FileOutputStream(targetFile);
            fileOutputStream.write(stringBuilder.toString().getBytes());
            fileOutputStream.close();

        } catch (FileNotFoundException e) {
                e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        return null;
    }
}
