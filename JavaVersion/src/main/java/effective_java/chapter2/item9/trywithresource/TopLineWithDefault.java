package effective_java.chapter2.item9.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ：xiaobai
 * @date ：2023/5/8 8:44
 */
public class TopLineWithDefault {

    static String firstLineOfFile(String path, String defaultVal){
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }catch (IOException e){
            return defaultVal;
        }
    }



    public static void main(String[] args) {
        String s = TopLineWithDefault.firstLineOfFile("data/test.txt", "empty file");
        System.out.println(s);
    }
}
