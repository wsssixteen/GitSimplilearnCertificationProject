class Project {
    public static void main(String[] args) {
        StringBuffer myName = new StringBuffer("Ahmad Ridhwan Bin Anuar");
        String courseName = "Git";
        String trainingProvider= "Simplilearn";
        StringBuffer simplilearnCEO = new StringBuffer("Krishna Kumar");

        System.out.println(myName.toString());
        System.out.println("This is for certification for the course " + courseName + " provided by " + trainingProvider);
        System.out.println("Signed by the CEO of Simplilearn: " + simplilearnCEO.toString());
    }
}