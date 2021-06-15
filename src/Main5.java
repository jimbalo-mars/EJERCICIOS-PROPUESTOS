import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main5 {


    List<String> employees;


    public static void main(String[] args) {
        Path pathToFile = Paths.get("E:\\DEV.MAYBE\\INFORMATORIO 2021\\JAVA\\EJERCICIOS PROPUESTOS\\personalities.txt");
        loadFile(pathToFile);
    }

    public List<String> loadFile(Path file){
        employees = new ArrayList<>();
        try {
            String content = Files.readString(file);
            System.out.println(content);
        }catch (IOException e){
            e.printStackTrace();
        }
        return employees


    }
}

