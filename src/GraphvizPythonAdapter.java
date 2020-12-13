import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.Map;

public class GraphvizPythonAdapter {

    static void writeReadSitesToFile(Map<String, LinkedList<String>> data, String fileName) {
        String path = System.getProperty("user.home") + "/Desktop/" + fileName + ".txt";
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                System.out.println("A NEW FILE WITH ALL REFERENCES OF LINKED SITES HAS BEEN CREATED!");
            } else System.out.println("A FILE WITH ALL REFERENCES OF LINKED SITES IS ALREADY EXIST");

            BufferedWriter bw = new BufferedWriter(new FileWriter(path));

            for (int i = 0; i < data.keySet().size(); i++) {

                String referenceToReadSite = (String)data.keySet().toArray()[i];
                bw.write((i+1) + ". " + referenceToReadSite + "\n------------------\n\n");
                Object [] linksOnSite = data.get(referenceToReadSite).toArray();
                for (int k = 0; k < linksOnSite.length; k++) {
                    String reference = linksOnSite[k].toString();

                    bw.write(reference + "\n\n");
                }


            }
            bw.close();

        } catch (Exception e) {
            System.out.println("SOMETHING WENT WRONG :(");
            e.printStackTrace();
        }
    }
}