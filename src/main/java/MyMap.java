public class MyMap<K,V> {

    private static int currSize;
    private static int maxSize;
    private static double loadFactor;
    private static Entry[] array;
    Probing<K,V> lp;
    public MyMap(){
        lp = new LinearProbing<K,V>();
        loadFactor=0.35;
        currSize = 0;
        maxSize = 9;
        array = new Entry[5];
    }


    public void put(K key, V value){
        Entry entry = new Entry(key,value);
        boolean  ans = lp.executeLinearProbing(entry);
        if(!ans){
            resizeMap();
        }
    }
    

    public V get(K key){
    }


    public boolean remove(K key){

    }

    public static Entry[] getArray(){
        return array;
    }

    public static int getMaxSize(){
        return maxSize;
    }

    public void resizeMap(){

    }








}
