package p240;
/* 정적 초기화 블록  */
public class Television {

	static String company = "Samsung" ;
	static String model = "LED" ;
	static String info ;
	
	static {
		info = company + "-" + model;
	}
	
	
}
