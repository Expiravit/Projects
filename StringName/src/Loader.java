import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите Фамилию, Имя, Отчество через пробел: ");
        String fullName = reader.readLine();
        String name[] = fullName.split("\\s");
        System.out.println("Фамилия: "+name[0]+"\n"+"Имя: "+name[1]+"\n"+"Отчество: "+name[2]);


    }
}
