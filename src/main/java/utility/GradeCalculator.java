package utility;

/**
 * Created by CHEULONG on 3/12/2017.
 */
public class GradeCalculator {
    public char calculate(double... scores){
        double totalScore=scores[0]+scores[1]+scores[2];
        char grade='\0';
        if(totalScore>95.0) {
            grade = 'A';
        } else if(totalScore<=94&&totalScore>80) {
            grade = 'B';
        }else if(totalScore<=80&&totalScore>60) {
            grade = 'C';
        }else grade='F';
        return grade;
    }
}
