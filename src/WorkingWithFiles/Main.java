package WorkingWithFiles;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();


    }
    public static void createFile(){

        File file= new File("D:\\BTKJava\\src\\Files\\Students.txt");
        try {
            if (file.createNewFile()){
                System.out.println("Dosya Oluşturuldu");
            }else {
                System.out.println("Bu Dosya zaten mevcut !");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void getFileInfo(){
        File file= new File("D:\\BTKJava\\src\\Files\\Students.txt");
        if (file.exists()){
            System.out.println("Dosya adı: "+file.getName());
            System.out.println("Dosya Yolu: "+file.getAbsolutePath());
            System.out.println("Dosya Yazılabilir mi ?: "+file.canWrite());
            System.out.println("Dosya Okunabilir mi ?: "+file.canRead());
            System.out.println("Dosya Boyut (byte): "+file.length());
        }
    }

    public static void readFile(){
        File file= new File("D:\\BTKJava\\src\\Files\\Students.txt");
        try {
            Scanner reader=new Scanner(file);
            while (reader.hasNextLine()){
                String line=reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
    public static void writeFile(){
        try {
          BufferedWriter writer= new BufferedWriter(new FileWriter("D:\\BTKJava\\src\\Files\\Students.txt",true)) ;
          //yeni satır oluştur Alp'i öyle yaz
          writer.newLine();
          writer.write("Alp");
            System.out.println("Dosyaya yazıldı.");
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
