
public class hashTable {
	node[] table = new node[5];
	
	public void insert(node k, int pos){
		if(table[pos]==null){
			table[pos] = k;}
		else{
			node here = table[pos];
			while(true){
				if(here.next == null){
					here.next = k;
					break;}
				
				here = here.next;}}}
	
	public void hash(node n){
		int key = n.data;
		
		int place = key%5;
		insert(n,place);}
	
	public void print(){
		for(int i=0; i<5; i++){
			System.out.printf("hasTable[%s]",i);
			if(table[i] == null){
				System.out.println();}
			
			else{
				node here = table[i];
				while(true){
					System.out.printf("--->%s",here.text);
					if(here.next == null){
						break;}
					else{
						here = here.next;}}
			System.out.println();}}
	}
}
