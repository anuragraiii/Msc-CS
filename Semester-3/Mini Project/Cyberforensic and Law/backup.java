public class backup
{
    public void backupDB(String path)
    {
        String executeCmd="C:/xamppp/mysql/bin/mysqldump.exe -u root -B students -r"+path;
        System.out.println(executeCmd);
        Process runtimeProcess;
        try
        {
            runtimeProcess = Runtime.getRuntime().exec(new String[]{"cmd.exe","/c",executeCmd});
            int processComplete = runtimeProcess.waitFor();
            System.out.println(processComplete);

            if(processComplete==0)
            {
                System.out.println("Backup Created Successfully!");
            }
            else
            {
                System.out.println("Couldn't Create the backup!");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }
    public static void main(String []args)
    {
        new backup().backupDB("D:/db1.sql");
    }
}