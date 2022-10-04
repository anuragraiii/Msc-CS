import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Random;


public class Sender {
    public static void main(String[] args) throws Exception {
        int i=0,k=0;
        String s="";
        String ct="";
        String key="";

        Socket sc=new Socket("localhost",6020);
        Random r=new Random();
        System.out.println("Enter the String");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(sc.getOutputStream()));
        s=br.readLine();
        int j[]=new int[s.length()];
        for(i=0; i<s.length();i++)
        {
            j[k]=r.nextInt(50);
            key +=Integer.valueOf(j[k])+",";
            System.out.print("j="+j[k]);
            ct +=(char)(s.charAt(i)+j[k]);
            k++;
        }
        System.out.println("Key="+key);
        System.out.println("Encrypted msg=" + ct);
        bw.write(ct+","+key);
        bw.flush();
        bw.close();

    }

}



