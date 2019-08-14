package Tree;

public class BinaryTree {
	private char[] tree;
	int max_depth;
	
	public BinaryTree(int max_depth)
	{
		this.max_depth = max_depth;
		tree = new char[1 << max_depth];
	}	
	
	//전위순휘 (Root - Left - Right)
	public void preorder(int node)
	{
		if(node >= tree.length || tree[node] == '\0')
			return;
		//부모 방문
		System.out.print(tree[node]);
//		if(node * 2 < tree.length && tree[node * 2] != '\0')
			preorder(node * 2);
//		if(node * 2 + 1 < tree.length && tree[node * 2 + 1] != '\0')
			preorder(node * 2 + 1);
			
	}
	
	//중위순회 (Left - Root - Right)
	public void inorder(int node)
	{
		if(node >= tree.length || tree[node] == '\0')
			return;
		//부모 방문
		
//		if(node * 2 < tree.length && tree[node * 2] != '\0')
			inorder(node * 2);
			System.out.print(tree[node]);
//		if(node * 2 + 1 < tree.length && tree[node * 2 + 1] != '\0')
			inorder(node * 2 + 1);
	}
	
	//후위순회 (Left - Right - Root)
	public void postorder(int node)
	{
		if(node >= tree.length || tree[node] == '\0')
			return;
		//부모 방문
		
//		if(node * 2 < tree.length && tree[node * 2] != '\0')
			postorder(node * 2);
			
//		if(node * 2 + 1 < tree.length && tree[node * 2 + 1] != '\0')
			postorder(node * 2 + 1);
		
			System.out.print(tree[node]);
	}
	
	public void levelorder(int node)
	{
		
	}
	
	
	public void setRoot(char data)
	{
		tree[1] = data;
	}

	public void setLeft(int parent, char data)
	{
		//*왼쪽 자식은 : (자신의 번호 * 2)   !!!!
		tree[parent * 2] = data;
	}

	public void setRight(int parent, char data)
	{
		//*오른쪽자식은 : (자신의 번호 * 2 + 1) !!!!
		tree[parent * 2 + 1] = data;
	}

	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < max_depth; i++)
		{
			// 1<< i : 1 2 4 8
			for(int j = 0; j < (1 << i); j++)
			{
				//tree[(1 << i) + j]
//				System.out.print(tree[(1 << i) + j] + " ");
				sb.append(tree[(1 << i) + j]).append(" ");
			}
//			System.out.println();
			sb.append("\n");
		}
		//이쁘게
		return sb.toString();
	}
	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(4);
		tree.setRoot('+');
		tree.setLeft(1, '*');
		tree.setRight(1, '/');
		tree.setLeft(2, '+');
		tree.setRight(2, '*');
		tree.setLeft(3, '-');
		tree.setRight(3, '3');
		tree.setLeft(4, '1');
		tree.setRight(4, '5');
		tree.setLeft(5, '2');
		tree.setRight(5, '4');
		tree.setLeft(6, '8');
		tree.setRight(6, '9');
		System.out.println(tree);
//		tree.setRoot('A');
//		tree.setLeft(1, 'B');
//		tree.setRight(1, 'C');
//		tree.setLeft(2, 'D');
//		tree.setRight(2, 'E');
//		tree.setLeft(3, 'F');
//		tree.setRight(3, 'G');
//		tree.setLeft(4, 'H');
//		tree.setRight(4, 'I');
//		tree.setLeft(5, 'J');
//		tree.setRight(5, 'K');
//		tree.setLeft(6, 'L');
//		tree.setRight(6, 'M');
//		System.out.println(tree);
		
		tree.preorder(1);
		//1번노드(루트)로부터 전체 트리를 전위순회방식으로 노드방문이 출력.
		System.out.println();
		tree.inorder(1);
		
		System.out.println();
		tree.postorder(1);
		
		
	}

}
