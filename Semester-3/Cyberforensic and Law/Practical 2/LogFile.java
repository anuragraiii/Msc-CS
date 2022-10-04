
import java.io.*;
import java.util.logging.*;

public class LogFile {
    public static void main(String args[]) throws Exception
    {
        Logger l=Logger.getLogger(LogFile.class.getName());
        FileHandler fh;
        fh=new FileHandler("E:/mylogfile.log",true);
        l.addHandler(fh);
        l.setLevel(Level.ALL);
        SimpleFormatter sf=new SimpleFormatter();
        fh.setFormatter(sf);
        l.info("My first log");

        l.info("Hi,How are you!!");

    }
}