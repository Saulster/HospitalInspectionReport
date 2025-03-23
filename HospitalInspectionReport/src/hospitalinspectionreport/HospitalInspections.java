package hospitalinspectionreport;


public class HospitalInspections extends Inspection
{
    public HospitalInspections()
    {
        HospitalInspections inspect = new HospitalInspections();
        
        inspect.getHospitalName();
        inspect.getLocation();
        inspect.getYearsSinceInspection();
        inspect.getInspectionNeeded();
    }
}