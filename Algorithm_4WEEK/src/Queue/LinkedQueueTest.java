package Queue;

class LinkedQueue {
	Node front;
	Node rear;
	
	void enQueue(int data)
	{
		Node newNode = new Node();
		newNode.data = data;
		if( front == null)
		{
			front = newNode;
			rear = newNode;
		}
		else
		{
			rear.link = newNode;
			rear = newNode;
		}
	}
	
	int deQueue()
	{
		Node newNode = new Node();
		
		if (front == null)
			return -1;
		
		int data = front.data;
		front = front.link;
		
	}
	
	
	
	static class Node {
		int data;
		Node link;
	}
}