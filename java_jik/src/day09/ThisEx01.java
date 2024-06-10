package day09;

public class ThisEx01 {

	public static void main(String[] args) {
		Student2 std1 = new Student2();
		Student2 std2 = new Student2(1, 2, 2, "둘리");
		std1.schoolName = "KH중학교";
		System.out.println(std1.schoolname);
		System.out.println(std2.schoolname);
		System.out.println(Student2.schoolName);
		System.out.println(Math.PI);//Math에서 제공하는 static값
	}

}

class Student2{
	private int grade, classNum, num;
	private String name;
	public String schoolName= "KH.고등학교" ;
		
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student2(int grade, int classNum, int num, String name) {
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
		this.name = name;
	}
	public Student2() {
	//	num = 1; //this()생성자를 이용할 때는 첫번째 줄에 작성해야 한다. 아니면 에러발생
		this(1, 1, 1, "홍길동");
		
	}
	
	
}
