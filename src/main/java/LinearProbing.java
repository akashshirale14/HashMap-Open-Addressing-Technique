public class LinearProbing<K,V> implements Probing {

    private int X;
    private int A;

    //Basically building the equation P(X) = AX MOD N;
    //Rule says that GCD(A,N) ==1, to get a cycle.
    //Lets keep A as 2 and N as 5 -->  always increase size by 2N+1
    public LinearProbing(){
        X=1;
        A=2;
    }

    public boolean executeLinearProbing(Entry entry){
        K key = (K)entry.getKey();
        V value = (V)entry.getValue();

        int index =  (key.hashCode() + A*X)% MyMap.getMaxSize();
        Entry[] array =MyMap.getArray();
        int  i = 0;
        while(array[index]!=null){
            if(i>MyMap.getMaxSize()){
                return false;
            }
            X++;
            index = (key.hashCode() + A*X)% MyMap.getMaxSize();
        }
        array[index]=entry;

        return true;
    }


}
