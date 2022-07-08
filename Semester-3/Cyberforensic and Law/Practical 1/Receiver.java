import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;


public class Receiver {
    public static void main(String[] args) throws Exception {
        int i,k=0;
        String ct="";
        String pt="";

        ServerSocket skt=new ServerSocket(6020);
        Socket sc=skt.accept();
        Random r=new Random();
        System.out.println("Enter the String=");
        BufferedReader br=new BufferedReader(new InputStreamReader(sc.getInputStream()));
        ct=br.readLine();
        String s[]=new String[ct.length()];
        s=ct.split(",");
        int j[]=new int[s[0].length()];
        System.out.println("msg="+s[0]);
        for(i=0;i<s[0].length();i++){
            j[i]=Integer.parseInt(s[i+1]);
            System.out.println("key"+j[i]);
        }
        for(i=0;i<s[0].length();i++)
        {
            System.out.println("j="+j[i]);
            pt +=(char)(s[0].charAt(i)-j[i]);
        }
        System.out.println(" Msg from Sender " +  pt);
    }
}
