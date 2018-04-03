import java.nio.file.Files; 
import java.nio.file.Paths;
import java.net.URI;
import java.io.*;

public class project
{

       public static void createDirectory (String projectname)
       {
        System.out.println("");
        System.out.println("Creating directories for Java project " + projectname);
	try
	{
	 Files.createDirectories(Paths.get(projectname + "/src/main/filters/"));
	 Files.createDirectories(Paths.get(projectname + "/src/main/java/"));
	 Files.createDirectories(Paths.get(projectname + "/src/main/resources/META/INF/"));
	 
	 Files.createDirectories(Paths.get(projectname + "/src/test/filters/"));
	 Files.createDirectories(Paths.get(projectname + "/src/test/java/"));
	 Files.createDirectories(Paths.get(projectname + "/src/test/resources/")); 
	} catch (Exception e)
	{
	 e.printStackTrace();	
	}
       }

       public static void createFile (String projectname)
       {
        System.out.println("");
        System.out.println("Creating files for Java project " + projectname);
        try
        {
	 Files.createFile(Paths.get(projectname + "/LICENSE.txt"));
	 Files.createFile(Paths.get(projectname + "/NOTICE.txt"));
	 Files.createFile(Paths.get(projectname + "/README.txt"));
	 Files.createFile(Paths.get(projectname + "/pom.xml"));
        } catch (Exception e)
        {
         e.printStackTrace();
        }
       }

}
