import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Project {
    public static void main(String[] args) {
        StringBuffer myName = new StringBuffer("Ahmad Ridhwan Bin Anuar");
        StringBuffer courseName = new StringBuffer("Git Training");
        StringBuffer trainingProvider = new StringBuffer("Simplilearn");
        Calendar setCompletionDate = Calendar.getInstance();
        Date completionDate = new Date();
        StringBuffer simplilearnCEO = new StringBuffer("Krishna Kumar");
        int certificationCode = 4234726; 
        
        setCompletionDate.set(2023, 3, 20);
        completionDate = setCompletionDate.getTime();
        
        System.out.println(myName.toString());
        
        System.out.println("This project is created for the certification for the course " 
        + courseName.toString() 
        + " provided by " 
        + trainingProvider.toString());

        
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");

        System.out.println(sdf.format(completionDate));
        System.out.println("Certification code: " + certificationCode);
        System.out.println("Signed by the CEO of Simplilearn: " + simplilearnCEO.toString());
    }
}