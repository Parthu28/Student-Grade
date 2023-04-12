

public class CourseGradesDemo
{
   public static void main(String[] args)
   {
      // Object for the lab grade.
      GradedActivity lab = new GradedActivity();
      // Set lab score at 85.
      lab.setScore(85);

      // Object for the pass/fail exam.
      // 20 questions total, 3 questions missed, minimum
      // Passing score is 70.
      PassFailExam pfexam = new PassFailExam(20, 3, 70);

      // Object for essay grade.
      Essay essay = new Essay();
      // Set essay scores. Grammer = 25 and spelling = 18
      // Content = 20, length = 17.
      essay.setScore(25, 18, 17, 20);

      // Object for the final exam.
      // 50 questions, 10 missed.
      FinalExam finalExam = new FinalExam(50, 10);

      // Object for CourseGrades.
      CourseGrades course = new CourseGrades();
      course.setLab(lab);
      course.setPassFailExam(pfexam);
      course.setEssay(essay);
      course.setFinalExam(finalExam);

      // Display scores and grades.
      System.out.println(course);
   }
}