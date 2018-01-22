package FileTest;

import java.io.File;
import java.util.logging.Level;

public class Tree {
    public static void main(String[] args) {
        File file = new File("C:/Users/Administrator/IdeaProjects/java");
        printFile(file,0);
    }
    static void printFile(File file,int level){
        File[] fileList = file.listFiles();
            for (int i = 0;i <level; i++){
                System.out.print('-');
            }
                System.out.println(file.getName());
                    if(file.isDirectory()){
                        for(File val:fileList){
                            printFile(val,level+1);
                        }

        }
    }
}
