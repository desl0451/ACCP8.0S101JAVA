package Test;

import java.util.Scanner;

public class Test {

	public void insertStudent(Student stu) {
		System.out.println("����ѧԱ��Ϣ�ɹ�д�뵽���ݿ�");
		System.out.println(stu.name + "  " + stu.age + "  " + stu.sex + "  " + stu.school);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("���������");
		int year = input.nextInt();
		//13 02 678
		System.out.println("��ѡ���Ʒ����(1.̨ʽ��  2.�ʼǱ�  3.����):");
		int type = input.nextInt();

		int rand = (int) (Math.random() * 900) + 100;
		
		System.out.print("�ù̶��ʲ������:"+(year+"0"+type+rand));

	}

}
