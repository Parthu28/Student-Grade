

public class FinalExam extends GradedActivity
{
   private int numQuestions;                     // Number of questions:
   private double eachPoints;                    // Points for each question:
   private int numMissed;                        // Questions missed:


   public FinalExam(int questions, int missed)
   {
      double numericScore;

      numQuestions = questions;
      numMissed = missed;

      eachPoints = 100.0 / questions;
      numericScore = 100.0 - (missed * eachPoints);

      setScore(numericScore);
   }


   public double geteachPoints()
   {
      return eachPoints;
   }


   public int getNumMissed()
   {
      return numMissed;
   }
}