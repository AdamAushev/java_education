package lr8;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class File_ByteRead_SamBuff {
    public static void readAllByArray(InputStream in) throws IOException {
        byte[] buff = new byte[5];
        int count;
        while ((count = in.read(buff)) != -1) {
            System.out.println("Количество=" + count + ", buff="
                    + Arrays.toString(buff) + ", str="
                    + new String(buff, 0, count, "cp1251"));
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "F:/hdydyrdt/fugygh.txt";
        InputStream inFile = null;
        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытия файла " + fileName + " " + e);
        } finally {
            if (inFile != null) {
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/
                }
            }
        }
    }
}

