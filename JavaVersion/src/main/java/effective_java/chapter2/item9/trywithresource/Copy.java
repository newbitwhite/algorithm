package effective_java.chapter2.item9.trywithresource;

import java.io.*;

/**
 * @author ：xiaobai
 * @date ：2023/5/8 8:46
 */
public class Copy {
    private final static int BUFFER_SIZE = 16;
    private int i;

    static void copy(String src, String dst) throws IOException {
        try(
                InputStream in = new FileInputStream(src);
                OutputStream out = new FileOutputStream(dst);
            ){
            byte[] buf = new byte[BUFFER_SIZE];
            int n;
            while ((n = in.read(buf)) >= 0){
                out.write(buf, 0, n);
            }
        }
    }


    public static void main(String[] args) throws IOException {
        Copy.copy("data/test.txt", "data/test2.txt");

        Copy copy1 = new Copy();
        Copy copy2 = new Copy();
        System.out.println(copy1.equals(copy2));
    }

}
