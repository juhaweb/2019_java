package p475;

import java.util.Comparator;

import p475.CompareExample.Student;

/*
 * �л� ��ȣ ����
 */
public class StudentComparator implements Comparator<Student> {

	@Override
	public int compare(Student a, Student b){
		
		return Integer.compare(a.sno,b.sno);
		
	}
	
}
