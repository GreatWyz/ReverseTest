package com.reverse;
import java.util.*;

/*
 * �����ַ����������������Ҫ�����charAt()����
 * @author ����չ
 * 2018/4/26
 */

public class ReverseTest {
	public static void main(String argus[]) {
		ArrayList list = new ArrayList();
		Scanner in = new Scanner(System.in);
		String c = in.next();
		for(int i = 0;i < c.length();i++) {
			list.add(c.charAt(i));//charAt():�����ַ��������Է���ָ�����������ַ���������ΧΪ�� 0 �� length() - 1��
		}
		for(int j = list.size() - 1;j >= 0;j--) {
			System.out.print(list.get(j));
		}
	}
}
