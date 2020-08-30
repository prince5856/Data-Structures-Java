import java.util.Scanner;
public class LinkedListUse {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i<n; i++)
		{
			int x = sc.nextInt();
			list1.add(x);
		}
		list1.add(2,6);
		list1.add(6,8);
		list1.add(1,11);
		list1.print();
		System.out.println(list1.size());

	}

}
