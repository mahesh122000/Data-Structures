import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
     	private static class MinHeapNode implements Comparable<MinHeapNode> {
		MinHeapNode left, right;
		int frequency;
		Character data;

		@Override
		public String toString() {
			return " " + frequency;
		}

		@Override
		public int compareTo(MinHeapNode node) {
			if (frequency < node.frequency) {
				return -1;
			}
			return 1;
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		for (int i = 0; i < testCases; i++) {
			scanner.nextLine();
			char[] charArray = scanner.nextLine().toCharArray();
			int length = charArray.length;
			int[] freq = new int[length];
			for (int j = 0; j < length; j++) {
				freq[j] = scanner.nextInt();
			}

			PriorityQueue<MinHeapNode> queue = new PriorityQueue<>();
			for (int j = 0; j < length; j++) {
				MinHeapNode node = new MinHeapNode();
				node.data = charArray[j];
				node.frequency = freq[j];
				queue.add(node);
			}

			while (queue.size() > 1) {
				MinHeapNode left = queue.poll();
				MinHeapNode right = queue.poll();
				MinHeapNode node = new MinHeapNode();
				node.data = '$';
				node.frequency = left.frequency + right.frequency;
				node.left = left;
				node.right = right;
				queue.add(node);
			}

			preOrderTraversal(queue.poll(), "");
			System.out.println();

		}
	}

	private static void preOrderTraversal(MinHeapNode minHeapNode, String prefix) {
		if (minHeapNode == null) {
			return;
		}

		if (minHeapNode.data != '$') {
			System.out.print(prefix + " ");
			return;
		}
		preOrderTraversal(minHeapNode.left, prefix + "0");
		preOrderTraversal(minHeapNode.right, prefix + "1");
	}
}