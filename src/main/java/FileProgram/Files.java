package FileProgram;// Unpublished Work (c) 2017 Deere & Company

import java.io.File;

public interface Files {

    void WriteFile(File file);

    File ReadAndConvertToUpperCase(String sourceFileName, String targetFile);

    File findRepeatingWordsFrom(String sourceFileName, String targetFile);
}
