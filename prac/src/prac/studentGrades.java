package prac;
/**
 * 
 * @author 122
 *
 */
public class studentGrades {
String name, address;
int datacommMarks, dbmsMarks, casetoolsMarks;
/**
 * this is a parameterized constructor.
 * @param datacommMarks this stores the data communication marks.
 * @param dbmsMarks this stores the dbms marks.
 * @param casetoolsMarks this stores the casetools marks.
 */
studentGrades(int datacommMarks, int dbmsMarks, int casetoolsMarks)
{
this.datacommMarks = datacommMarks;
this.dbmsMarks = dbmsMarks;
this.casetoolsMarks = casetoolsMarks;
}
/**
 * <p>this is a display method
 * <p>this method commutes the average
 * <p>and then assigns the grades based on it
 */
void displayGrade()
{
double avg;
char grade;
//compute average
avg = (datacommMarks + dbmsMarks + casetoolsMarks)/3;
//compute grade
extracted(avg);
}
/**
 * @param avg
 */
private void extracted(double avg) {
	char grade;
	if (avg>=80)
	grade = 'A';
	else if (avg>=70 && avg<80)
	grade = 'B';
	else if (avg>=60 && avg<70)
	grade = 'C';
	else
	grade = 'D';
	System.out.println("Grade is " + grade);
}
/**
 * this is the main method which is the entry point
 * @param args used to create an object
 */
public static void main(String[] args) {
// TODO Auto-generated method stub
}
}
