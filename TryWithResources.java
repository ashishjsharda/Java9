package Java9;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;

/**
 * Using try with resources
 * @author ashish
 */
public class TryWithResources {
    public static void main(String[] args) {

        readData("Hello");
    }

    /**
     * Read Data
     * @param text
     */
    public static void readData(String text)
    {
        StringReader stringReader=new StringReader(text);
        try(BufferedReader bufferedReader=new BufferedReader(stringReader)){
            System.out.println(bufferedReader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
