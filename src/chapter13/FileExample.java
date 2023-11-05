package chapter13;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileExample {

    public static void main(String[] args) throws IOException {
        String newFilePath = "/Users/karen/Data/lessons/java2023-24/javaCore/javaCore/src/chapter13/test/notes1234.txt";

        File file = new File(newFilePath);

        file.setLastModified(123456);

        //
//        File directory1 = new File(newFilePath + "a");
//        directory1.mkdir();
//
//        File directory2 = new File(newFilePath + "b");
//        directory2.mkdir();
//
//        File directory3 = new File(newFilePath + "c");
//        directory3.mkdir();

//        File file = new File(newFilePath);
//        System.out.println(file);
//        if (!file.exists()) {
//            System.out.println(file.mkdirs());
//        }


//        boolean result = file.renameTo(new File(newFilePath));
//        System.out.println("result : " + result);

//        System.out.println(file.getTotalSpace());
//        System.out.println(file.getFreeSpace());


//        File parent = file.getParentFile();
//        String parentOfParent = parent.getParent();
//        System.out.println(parentOfParent);
//        if (file.exists()) {
//            if (file.delete()) {
//                System.out.println("deleted");
//            }
//        }

//        if (!file.exists()) {
//            try {
//                file.createNewFile();
//                System.out.println("File created");
//            } catch (IOException e) {
//                System.out.println("can not create file " + e);
//            }
//        }else {
//            System.out.println("File NOT created");
//        }


//        if (file.isDirectory()) {
//            File[] list = file.listFiles();
//            for (File f : list) {
//                if (f.isFile()) {
//                    System.out.println(f.getName() + " " + f.length() + " " +  new Date(f.lastModified()) + " " + f.canWrite());
//                }
//            }
//        }
    }
}
