package effective_java.chapter2.item9.tryfinally;

import java.io.*;

/**
 * @author ：xiaobai
 * @date ：2023/5/6 17:15
 */
public class Copy {

    public static final int BUFFER_SIZE = 1;

    static void copy(String src, String dst) throws IOException {
        InputStream in = new FileInputStream(src);
        OutputStream out = new FileOutputStream(dst);
        try{
            int n;
            while((n = in.read())>=0){
                System.out.println(n);
                out.write(n);
            }
        }finally {
            in.close();
            out.close();
        }
    }

    public static void main(String[] args) throws IOException {
        Copy.copy("data/test.txt", "data/test2.txt");
    }
}
