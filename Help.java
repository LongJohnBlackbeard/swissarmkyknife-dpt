class Help {
    public static void printHelp(){
        System.out.println("");
        System.out.println("-HttpRequest [URL] : Retrieves data from a URL, stores it in memory, ");
        System.out.println("                     and prints it to the command line.\n");
        System.out.println("    -> HttpRequest should receive one argument: -HttpRequest [URL]");
        System.out.println("    -> HttpRequest examples: \n");
        System.out.println("        java sak -HttpRequest https://hello-world-2021-edition-dpt.azurewebsites.net");
        System.out.println("        java sak -HttpRequest https://stackoverflow.com");
        System.out.println("");
        System.out.println("-HttpRequestIndex [URL] : Opens the JSON index file passed, parses for additional URLs, ");
        System.out.println("                          retrieves data from each URL, and prints the data to the command");
        System.out.println("                          line followed by the URL itself.\n");
        System.out.println("    ->HttpRequestIndex should receive one argument: -HttpRequestIndex [URL]");
        System.out.println("    ->HttpRequestIndex example:\n");
        System.out.println("        java sak -HttpRequestIndex https://thunderbird-index.azurewebsites.net/w0a6zk195d.json");

    }
}
