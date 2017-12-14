import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ListTasks {

  public ListTasks() {

  }

  public void readFile() {
  try{
    Path filePath = Paths.get("../tasklist.txt");
    List<String> lines = Files.readAllLines(filePath);

    if(lines.size() > 0) {
      for(int i = 0; i < lines.size(); i++){
        System.out.println(i+1 + " " + lines.get(i));
      }
    }
  } catch (Exception e){
    System.out.println("Unable to read file: tasklist.txt");
  }
  }
}
