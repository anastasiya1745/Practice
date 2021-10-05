package hillel.file;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class OldFile {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("temp");
        List<String> lines = Files.readAllLines(path);

        List<String> newLines = new ArrayList<>();

        for(String line: lines){
            newLines.add(line.replace("Line", String.valueOf(lines.indexOf(line)+1)));

        }
            Path path1 = Paths.get("temp");
           path1.toFile().createNewFile();

        Files.write(path1, newLines);
    }
}
