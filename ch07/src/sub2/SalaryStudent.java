package sub2;

public class SalaryStudent extends Student {

	// Ư��
	private String company;
	
	
	// ������
	public SalaryStudent(String name, int age, String school, String major, String company) {
		
		super(name, age, school, major);
		this.company = company;
		
	}
	
	
	// ���
	public void hello() {
		System.out.println(name+" �Դϴ�.");
		System.out.println(age+"�� �Դϴ�.");
		System.out.println(school+"�л� �Դϴ�.");
		System.out.println(major+"�� ���� �մϴ�.");
		System.out.println(company+"�� ������ �Դϴ�.");
	}
	
	
	
	
	
}