package utility;

/**
 * Created by CHEULONG on 3/12/2017.
 */
public class GradeCalculator {
    public char calculate(double... scores){
<<<<<<< HEAD
        double totalScore=scores[0]+scores[1]+scores[2];
        char grade='\0';
        if(totalScore<=80&&totalScore>60) {
            grade = 'C';
        }else grade='F';
=======
<<<<<<< HEAD
        double totalScore=scores[0]+scores[1]+scores[2];
        char grade='\0';
        if(totalScore<=94&&totalScore>80) {
            grade = 'B';
=======
       double totalScore=scores[0]+scores[1]+scores[2];
        char grade='\0';
        if(totalScore>95.0){
            grade='A';
>>>>>>> c8097637c651c14a9611754cd36b573535297c40
        }
>>>>>>> 6bfa310fdaa81a5a5449d2f23586f284d982458f
        return grade;
    }
}
