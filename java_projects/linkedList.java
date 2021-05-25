
public class linkedList {
	
	public int length;
	public static node head;
	
	public linkedList(){
		length = 0;
		head = null;}
	
	public static boolean search(node n){
		
		boolean found = false;	
		node here = head;
		
		while(here!= null){
			if(n.data == here.data){
				found = true;
				break;}
			here = here.next;}
		
		System.out.println(here.data);
		return found;}
	
	public void insert(int k){
		node n = new node();
		n.data = k;
		
		if(length == 0){
			head = n;}
		else{
			n.next = head;
			head = n;}
		length ++;}
	
	public node delete(int n){
		
		node result = null;
		node here = head;
		node prev;
		
		if(length == 0){
			System.out.println("nothing to delete");}
		
		else if(n == head.data){
			result = head;
			head = head.next;
			length--;}
		
		else{
			prev = here;
			here = here.next;
			while(here != null){
				if(here.data == n){
					result = here;
					prev.next = here.next;
					length--;
					break;}
				prev = here;
				here = here.next;}}
		
		return result;}
	
	public void print(){
		node here = head;
		while(true){
			System.out.printf("--->%s",here.data);
			if(here.next == null){
				break;}
			else{
				here = here.next;}}}
	
	public static void main(String[] args){
		
		linkedList L = new linkedList();
		
		for(int i = 5; i<=10; i++){
			//System.out.println(L.length);
			L.insert(i);}
		
		L.print();
		System.out.println();
		System.out.println(L.length);
		
		System.out.println();
		
		node n = L.delete(10);
		L.print();
		System.out.println();
		System.out.println(L.length);
		
		node k = new node();
		k.data = 9;
		System.out.println(search(k));
	
	}
}
