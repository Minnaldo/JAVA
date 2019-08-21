import java.util.Arrays;

public class BinaryTree {
	private char[] tree;
	int max_depth;

	public BinaryTree(int max_depth) {
		this.max_depth = max_depth;
		tree = new char[1 << max_depth];
	}

	public void preorder(int node) {
		if ( node >= tree.length || tree[node] == '\0')
			return;
		// 부모 방문
		System.out.print(tree[node]);
		preorder(node * 2);
		preorder(node * 2 + 1);
	}

	public void inorder(int node) {
		if ( node >= tree.length || tree[node] == '\0')
			return;
		// 부모 방문
		inorder(node * 2);
		System.out.print(tree[node]);
		inorder(node * 2 + 1);
	}

	public void postorder(int node) {
		if (node >= tree.length && tree[node] == '\0')
			return;
		// 부모 방문
		postorder(node * 2);
		postorder(node * 2 + 1);
		System.out.print(tree[node]);
	}

	public void levelorder(int node) {

	}

	public void setRoot(char data) {
		tree[1] = data;
	}

	public void setLeft(int parent, char data) {
		tree[parent * 2] = data;
	}

	public void setRight(int parent, char data) {
		tree[parent * 2 + 1] = data;
	}

	public String toString() {
		System.out.println(Arrays.toString(tree));
		// 이쁘게
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < max_depth; i++) {
			// 1 << i : 1 2 4 8
			for (int j = 0; j < (1 << i); j++) {
				// tree[(1 << i) + j]
				sb.append(tree[(1 << i) + j]).append(" ");
			}
			sb.append("\n");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree(4);
		tree.setRoot('A');
		tree.setLeft(1, 'B');
		tree.setRight(1, 'C');
		tree.setLeft(2, 'D');
		tree.setRight(3, 'G');
		tree.setLeft(4, 'H');
		tree.setRight(4, 'I');
		System.out.println(tree);

		tree.inorder(1);
		// 1번노드(루트)로부터 전체 트리를 전위순회방식으로 노드방문이 출력
	}
}
