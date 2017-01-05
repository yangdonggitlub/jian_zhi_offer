package ½£Ö¸offer;
import java.util.ArrayList;
public class Print_the_list {
public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
	ArrayList<Integer> arraylist = new ArrayList<Integer>();
	while(listNode != null)
	{
		arraylist.add(0, listNode.val);
		listNode = listNode.next;
	}
	return arraylist;
        
    }

	public static void main(String[] args) {
	
	 }
}
