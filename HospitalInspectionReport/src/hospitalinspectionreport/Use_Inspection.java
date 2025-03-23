
package hospitalinspectionreport;


public class Use_Inspection
{
    public void hospitalInspection()
    {
         HospitalInspections inspect = new HospitalInspections();
         
        inspect.getHospitalName();
        inspect.getLocation();
        inspect.getYearsSinceInspection();
        inspect.getInspectionNeeded();
        
        System.out.println("HOSPITAL INSPECTION REPORT\n***********************\nHOSPITAL LOCATION: "+inspect.hospitalLocation+"\nHOSPITAL NAME: "+inspect.hospitalName+"\nYEARS SINCE LAST INSPECTION: "+ inspect.yearsSinceInspection + "INSPECTION NEEDED: "+ inspect.inspectionNeeded);
    }
}
