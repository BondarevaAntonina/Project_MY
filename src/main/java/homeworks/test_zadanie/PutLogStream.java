package homeworks.test_zadanie;

import java.io.*;

/**
 * Created by antoni on 06.06.2018.
 */
public class PutLogStream extends PrintStream {
   // FileOutputStream out = new FileOutputStream("log.txt");

    public PutLogStream() {
        super(System.out);
    }

    @Override
    public void println(String x) {
        super.println(x);
        FileOutputStream f;
        try {
            f = new FileOutputStream("log.txt");
            byte[] contentInBytes = x.getBytes();
            f.write(contentInBytes);
            f.flush();
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
