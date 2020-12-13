public class Main {
    public static void main(String[] args) {

        try {
            String linksBetweenSites = "LinksBetweenSites";
            String readSites = "ReadSites";

            URLConverter urlConverter = new URLConverter();
            urlConverter.scanWebsiteForLinks("https://en.wikipedia.org/wiki/Virginia_Polytechnic_Institute_and_State_University", 1);
            urlConverter.writeNamesOfSitesToFileForPython("testLinksFixedSize");
            GraphvizPythonAdapter.writeReadSitesToFile(urlConverter.getData(), "testReadFilesFixedSize");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}