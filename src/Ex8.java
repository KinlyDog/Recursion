import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Ex8 {
    public static ArrayList<File> allFilesInCatalog(File root, int depth) {
        ArrayList<File> expand = new ArrayList<>();
        expand.add(root);

        ArrayList<File> allFiles = new ArrayList<>();

        return allFilesInCatalogRec(expand, allFiles, depth);
    }

    public static ArrayList<File> allFilesInCatalogRec(ArrayList<File> expand, ArrayList<File> allFiles, int depth) {
        if (depth <= 0) return allFiles;

        File[] expandCopy = expand.toArray(new File[0]);
        expand.clear();

        for (File file : expandCopy) {
            if (file.isFile()) {
                allFiles.add(file);
            }

            if (file.isDirectory()) {
                expand.addAll(Arrays.asList(Objects.requireNonNull(file.listFiles())));
            }
        }

        return allFilesInCatalogRec(expand, allFiles, depth - 1);
    }
}
