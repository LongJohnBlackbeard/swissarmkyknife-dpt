import java.util.Arrays;

public class HttpRequestURLs extends HttpRequest{
    HttpRequestURLs() {
        super();
    }

    public Boolean readURL(String urlIn) {
        Boolean returnValue = super.readUrl(urlIn);
        return returnValue;
    }

    public void ParseURLS() {
        System.out.println("Begin Parsing:\n ");
        for (String s : urlContent) {
            String[] segments = s.split("\"");

            if (segments.length > 12) {
                System.out.println("Index File Info:");
                System.out.println("-" + segments[1] + " " + segments[2] + " " + segments[3]);
                System.out.println("-" + segments[5] + " " + segments[6] + " " + segments[7]);
                HttpRequest request = new HttpRequest();
                if (request.readUrl(segments[11])) {
                    System.out.println(request);
                }
            }

            System.out.println("\n");
        }
        System.out.println("Finished");
    }
}
