package com.reverse;
import java.util.*;

/*
 * 输入字符串，反向输出，主要是理解charAt()方法
 * @author 吴宜展
 * 2018/4/26
 */

public class ReverseTest {
	public static void main(String argus[]) {
		ArrayList list = new ArrayList();
		Scanner in = new Scanner(System.in);
		String c = in.next();
		for(int i = 0;i < c.length();i++) {
			list.add(c.charAt(i));//charAt():用于字符串，可以返回指定索引处的字符。索引范围为从 0 到 length() - 1。
		}
		for(int j = list.size() - 1;j >= 0;j--) {
			System.out.print(list.get(j));
		}
	}
}
