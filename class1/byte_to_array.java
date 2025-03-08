
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class byte_to_array {

    public static void main(String[] args) {

        try {
          String s = "hello world";
          byte[] Bytes = s.getBytes("UTF-8");
          System.out.println(Arrays.toString(Bytes));
          String str = new String(Bytes, "UTF-8");
          
          System.out.println(str);

        } catch (UnsupportedEncodingException e) {
            System.out.println(e);

        }
    }
}
