import java.io.*;

public class ReadFile {
    public static void main(String[] args)  {
        try {
            File file = new File("C:\\Temp\\test.txt");

            FileReader fileReader = new FileReader(file);

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = "";
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}