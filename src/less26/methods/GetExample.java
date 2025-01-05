package less26.methods;

// В Generic можно применять несколько подстановок
public class  GetExample <K,V>  {
    private K key;
    private V value;

    public GetExample(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GetExample{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        GetExample<Integer,String> getExample= new GetExample<>(100,"String");
        System.out.println(getExample);
    }
}
