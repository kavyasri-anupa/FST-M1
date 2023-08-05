package activities;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        File file = new File("test.txt");
        boolean fStatus = file.createNewFile();
        System.out.println(fStatus);
        FileWriter writer = new FileWriter("test.txt");
        writer.write("First line");
        writer.close();
        FileReader reader = new FileReader("test.txt");
        int i;
        while((i=reader.read())!=-1){
            System.out.print((char)i);
        }
        reader.close();

    }
}
