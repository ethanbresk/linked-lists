public class BasicSinglyLinkedList implements SinglyLinkedList {

	Node head;
	Node tail;

	@Override
	public Node getFirst() {
		return head; // head
	}


	@Override
	public Node getLast() {
		return tail; // tail
	}


	@Override
	public int size() {
		int count = 0;
		Node current = head;

		while (current != null) { // Iterate through list
			current = current.next;
			count += 1;
		}

		return count;
	}


	@Override
	public boolean isEmpty() {
		if (head == null) { // List empty
			return true;
		} else {
			return false;
		}
	}


	@Override
	public void clear() {
		head = null;
	}


	@Override
	public Node insert(Node cursor, String value) {
		Node newNode = new Node(value);

		if (head == null) { // List empty
			head = newNode;
			tail = newNode;
		}

		else if (cursor == tail) { // Insert after tail
			tail.next = newNode;
			tail = newNode;
		}

		else {
			newNode.next = cursor.next;
			cursor.next = newNode;
		}

		return newNode;
	}


	@Override
	public Node append(String value) {
		Node newNode = new Node(value);

		if (head == null) { // List empty
			head = newNode;
			tail = newNode;
		}

		else {
			tail.next = newNode;
			tail = newNode;
		}

		return newNode;
	}


	@Override
	public void removeAfter(Node cursor) {
		Node sucNode;

		if (cursor == null && head != null) { // head is not null
			sucNode = head.next;
			head = sucNode;

			if (sucNode == null) {
				tail = null;
			}

		}

		else if (cursor.next != null) { // next is not null
			sucNode = cursor.next.next;
			cursor.next = sucNode;

			if (sucNode == null) {
				tail = cursor;
			}
		}
	}


	@Override
	public Node find(Node start, String key) {
		Node curNode = start;

		while (curNode != null) {
			if (curNode.value == key) { // if values match
				return curNode;
			}
			curNode = curNode.next;
		}

		return null;
	}


	@Override
	public void printWholeList() {
		Node current = head;

		while (current != null) { // Iterate & print
			System.out.print(current.value + " ");
			current = current.next;
		}
	}
}
