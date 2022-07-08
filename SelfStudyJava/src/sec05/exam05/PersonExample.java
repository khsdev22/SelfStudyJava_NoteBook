package sec05.exam05;

public class PersonExample {
	public static void main(String[] args) {
		Person p1 = new Person("910630-1216118", "김현수");
		
		System.out.println("p1의 국적 : " + p1.nation + "p1의 주민번호 : " + p1.ssn + "p1의 이름 : " + p1.name);
	}

}
