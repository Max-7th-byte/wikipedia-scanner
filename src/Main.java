public class Main {
    public static void main(String[] args) {

        try {
            String linksBetweenSites = "LinksBetweenSites";
            String readSites = "ReadSites";

            URLConverter urlConverter = new URLConverter();
            urlConverter.scanWebsiteForLinksFixedSize("https://en.wikipedia.org/wiki/History", 45, 10);
            urlConverter.writeNamesOfSitesToFileForPython("testLinksFixedSize");
            GraphvizPythonAdapter.writeReadSitesToFile(urlConverter.getData(), "testReadFilesFixedSize");



        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}