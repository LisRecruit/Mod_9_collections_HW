import java.util.Arrays;
import java.util.Objects;

public class MyArrayList<T> {
    private T [] data = (T[]) new Object[2];
    private int size=0;

    public void add (T element){
        if(size>=data.length){
            data=Arrays.copyOf(data, data.length+3);
        }
        data[size] = element;
        size++;
        System.gc();
    }


    public void remove (int startIndex, int endIndex){
        Objects.checkIndex(endIndex,size);
        int index=startIndex;
        for (int i=index;i<=endIndex;i++){
            data[i]=null;
        }
        index=startIndex;
       for (int i=index;i<size;i++){
           if (data[i]!=null){
               data[startIndex]=data[i];
               data[i]=null;
               startIndex++;
           }
       }
       size--;
        System.gc();
    }


    public void remove (int index){
        Objects.checkIndex(index,size);
        data[index]=null;
         //T [] temp = Arrays.copyOfRange(data, 0, index);
         for (int i=index;i<size;i++){
            try {
                data[i] = data[i + 1];

            } catch (ArrayIndexOutOfBoundsException e){
                data[i]=null;                           //need to correctly remove last array item if arr length less than data[i+1]
            }
         }
         size--;
        System.gc();
    }




    public void clear(){
        for(int i=0;i<data.length;i++){
            data[i]=null;
        }
        data=Arrays.copyOf(data, 2);
        size=0;
        System.gc();
    }


    public T get(int index){
        return data[index];
    }

    public int size(){
        return size;
    }


}
