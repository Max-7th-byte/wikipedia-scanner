import java.io.BufferedReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LinkExtractor {

    private final static Pattern pattern = Pattern.compile("<a href=\"(/wiki/[a-zA-Z0-9-_:.#()]+)\"(\\s+\\w+=\"[a-zA-Z0-9 ]+\")*>([/a-zA-Z0-9-_ ]+)</a>");

    public static void process(BufferedReader in, LinkReceiver receiver) throws IOException {
        String inputLine;
        while ((inputLine = in.readLine()) != null) {
            Matcher matcher = pattern.matcher(inputLine);
            while (matcher.find()) {
                receiver.receive(new Link(matcher.group(1), matcher.group(2), matcher.group(3)));
            }
        }
    }
}
