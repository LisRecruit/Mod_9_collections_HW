import java.util.Arrays;
import java.util.Map;

public class MyMap<K, V> {
    private Entry<K, V>[] context = new Entry[2];
    private int size;

    static class Entry<K, V> {
        Entry(K key, V value) {
            this.key = key;
            this.value = value;

        }


        final K key;
        V value;

        Entry<K, V> next;

    }


    public void put(K key, V value) {

        if (context.length <= size) {
            resize();
        }
        Entry<K, V> newEntry = new Entry<>(key, value);



        int index = calculateIndex(key);
        if (key == null){
           if (context[index]==null){
               context[index] = newEntry;
               size++;
           } else {
               Entry<K, V> current = context[index];

               do {

                   if (current.key==null) {
                       if (current.value==null) {
                           current.value = value;
                           //current.bucketIndex=index;
                            size++;
                           return;
                       } else {
                           current.value = value;
                           return;
                       }
                   }
                   if (current.next == null) {
                       current.next = newEntry;
                       size++;
                       //current.next.bucketIndex=index;
                   }
                   current = current.next;

               } while (current != null);
           }

           return;
        }






        if (context[index] == null) {
            context[index] = newEntry;

        } else {
            Entry<K, V> current = context[index];

            do {

                if (current.key!=null && current.key.equals(key)) {
                    current.value = value;
                    //current.bucketIndex=index;
                  //  return;
                }
                if (current.next == null) {
                    current.next = newEntry;
                    //current.next.bucketIndex=index;
                    return;
                }
                current = current.next;

            } while (current != null);
        }



        size++;

        System.gc();
    }

    public V get(K key) {
        int index = calculateIndex(key);
        if (context[index]!=null) {
            if (key != null) {

                if (context[index] != null && context[index].key.equals(key)) {
                    return context[index].value;
                } else {
                    Entry<K, V> current = context[0];

                    do {
                        if (current.key.equals(key)) {
                            return current.value;
                        }
                        current = current.next;
                    } while (current != null);
                    return null;

                }
            } else {
                Entry<K, V> current = context[index];
                if (current.value != null && current.key == null) {
                    return current.value;
                }
                System.out.print("Key not found ");

            }
        }
        return null;
    }


    public void clear() {
        context = new Entry[8];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void remove(K key) {
        int index = calculateIndex(key);

        if (key == null){

                Entry<K, V> current = context[0];
                Entry<K, V> previous = null;
                while (current != null) {
                    if (current.key==null) {
                        if (previous == null) {
                            context[index] = current.next;
                        } else {
                            previous.next = current.next;
                        }
                        context[index] = current.next;
                        break;
                    }
                    previous = current;
                    current = current.next;
                }
            size--;
            return;
        }



        if (context[index].equals(key)) {
            context[index] = null;
        } else {
            Entry<K, V> current = context[index];
            Entry<K, V> previous = null;
            while (current != null) {
                if (current.key.equals(key)) {
                    if (previous == null) {
                        context[index] = current.next;
                    } else {
                        previous.next = current.next;
                    }
                    context[index] = current.next;
                    break;
                }
                previous = current;
                current = current.next;

            }


        }
        size--;
    }

    private int calculateIndex(K key) {
        if (key==null){
            return 0;
        }
        return Math.abs(key.hashCode() % context.length);
    }

    private void resize() {

        Entry<K, V>[] temp = context;
        int oldLength= context.length;


        context = new Entry[size + 10];
        int tempIndex;
        for (int i=0;i<oldLength;i++){
           // if (temp[i].key!=null) {
            if (temp[i].key==null){
                tempIndex=0;
            } else {
                tempIndex = Math.abs(temp[i].key.hashCode() % oldLength);
            }
                context[calculateIndex(temp[i].key)] = temp[tempIndex];
           // }

        }
        System.gc();

    }
}







