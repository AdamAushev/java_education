package lr8;
import java.io.*;
import java.net.*;

public class Primer4 {

    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + " конец ");
                break;
            }
        }
    }

    public static void main(String[] args) {
        try {
            InputStream inFile = new FileInputStream("E:\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "cp1251");
            readAllByByte(rFile);
            System.out.print("\n\n\n");
            inFile.close();
            rFile.close();

            Reader rUrl = null;
            try {
                InputStream inUrl = new URL("http://google.com").openStream();
                rUrl = new InputStreamReader(inUrl, "cp1251");
                readAllByByte(rUrl);
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } finally {
                if (rUrl != null) {
                    rUrl.close();
                }
            }

            InputStream inArray = new ByteArrayInputStream(new byte[] { 5, 8, 3, 9, 11 });
            Reader rArray = new InputStreamReader(inArray, "cp1251");
            readAllByByte(rArray);
            System.out.print("\n\n\n");
            inArray.close();
            rArray.close();
        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}


