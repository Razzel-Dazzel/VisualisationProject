import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner; // Import the Scanner class to read text files
import java.util.stream.Stream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
        int n = 0; // Used to get the first line
        int numNodes = 0; // holds the total number of nodes
        int numEdges = 0; // holds the total number of edges

        //Grabbing the first line and getting out the number of nodes and edges from the file.
        String line_0 = "";
        try (Stream<String> lines = Files.lines(Paths.get("C:\\Users\\adam-\\Documents\\Programming\\VisualizationProject\\src\\InitialTestFile.txt"))) {
            line_0 = lines.skip(n).findFirst().get();
            System.out.println(line_0);
        }
        catch(IOException e){
            System.out.println(e);
        }
        String[] nodesEdgeCount = new String[2];
        nodesEdgeCount = line_0.split("\t");

        // Storing Node and Edge counts
        numNodes = Integer.parseInt(nodesEdgeCount[0].substring(6));
        numEdges = Integer.parseInt(nodesEdgeCount[1].substring(6));

      // Used to read file -- probably not idea as this will take up a lot of memory
//    try {
//        File myObj = new File("C:\\Users\\adam-\\Documents\\Programming\\VisualizationProject\\src\\InitialTestFile.txt");
//        Scanner myReader = new Scanner(myObj);
//        while (myReader.hasNextLine()) {
//            String data = myReader.nextLine();
//            System.out.println(data);
//        }
//        myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }

    }


}
