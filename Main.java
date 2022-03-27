package jobApps;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {	
		 char pick;
		 List<stringFiles> Jobs = new ArrayList<>();
		 List<stringFiles> Details = new ArrayList<>();
		 save.readList(Jobs);
		do{
			System.out.println("Job Application System\n"
					+ "1. Display Jobs\n"
					+ "2. Enter Details\n"
					+ "3. Filter List\n"
					+ "4. Add Job\n" 
					+ "5. Quit\n");
	         pick = EasyScanner.nextChar();
//case statement if user picks option 1-5 or bypasses the parameters.
		switch(pick) {
			case '1':
				displayJobs(Jobs);
				break;
			case '2':	
				enterDetails(Jobs);
				save.saveFile(Details);
				break;
			case '3':
				filterList(Jobs);
				break;
			case '4':
				existingJobs(Jobs);
				break;
			case '5':save.saveFile(Jobs);
				Quit();			
			case '6':
				Jobs.removeAll(Jobs);
				Details.removeAll(Details); //remove all for personal use.
				break;
			default:
				System.out.println("Invalid num.");
			}	
	} while(pick!='5');
		
}
	
//real-time method to add jobs then adds it to the arraylist.
	 static void existingJobs(List<stringFiles> Jobs) {
		 String sJob;
		 System.out.print("Add a job: ");
		 sJob = EasyScanner.nextString();
		 Jobs.add(new stringFiles(sJob)); 
}

//method to display jobs.
	 static void displayJobs(List<stringFiles> Jobs) {
		 {
			 for(stringFiles item : Jobs) {
			 System.out.println("Jobs: "+ item.getJobs() + "\n");
			 }
	}
}

//jobseeker enters details method.
	 static void enterDetails(List<stringFiles> Details) {
		String fName, lName, location, skills;
		System.out.print("First name: "); 
			fName = EasyScanner.nextString();
		System.out.print("Last name: "); 
			lName = EasyScanner.nextString();
		System.out.print("Location: "); 
			location = EasyScanner.nextString();
		System.out.print("Skills: "); 
	    	skills = EasyScanner.nextString();
	    Details.add(new stringFiles("*****************************************************\n" + "Jobseeker Details:\n"));
	    Details.add(new stringFiles(fName + "\n" + lName + "\n" + location + "\n" + skills + "\n" + "*****************************************************\n"));

 }
	
//filter system that finds a phrase in the arraylist, uses loop to iterate through arraylist to find matching phrase.
	 static void filterList(List<stringFiles> Jobs) {
		System.out.println("Contains this phrase: ");
		String phraseInput = EasyScanner.nextString();
		for (int i = 0; i < Jobs.size(); i++) {
			if (Jobs.get(i).toString().contains(phraseInput)) {
				System.out.println("\n" + Jobs.get(i));
			} else {
			System.out.println("No jobs found with the phrase " + phraseInput);
		}
			}
	 }
	 
//quit/restart method.
	private static void Quit() {
		while(true) {
		System.out.println("Quit (enter 'q')/Restart (enter 'r')?\n");
		Scanner scan = new Scanner(System.in);
		String qr = scan.next();
		if(!qr.equals("r") && !qr.equals("q")) {
			System.out.println("Invalid input.");
		}else if(qr.equals("q")) {
				System.out.println("Successfuly quit.");
				System.exit(0);
			}else if (qr.equals("r")) {
					System.out.flush();
					main(null);
	}
		scan.close();
		}
	}
}