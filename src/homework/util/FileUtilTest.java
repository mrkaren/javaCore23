package homework.util;

import java.io.File;

public class FileUtilTest {

    public static void main(String[] args) {
        String path = "/Users/karen/Data/lessons/java2023-24/javaCore/javaCore/example";
        String fileName = "mytext1.txt";
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            System.out.println(file1);
        }
//        System.out.println(FileUtil.fileSearch(path, fileName));
//        FileUtil.contentSearch(path, "asdf");
    }
}
