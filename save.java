package jobApps;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class save {
	public static void saveFile(List<stringFiles> Jobs) {
	try (
			FileWriter File = new FileWriter("data.txt"); //create new file called data.txt
			PrintWriter fWriter = new PrintWriter(File);     
			)

{
			for(stringFiles item : Jobs) 
			{
				fWriter.println(item.getJobs());
			}
	} catch (IOException e)

			{
			System.out.println ("There was a problem writing the file"); //catch exception
			
			}
}
	public static void readList(List<stringFiles> Jobs) {
		String sJob;
	try (
	FileReader File = new FileReader("data.txt");
	BufferedReader Stream = new BufferedReader (File);
			
	)
		{
		sJob = Stream.readLine();
		while(sJob != null)
	{
			
	Jobs.add(new stringFiles(sJob)); //write jobs to file
	sJob = Stream.readLine();

	}

// handle the exception that's thrown by the FileReader constructor if the file is not found
} catch (FileNotFoundException e)
	
	{

	System.out.println("\nNo file was read");

	} catch (IOException e)
	
	{
	System.out.println("\nThere was a problem reading the file");
	}

}
}