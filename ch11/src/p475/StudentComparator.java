package p475;

import java.util.Comparator;

import p475.CompareExample.Student;

/*
 * 학생 번호 비교자
 */
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b){
		
		return Integer.compare(a.sno,b.sno);
		
	}
	
}
