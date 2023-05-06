package effective_java.chapter2.item8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ：xiaobai
 * @date ：2023/5/6 16:56
 */
public class TopLine {

    static String fistLineOfFile(String path) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(path));
        try{
            return in.readLine();
        }finally {
            in.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String s = TopLine.fistLineOfFile("JavaVersion/src/main/java/effective_java/chapter2/item8/test.txt");
        System.out.println(s);
    }
}
