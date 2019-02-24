import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ReadContent {

    public void fileReader(String fileName){

        // Open txt file from given path
        // try-with-resources statement
        try(Stream<String> stream =
                    Files.lines(Paths.get(fileName))) {
            //get a line and print it as output to the console
            stream.forEach(System.out :: println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
