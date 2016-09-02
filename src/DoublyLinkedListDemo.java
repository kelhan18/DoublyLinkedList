//Keller Han
//Write a demo class that will create an object of the class DoublyLinkedList and then run it. Nodes will be inserted and deleted, and methods of the class will be tested.
//The final list will be displayed at the end

public class DoublyLinkedListDemo {

	/*-------------------------------------------------------------
	|  Method: [Main]
	|
	|  Purpose:  [To create a demo where we test theDoublyLinkedList() class and use its methods to test class definitions.]
	|
	|  Pre-condition:  [The DoublyLinkedList() class must contain all the methods necessary to modify a double linked list.]
	|
	|  Post-condition: [Nodes will be inserted and deleted, and at the end the list will be displayed.]
	|
	|  Parameters: [N/A]
	|
	|  Returns:  [N/A]
	*------------------------------------------------------------------*/
	public static void main(String[] args) {
		DoublyLinkedList demo = new DoublyLinkedList();
		demo.addANodeToStart("One"); //one starts off the list
		demo.addANodeToStart("Two"); //two inserted before one
		demo.addANodeToStart("Three"); //three inserted before two
		demo.resetIteration();
		demo.setDataAtCurrent("Four"); //four replaces three
		demo.insertNodeAfterCurrent("Five"); //five inserted after four
		demo.deleteCurrentNode(); //four is deleted
		demo.findInList("Five"); //current is set to five
		demo.insertNodeAfterCurrent("Six"); //six inserted after five
		demo.insertNodeAfterCurrent("Seven"); //seven inserted after five and before six
		demo.goToNext(); //current is set to seven
		demo.setDataAtCurrent("Eight"); //eight replaces seven
		demo.showListState();
	}
}
