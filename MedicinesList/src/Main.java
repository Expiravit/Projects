import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        TreeSet<String> scroll = new TreeSet<>();

        while (true) {
            String count = bufferedReader.readLine();
            if (count.equals("LIST")) {
                for (String s : scroll
                        ) {
                    System.out.println(s);
                }
            }
            else if (count.equals("EXIT")){
                break;
            }
            else scroll.add(count);
        }
    }
}
