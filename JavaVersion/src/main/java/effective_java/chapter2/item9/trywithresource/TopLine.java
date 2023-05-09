package effective_java.chapter2.item9.trywithresource;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author ：xiaobai
 * @date ：2023/5/8 8:37
 */
public class TopLine {

    static String firstLineOfFile(String path) throws IOException {
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            return br.readLine();
        }
    }



    public static void main(String[] args) throws IOException {
        String s = TopLine.firstLineOfFile("data/test.txt");
        System.out.println(s);
    }
}
