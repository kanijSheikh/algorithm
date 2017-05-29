package FileProgram;// Unpublished Work (c) 2017 Deere & Company

import java.io.File;

public class TestProgram {
    public static void main(String args[]){
        Files files = new FileImpl();
        files.WriteFile(new File("kanij.txt"));

        files.ReadAndConvertToUpperCase("kanij.txt", "kanij1.txt");

        files.findRepeatingWordsFrom("kanij.txt", "kanij2.txt");
    }
}
