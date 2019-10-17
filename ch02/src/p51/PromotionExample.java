package p51;

public class PromotionExample {

	public static void main(String[] args) {
		
		byte byteValue = 10;
		int intValue = byteValue;	// byte媛믪쓣 int媛믪뿉 �꽔怨�.
		System.out.println(intValue);
		
		char charValue = '가';
		intValue = charValue;	// cha媛믪쓣 int媛믪뿉 �꽔怨�. 
		System.out.println("가의 유니코드 = " + intValue);
		
		intValue = 500;
		long longValue = intValue;	// int媛믪쓣 long�뿉 �꽔怨�.
		System.out.println(longValue);
		
		intValue = 200;
		double doubleValue = intValue;	// int媛믪쓣 double�뿉 �꽔怨�.
		System.out.println(doubleValue);
		
	}
}
