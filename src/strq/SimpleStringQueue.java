package strq;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by c4q-madelyntavarez on 12/10/15.
 */
public class SimpleStringQueue implements StringQueue
{
    String string;
    Queue<Character> stringQueue;
    public SimpleStringQueue(){
        stringQueue= new LinkedList<Character>();
    }

    @Override
    public int length()
    {
        return stringQueue.size();
    }

    @Override
    public void enqueue(String string)
    {
        //did not add to throw null pointer exception because exception is thrown automatically
        this.string= string;
        for(int i=0;i<string.length();i++){
            stringQueue.add(string.charAt(i));
        }
    }

    @Override
    public String dequeue(int length)
    {
        if(length>length()){
            throw new RuntimeException("Length Of Current String In Queue Exceeded");
        }
        int start=0;
        String toReturn="";
        while(start<length){
            toReturn+=stringQueue.remove();
            start++;
        }
        return toReturn;
    }


    public static void main(String[] args)
    {
        SimpleStringQueue simpleStringQueue= new SimpleStringQueue();
        simpleStringQueue.enqueue("MADELYN");
        System.out.println(simpleStringQueue.length());
        System.out.println(simpleStringQueue.dequeue(3));
        System.out.println(simpleStringQueue.dequeue(3));
        System.out.println(simpleStringQueue.dequeue(1));
        System.out.println(simpleStringQueue.dequeue(8));
    }
}
