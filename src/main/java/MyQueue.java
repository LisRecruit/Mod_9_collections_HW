import java.util.Arrays;

public class MyQueue <T>{
    private T [] data = (T[]) new Object[2];
    private int size=0;

    public void add (T element){
        if(size>=data.length){
            data= Arrays.copyOf(data, data.length+3);
        }
        data[size] = element;
        size++;
        System.gc();
    }
    public T peek (){
        return data[0];
    }

    public T poll(){
        T result=data[0];
        data=Arrays.copyOfRange(data,1,data.length);
        size--;
        return result;
    }

    public int size(){
        return size;
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
