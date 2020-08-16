import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Q10CopyFileFromOneDirToAnother {
    public static void copyFile(String from, String to) throws IOException {
        Path src = Paths.get(from);
        Path dest = Paths.get(to);
        Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Copied file to " + to);
    }
    public static void main(String[] args) throws IOException {
        String src = "C:/Users/Rituraj/Downloads/Accolite_Joining/dummyFolder/dummyFolder1/hello.txt";
        String target = "C:/Users/Rituraj/Downloads/Accolite_Joining/dummyFolder/dummyFolder2/hello2.txt";
        copyFile(src, target);
    }
}
