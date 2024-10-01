
import java.io.*;

public class CountLines {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.err.println("Usage: counlines <file1> <file2> ... <filen>");
        }

        int lineCount = 0;

        for (String arg : args) {

            Reader in = null;
            
            try {
                in = new BufferedReader(new FileReader(arg));

                boolean wasNewLine = true;
                int ch;

                while ((ch = in.read()) != EOF) {
                    if (ch == '\n') {
                        lineCount++;
                        wasNewLine = true;
                    } else {
                        wasNewLine = false;
                    }
                }
                if (!wasNewLine) {
                    lineCount++;
                }

            } catch (IOException e) {
                System.err.println("Error while processing \"" + arg + "\": not counted");
            }

            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    System.err.println("Error while closing \"" + arg + "\": not counted");

                }
                System.out.println(lineCount);
            }
        }
    }
    private static final int EOF = -1;
}
