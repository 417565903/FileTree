package FileTest;

import java.io.File;
import java.io.IOException;

public class FileTest {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Administrator\\IdeaProjects\\java\\src\\FileTest","a.jdava'");

        try {
            f.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(f.isFile()){
            System.out.println("'是一个文件");
        }

    }
}
