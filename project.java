import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Project {
    public static void main(String[] args) {
        StringBuffer myName = new StringBuffer("Ahmad Ridhwan Bin Anuar");
        String courseName = "Git";
        String trainingProvider= "Simplilearn";
        Calendar setCompletionDate = Calendar.getInstance();
        Date completionDate = new Date();
        StringBuffer simplilearnCEO = new StringBuffer("Krishna Kumar");
        int certificationCode = 4234726; 

        System.out.println(myName.toString());
        System.out.println("This is for certification for the course " + courseName + " provided by " + trainingProvider);

        setCompletionDate.set(2023, 3, 20);
        completionDate = setCompletionDate.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");

        System.out.println(sdf.format(completionDate));
        System.out.println("Certification code: " + certificationCode);
        System.out.println("Signed by the CEO of Simplilearn: " + simplilearnCEO.toString());
    }
}