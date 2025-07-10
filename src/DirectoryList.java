import java.io.File;
import java.util.Arrays;

public class DirectoryList {
    public static void listAlphabetically(String relativePath) {
        String basePath = System.getProperty("user.dir");
        String fullPath = basePath + File.separator + relativePath;

        File dir = new File(fullPath);

        if (!dir.exists()) {
            System.out.println("The directory does not exist! " + relativePath);
            return;
        }
        if (!dir.isDirectory()) {
            System.out.println("The path does not belong to any directory! " + relativePath);
            return;
        }
        String[] contents = dir.list();

        if (contents != null) {
            Arrays.sort(contents);
            System.out.println("Directory ordered alphabetically");
            for (String item : contents) {
                System.out.println(item);
            }
        } else {
            System.out.println("The directory is empty!");
        }
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the directory path as an argument!");
            return;
        }
        listAlphabetically(args[0]);
    }
}
