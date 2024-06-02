import java.util.Arrays;
import java.util.Objects;

public class MyStack <T>{

    private T [] data = (T[]) new Object[2];
    private int size=0;

    public void push(T element){
        if(size>=data.length){
            data= Arrays.copyOf(data, data.length+3);
        }
        data[size] = element;
        size++;
        System.gc();
    }

    public T peek (){
        return data[size-1];
    }

    public T pop(){
        T result = data[size-1];
        data[size-1]=null;
        size--;
        return result;
    }



    public void remove (int index){
        Objects.checkIndex(index,size);
        data[index]=null;
        for (int i=index;i<data.length;i++){
            try {
                data[i] = data[i + 1];

            } catch (ArrayIndexOutOfBoundsException e){
                data[i]=null;
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

}
