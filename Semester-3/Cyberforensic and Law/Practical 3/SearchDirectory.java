import java.io.*;
public class SearchDirectory {
    public static void main(String[] args) throws Exception{
        String d="";
        final String file;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the directory you want to search");
        d=br.readLine();
        System.out.println("Enter Filter for the file to search");
        file=br.readLine();
        File dir=new File(d);
        FilenameFilter filter=new FilenameFilter() {
            public boolean accept(File dir, String name) {
                return name.startsWith(file);
            }
        };
        String [] children=dir.list(filter);
        if(children==null){
            System.out.println("Directory does not exist");
        }
        else
        {
            for(int i=0;i<children.length;i++)
            {
                String Filename = children[i];
                System.out.println(Filename);
            }

        }

    }
}
