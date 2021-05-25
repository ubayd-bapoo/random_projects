
public class tryBST {
	public static void main(String[] args){
		
		BST tree = new BST();
		
		int[] data = {4,2,3,1,6,5,7};
		
		for(int i=0; i<7; i++){
			tree.insert(data[i]);}
		
		System.out.printf("        %s   \n",tree.root.data);
		System.out.printf("   %s        %s  \n",tree.root.left.data,tree.root.right.data);
		System.out.printf(" %s   %s    %s   %s  \n",tree.root.left.left.data,tree.root.left.right.data,tree.root.right.left.data,tree.root.right.right.data);
		
		tree.search(7);
	}
}
