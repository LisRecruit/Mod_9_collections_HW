import java.util.Arrays;
import java.util.Map;

public class MyMap<K, V> {
    private Entry<K, V> [] context = new Entry[8];
    private int size;

    static class Entry<K,V>{
        Entry(K key, V value){
            this.key=key;
            this.value=value;
        }
        final K key;
        V value;
        Entry<K, V> next;

    }


    public void put(K key, V value){
        if (context.length<=size){
            context= Arrays.copyOf(context,context.length+5);
        }
        int index = calculateIndex(key.hashCode());
        Entry<K, V> newEntry = new Entry<>(key, value);
        if (context[index]==null){
            context [index] = newEntry;

        } else {
            Entry<K, V> current = newEntry;

              do {
                  if (current.key.equals(key)){
                      current.value = value;
                      break;
                  }
                  if (current.next == null) {
                      current.next = newEntry;
                  }
                  current=current.next;

              } while (current!=null);
        }
        size++;
    }

    public V get(K key){
        try {


            int index = calculateIndex(key.hashCode());
            if (context[index].equals(key)) {
                return context[index].value;
            } else {
                Entry<K, V> current = context[index];
                while (current != null) {
                    if (current.key.equals(key)) {
                        return current.value;
                    }
                    current = current.next;

                }
                return null;

            }
        } catch (NullPointerException e){
            System.out.println("Key not found");
            return null;
        }

    }

    public void clear(){
        context=new Entry[8];
        size=0;
    }
    public int size (){
        return size;
    }

    public void remove (K key){
        int index = calculateIndex(key.hashCode());

        if (context[index].equals(key)){
            context[index]=null;
        } else {
            Entry<K,V>current = context[index];
            Entry <K,V> previous = null;
            while (current!=null){
                if (current.key.equals(key)){
                    if (previous == null) {
                        context[index]=current.next;
                    } else {
                        previous.next = current.next;
                    }
                    context[index]=current.next;
                    break;
                }
                previous=current;
                current=current.next;

            }


        }
        size--;
    }

    private int calculateIndex(int hashCode){
        return Math.abs(hashCode%context.length);
    }



}
