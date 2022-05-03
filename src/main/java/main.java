import java.io.*;
import java.nio.charset.StandardCharsets;

public class main {

    public static void main(String[] args) {

        // Aufgabe 1
        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))){
            String s = "";
            while ((s = reader.readLine()) != null){
                System.out.println(s);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // Aufgabe 2
        try (BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("mytext.txt"), StandardCharsets.US_ASCII))) {
            writer.write("4ö6");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //Aufgabe 3
        ;

        try (RandomAccessFile ras = new RandomAccessFile("myras.bin", "rw")) {
            int i = 456;
            ras.writeInt(i);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }

}
