package Test;

import java.util.Scanner;

public class Test {

	public void insertStudent(Student stu) {
		System.out.println("将该学员信息成功写入到数据库");
		System.out.println(stu.name + "  " + stu.age + "  " + stu.sex + "  " + stu.school);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("请输入年份");
		int year = input.nextInt();
		//13 02 678
		System.out.println("请选择产品类型(1.台式机  2.笔记本  3.其他):");
		int type = input.nextInt();

		int rand = (int) (Math.random() * 900) + 100;
		
		System.out.print("该固定资产编号是:"+(year+"0"+type+rand));

	}

}
