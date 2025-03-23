package hospitalinspectionreport;

import java.util.Scanner;

public abstract class Inspection
{

    
public String hospitalLocation;
    public String hospitalName;
    public int yearsSinceInspection;
    public String inspectionNeeded;

    public Inspection(String hospitalLocation, String hospitalName, int yearsSinceInspection, String inspectionNeeded)
   {
      hospitalLocation =getLocation();
      hospitalName = getHospitalName();
      yearsSinceInspection = getYearsSinceInspection();
      inspectionNeeded = getInspectionNeeded();
      String iInspection = "HOSPITAL INSPECTION REPORT\n***********************\nHOSPITAL LOCATION: "+hospitalLocation+"\nHOSPITAL NAME: "+hospitalName+"\nYEARS SINCE LAST INSPECTION: "+ yearsSinceInspection + "INSPECTION NEEDED: "+ inspectionNeeded;
   }
    
 
   
    public String getHospitalName()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter hospital name");
        setHospitalName(scan.next());
        return hospitalName;

    }

    public String getLocation()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter hospital location");
        setHospitalLocation(scan.next());
        return hospitalLocation;
    }

    public int getYearsSinceInspection()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the amount of years since the last inspection");
        setYearsSinceInspection(scan.nextInt());
        return yearsSinceInspection;
    }

    public String getInspectionNeeded()
    {
        
        if (yearsSinceInspection>2)
        {
            inspectionNeeded = "inspection is needed";
        }
        else
        {
            inspectionNeeded = "inspection is not needed";
        }
        return inspectionNeeded;
    }
    
    
    /**
     * @param hospitalLocation the hospitalLocation to set
     */
    public void setHospitalLocation(String hospitalLocation)
    {
        this.hospitalLocation = hospitalLocation;
    }

    /**
     * @param hospitalName the hospitalName to set
     */
    public void setHospitalName(String hospitalName)
    {
        this.hospitalName = hospitalName;
    }

    /**
     * @param yearsSinceInspection the yearsSinceInspection to set
     */
    public void setYearsSinceInspection(int yearsSinceInspection)
    {
        this.yearsSinceInspection = yearsSinceInspection;
    }

    /**
     * @param inspectionNeeded the inspectionNeeded to set
     */
    public void setInspectionNeeded(String inspectionNeeded)
    {
        this.inspectionNeeded = inspectionNeeded;
    }
}
