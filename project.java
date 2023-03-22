import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Project {
    public static void main(String[] args) {
        StringBuffer courseName = new StringBuffer("Git Training");
        StringBuffer trainingProvider = new StringBuffer("Simplilearn");
        Calendar setCompletionDate = Calendar.getInstance();
        Date completionDate = new Date();
        
        System.out.println("This project is created for the certification for the course " 
        + courseName.toString() 
        + " provided by " 
        + trainingProvider.toString());

        setCompletionDate.set(2023, 3, 20);
        completionDate = setCompletionDate.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");

        System.out.println(sdf.format(completionDate));
    }
}