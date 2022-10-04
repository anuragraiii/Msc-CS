import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class WordSearcher {
    private String fileName;
    public WordSearcher(String fileName) {
        this.fileName = fileName;
    }
    public boolean search(String word) {
        boolean found = false;
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()) {
                String sentence = scanner.nextLine();
                if (sentence.indexOf(word) != -1) {
                    found = true;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter filename > ");
        String fileName = scanner.nextLine();
        WordSearcher wordSearcher = new WordSearcher(fileName);
        System.out.println("Enter word to be searched > ");
        String word = scanner.nextLine();
        boolean result = wordSearcher.search(word);
        if(result){
            System.out.println("Word found");
        }
        else{
            System.out.println("Word not found");
        }
    }
}