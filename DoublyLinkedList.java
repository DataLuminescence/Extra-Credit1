package linkedlists;

public class DoublyLinkedList 
{

	
	class Node{ //a new node for the linkedlist
		int data; //integer data part of the node
		String name; //String part of the node
		Node previous; //link to the previous node
		Node next; //link to the forward node
		  
		public Node(int data,String name) { //Constructor of the node
			this.data = data;
			this.name=name;
		}
		}

		Node headNode, tailNode = null; //Initialization of the pointers
		  
		public void addNode(int data,String name) { //Add node to the list
			Node newNode = new Node(data,name); //create the new node with the data
			
			if(headNode == null) {
				headNode = tailNode = newNode;
				headNode.previous = null;   
				tailNode.next = null;
			}
			else {
				tailNode.next = newNode;
				newNode.previous = tailNode;
				tailNode = newNode;
				tailNode.next = null;
			}
		}   
		
		public void displayList() { //method to display the linkedlist
			Node current = headNode;
			
			if(headNode == null) {
				System.out.println("The list is empty...");
				return;
			}
		
			System.out.println("Here is the linkedlist");
			while(current != null) {
				System.out.println(current.data + " "+current.name+" ");
				current = current.next;
			}
		}
		  
		public static void main(String[] args) {
		  
			DoublyLinkedList dList = new DoublyLinkedList(); //create a new linkedlist
			dList.addNode(1,"Harry"); //adding a node
			dList.addNode(2,"Ron");
			dList.addNode(3,"Hermoiney");

			dList.displayList(); //displaying the whole list
		}

}
