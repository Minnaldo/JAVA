package Tree;

import java.util.Arrays;

public class MaxHeap {
	private int[] tree;
	int size = 0;
	int max_depth;
	public MaxHeap(int max_depth){
		this.max_depth = max_depth;
		tree = new int[1 << max_depth];
		tree[0] = 987654321;
	}
	public int poll() {
		int data = tree[1];
		tree[1] = tree[size--];
		changeChild(1);
		return data;
	}
	
	public void changeChild(int node) {
		if( node >= size/2 && node <= size ) {
			return;
		}
		
		if( tree[ leftChild(node) ] > tree[ rightChild(node) ]  ) {
			//왼쪽이 더 큼
			//그 왼쪽이 나보다도 큼. 그럼 바꿔
			if( tree[node] < tree[ leftChild(node) ] ) {
				int tmp = tree[node];
				tree[node] = tree[ leftChild(node) ];
				tree[ leftChild(node) ] = tmp;
				changeChild(leftChild(node));
			}
		}
		else {
			//오른쪽이 더 큼
			if( tree[node] < tree[ rightChild(node) ] ) {
				int tmp = tree[node];
				tree[node] = tree[ rightChild(node) ];
				tree[ rightChild(node) ] = tmp;
				changeChild(rightChild(node));
			}
		}
	}
	
	public void add(int data){
		tree[++size] = data;
		
		//현재 이번에 들어간 노드
		int current = size;
		while( tree[current]  > tree[parent(current)] ) {
			int tmp = tree[current];
			tree[current] = tree[parent(current)];
			tree[parent(current)] = tmp;
			current = parent(current);
		}
	}
	public int parent(int node) {
//		System.out.println(tree[node/2]);
		return node/2;
	}
	public int leftChild(int node) {
//		System.out.println(tree[node*2]);
		return 2 * node;
	}
	public int rightChild(int node) {
//		System.out.println(tree[node*2+1]);
		return 2 * node + 1;
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
		MaxHeap heap = new MaxHeap(4);
		heap.add(13);
		heap.add(10);
		heap.add(12);
		heap.add(18);
		heap.add(20);
		heap.add(29);
		System.out.println(heap);
		heap.poll();
		System.out.println(heap);
	}
}

