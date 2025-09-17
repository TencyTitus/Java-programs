import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        File f = new File("example.txt");
        if (f.delete()) {
            System.out.println("Deleted: " + f.getName());
        } else {
            System.out.println("Failed to delete.");
        }
    }
}
