
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

// import java.util.*;
public class convert {

    public static void main(String[] args) {
        try {
            String s = "hello world";
            String charset = "UTF-16";
            byte[] Bytearray = s.getBytes(charset);
            System.out.println(Arrays.toString(Bytearray));
        } catch (UnsupportedEncodingException e) {
            System.out.println("Unsupported charset :" + e);
        }
    }
}
