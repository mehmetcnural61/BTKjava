package ExceptionHandling.CheckedException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        BufferedReader reader = null;
        int total = 0;
        try {
            reader = new BufferedReader(new FileReader("D:\\BTKJava\\src\\ExceptionHandling\\CheckedException\\Numbers.txt"));
            String line = null;
            while ((line = reader.readLine()) != null ){
                total += Integer.valueOf(line);
            }
            System.out.println("Toplam="+total);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } //bu dosya yerinde yoksa hatası
        catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
