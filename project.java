import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

class Project {
    public static void main(String[] args) {
        String courseName = "Git";
        String trainingProvider= "Simplilearn";
        Calendar setCompletionDate = Calendar.getInstance();
        Date completionDate = new Date();

        System.out.println("This is for certification for the course " + courseName + " provided by " + trainingProvider);

        setCompletionDate.set(2023, 3, 20);
        completionDate = setCompletionDate.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");

        System.out.println(sdf.format(completionDate));
    }
}