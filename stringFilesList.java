package jobApps;

import java.util.ArrayList;


public class stringFilesList {
	private ArrayList<stringFiles> tList;
           
   
    public stringFilesList()
    {
        tList = new ArrayList<>();
    }
	
    public boolean addJob(stringFiles tIn)
    {
        
            tList.add(tIn);
            return true;
     
    }
 
    public boolean removeJob(String sJob)
    {
        stringFiles findT = Search(sJob); 
        if (findT != null) 
        {
            tList.remove(findT); 
            return true;
        }
        else
        {
            return false; 
        }
    }       
    
     private stringFiles Search(String sJob) {
    	   for(stringFiles Job: tList) {  
               
               if(Job.getJobs() == sJob)
               {
                   return Job;
               }
           }
		return null;
	}
     
    public stringFiles getJobs(int positionIn)
    {
        if (positionIn<1 || positionIn>getTotal()) 
        {
            return null;
        }
        else
        {
            return tList.get(positionIn -1);
        }
    }
 

    public boolean isEmpty()
    {
        return tList.isEmpty();
    }

        
    public int getTotal()
    {       
        return tList.size();
    }
        
    @Override
    public String toString()
    {
        return tList.toString();
    }
    
}
