import java.io.File;

public class Q8DeleteTxtFiles {
    public static void main(String[] args) {
        String directoryPath = "C:/Users/Rituraj/Downloads/Accolite_Joining/temptxtfiles/";
        File dir = new File(directoryPath);
        File dirFiles[] = dir.listFiles();
        if (dir.exists()){
            for (File f : dirFiles){
                String filename = f.getName();
                if (filename.endsWith(".txt")){
                    if (f.delete()){
                        System.out.println("Deleted " + filename);
                    }else{
                        System.out.println("Failed");
                    }
                }
            }
        }else{
            System.out.println("Directory not found");
        }
    }
}
