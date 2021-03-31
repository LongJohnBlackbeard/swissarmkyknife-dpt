public class sak {
    public static void main(String[] args) {
        System.out.println("");

        if (args.length < 1) {
            System.out.println("SwissArmyKnife requires at least one argument to be passed. For more information use the" +
                    " \"-Help\" command.");
            Help.printHelp();
        }
        else if (args[0].equalsIgnoreCase("-Help")) {
            System.out.println("Running Help Feature...");
            Help.printHelp();
        }
        else if (args[0].equalsIgnoreCase("-HttpRequest")) {
            System.out.println("Running HttpRequest...");
            // HttpRequest feature here
            if (args.length <2) {
                System.out.println("-HttpRequest functions requires valid URL as second parameter. Use -Help for more" +
                        "information");
            } else {
                String URL = args[1];
                HttpRequest request = new HttpRequest();
                if (request.readUrl(URL)) {
                    System.out.println(request);
                }
            }
        }
        else if (args[0].equalsIgnoreCase("-HttpRequestIndex")) {
            System.out.println("Running HttpRequestIndex...");
            //HttpRequestIndex feature here
            if (args.length != 2) {
                System.out.println("HttpRequest functions requires valid URL as second parameter, use -Help for more " +
                        "information");
            } else {
                String indexURL = args[1];
                HttpRequestURLs requestIndex = new HttpRequestURLs();
                if (requestIndex.readUrl(indexURL)) {
//                    System.out.println(requestIndex);
                    requestIndex.ParseURLS();
                }
            }
        }

        System.out.println("");


    }
}
