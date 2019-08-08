package Queue;

class MyLinkedList {
	//링크드리스트는 맨 앞이 누군지 알고있다.
	Node head;
	int size;
	
	void add(int idx, int data)
	{
		//idx번째 다음에 data값을 갖는 새로운 노드를 연결
		Node node = new Node();
		Node temp = head;
		for(int i = 0; i < idx; i++)
		{
			temp = temp.link;		//한번씩 다음으로 가는것.
		}
		node.data = temp.data;
		
		//data값을 갖는 새로운 Node객체를 생성하고
		Node newnode = new Node();
		node.data = data;
		//idx번째 친구를 찾아와서,
		Node idxNode = get(idx);
		//그놈이 갖는 다음 위치를 새로운 노드의 다음위치로 지정
		node.link = idxNode.link;
		//그놈의 다음위치를 새로운 노드로 지정.
		idxNode.link = node;
		size++;
	}
	
	void addToFirst(int data)
	{
		//새로운 Node 객체를 생성해서 data(매개변수)를 data영역에 저장...
		Node node = new Node();
		node.data = data;
		
		//head가  null이라면 첫 데이터이므로, head 연결..
		if(head == null)
			head = node;
		
		//아니라면 새로 만들어진 놈의 link를 head로 연결.
		//head를 새로운 놈으로 지정.
		else {
			node.link = head;
			head = node;
		}
		size++;
	}
		
	//마지막 노드로 삽입하는 알고리즘.
	void addToLast(int data)
	{
		//data를 담는 새로운 Node 객체를 생성.
		Node node = new Node();
		node.data = data;
		
		//head가 null이라면 첫 데이터이므로, head에 연결.
		if(head == null)
			head = node;
		
		//아니라면, head로부터 출발해서 맨 마지막놈을 찾아서 마지막놈의 link에 연결.
		else {
			Node temp = head;
			while(temp.link != null)
			{
				temp = temp.link;
			}
			temp.link = node;
		}
		size++;
	}
	
	Node get(int idx)
	{
		//idx번쨰 위치의 data를 리턴.
		if( size <= 0 || size <= idx)	//리스트가 비어있거나 리스트 밖 인덱스 접근이라면
		{
			return null;
		}
		else
		{
			//head로부터 idx번 만큼 다음으로 이동시킨 후 그 위치의 객체를 리턴.
			Node temp = head;
			for(int i = 0; i < idx; i++)
			{
				temp = temp.link;		//한번씩 다음으로 가는것.
			}

			return temp;
		}
	}
	
	
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		Node tmp = head;
		while(tmp != null)
		{
			sb.append(tmp.data).append(" ");
			tmp = tmp.link;
		}
		return sb.toString();
	}
	
	static class Node {
		int data;
		Node link;
	}
}

public class MyLinkedListTest {

	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		list.addToFirst(10);
		list.addToFirst(20);
		list.addToFirst(30);
		list.addToLast(50);
		
		System.out.println(list);
//		System.out.println(list.get(3).data);
		list.add(3, 40);
		System.out.println(list);
	}

}
