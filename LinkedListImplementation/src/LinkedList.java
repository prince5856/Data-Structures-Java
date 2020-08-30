
public class LinkedList<T> {

	Node<T> head;
	//insert node at the end of the linked list
	public void add(T data)
	{
		if(head==null)
		{
			Node<T> temp = new Node<>(data);
			head= temp;
			return;
		}
		Node<T> value = new Node<>(data);
		Node<T> temp = head;
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = value;	
	}
	public void addbegin(T data)
	{
		Node<T> node1 = new Node<T>(data);
		node1.next = head;
		head = node1;
	}
	public void add(int index,T data)
	{
		Node<T> temp = head;
		for(int i=0; i<index-1; i++)
		{
			temp = temp.next;
		}
		Node<T> x1 = new Node(data);
		x1.next = temp.next;
		temp.next = x1;
		
		
	}
	public void print()
	{
		if(head==null)
		{
			System.out.println("There are no elements in the list");
			return;
		}
		Node<T> temp = head;
		while(temp!=null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
		return;
	}
	public int size()
	{
		if(head == null)
		{
			return 0;
		}
		Node<T> temp = head;
		int size = 0;
		while(temp!=null)
		{
			temp = temp.next;
			size = size+1;
		}
		return size;
	}
}
