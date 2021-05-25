
public class openHash{
    public int hash(int k,int m){
        int hashed=k%m;
        System.out.println(hashed);
        return hashed;
        
        }

    public static void main(String[]args){
        //Scanner keyboard=new Scanner (System.in);
        //System.out.println"Enter number of keys you wish to enter.>>");
        //int number=keyboard.nextInt;
        openHash run=new openHash();
        int [] keys={18,41,22,44,59,32,31,73};
        int [] hashTable=new int [13];
        
        for(int i =0;i<keys.length;i++){
            int k=keys[i];
            int m=13;
            int x=0;
            int hashed=run.hash(k,m);
            if(hashTable[hashed]==0){
                hashTable[hashed]=keys[i];
                }
            else{
                
                while(x!=1){
                    hashed++;
                    if(hashTable[(hashed)%m]==0){
                        hashTable[(hashed)%m]=keys[i];
                        x=1;
                        }
                    
                }
            }
             
            }
        
        for(int j =0;j<hashTable.length;j++){
            
            System.out.print(hashTable[j]+"\t");
            }
        System.out.println();
        
        }
    
    
    
}
   