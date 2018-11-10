
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

	public void BFSsearch(Node root) {

		if (root == null) {
			return;
		}

		Queue<Node> BFS = new LinkedList<>();

		BFS.add(root);

		while (!BFS.isEmpty()) {

			root = BFS.poll();

			System.out.print(" " + root.key);

			if (root.left != null) {

				BFS.add(root.left);
			}

			if (root.right != null) {

				BFS.add(root.right);
			}

		}
	}
}
