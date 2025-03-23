package hospitalinspectionreport;

import java.util.Scanner;

public class HospitalInspectionReport
{

    public static void main(String[] args)
    {
        String hospitalLocation = " ";
        String hospitalName = " ";
        String inspectionNeeded = " ";
        int yearsSinceInspection = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("enter hospital name: ");
        hospitalName = scan.nextLine();

        System.out.print("enter hospital location: ");
        hospitalLocation = scan.nextLine();

        System.out.print("enter the amount of years since the last inspection: ");
        yearsSinceInspection = scan.nextInt();
        if (yearsSinceInspection > 2)
        {
            inspectionNeeded = "YES";
        }
        else
        {
            inspectionNeeded = "NO";
        }

        System.out.println("HOSPITAL INSPECTION REPORT\n***********************\nHOSPITAL LOCATION: " + hospitalLocation + "\nHOSPITAL NAME: " + hospitalName + "\nYEARS SINCE LAST INSPECTION: " + yearsSinceInspection + "\nINSPECTION NEEDED: " + inspectionNeeded);

    }

}
