/**
 * Defines the interface for a singly-linked list.
 * 
 */
public interface SinglyLinkedList {

	/**
	 * @return Reference to the first node. If the list is empty, this method
	 *         returns null.
	 */
	public Node getFirst();


	/**
	 * @return Reference to the last node . If the list is empty, this method
	 *         returns null.
	 */
	public Node getLast();


	/**
	 * @return Number of nodes in the list
	 */
	public int size();


	/**
	 * @return true if the list has no nodes; false otherwise
	 */
	public boolean isEmpty();


	/**
	 * Removes all nodes in the list.
	 */
	public void clear();


	/**
	 * Inserts a new node with the given value after cursor.
	 * 
	 * @param cursor
	 *            The node to insert after. Set this to null to insert value as the
	 *            new first Node.
	 * @param value
	 *            The value to insert
	 * @return a reference to the newly inserted Node
	 */
	public Node insert(Node cursor, String value);


	/**
	 * Inserts a new node with the given value at the "end" of the list.
	 * 
	 * @param value
	 * @return a reference to the newly inserted Node
	 */
	public Node append(String value);


	/**
	 * Removes the node after the specified Node (cursor) from the list.
	 * 
	 * @param cursor
	 *            A reference to the Node to remove.
	 */
	public void removeAfter(Node cursor);


	/**
	 * Returns a reference to the first Node containing the key, starting from the
	 * given Node.
	 * 
	 * @param start
	 * @param key
	 * @return a reference to the first Node containing the key
	 */
	public Node find(Node start, String key);


	/**
	 * Prints the values of all the items in a list
	 */
	public void printWholeList();

}
