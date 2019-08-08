package Queue;

class LinkedQueue{
	Node front;
	Node rear;
	void enQueue(int data) {
		Node newNode = new Node();
		newNode.data = data;
		if( front == null ) {
			front = newNode;
			rear = newNode;
		}
		else {
			rear.link = newNode;
			rear = newNode;
		}
		
	}
	int deQueue() {
		//front가 null이면 빈큐라서 인출못함 ( -1리턴 )
		if( front == null )
			return -1;
		//front의 데이터를 인출하고, front의 link에 있는 놈을 front에 연결
		int data = front.data;
		front = front.link;
		if( front == null )
			rear = null;
		return data;
		
		//front가 null이 되면 rear도 null로 변경
		
	}
	
	
	static class Node{
		int data;
		Node link;
	}
}
public class LinkedQueueTest {
	public static void main(String[] args) {
		LinkedQueue lq = new LinkedQueue();
		lq.enQueue(10);
		lq.enQueue(20);
		
		System.out.println(lq.deQueue());
		System.out.println(lq.deQueue());
		System.out.println(lq.deQueue());
	}
}













