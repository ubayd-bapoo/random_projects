
public class tryHash {
	public static void main(String[] args){
		hashTable H = new hashTable();
		
		node a = new node();
		a.data = 3;
		a.text = "a";
		
		node b = new node();
		b.data = 3;
		b.text = "b";
		
		node c = new node();
		c.data = 4;
		c.text = "c";
		
		node d = new node();
		d.data = 5;
		d.text = "d";
		
		node e = new node();
		e.data = 2;
		e.text = "e";
		
		H.hash(a);
		H.hash(b);
		H.hash(c);
		H.hash(d);
		H.hash(e);
		
		H.print();
		
	}
}
