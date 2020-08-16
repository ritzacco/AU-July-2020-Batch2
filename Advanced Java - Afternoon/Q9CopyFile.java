import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q9CopyFile {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("C:/Users/Rituraj/Downloads/Accolite_Joining/IOcopy/input.txt");
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter("C:/Users/Rituraj/Downloads/Accolite_Joining/IOcopy/output.txt", true);
            String str;

            while ((str = br.readLine()) != null) { // read a line
                fw.write(str); // write to output file
                fw.flush();
            }
            br.close();
            fw.close();
            System.out.println("File copied");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}