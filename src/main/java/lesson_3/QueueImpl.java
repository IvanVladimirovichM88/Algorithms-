package lesson_3;

public class QueueImpl <E> implements Queue<E>{

    protected final E[] data;
    protected int size;

    protected int head;
    protected int tail;

    private final int HEAD_DEFAULT = 0;
    private final int TAIL_DEFAULT = -1;

    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.head = HEAD_DEFAULT;
        this.tail = TAIL_DEFAULT;
    }

    @Override
    public boolean insert(E value) {
        if(isFull()){
            return false;
        }

        if(tail == data.length-1){
            tail = TAIL_DEFAULT;
        }

        data[++tail] = value;
        size++;
        return true;
    }

    @Override
    public E remove() {

        if (isEmpty()){
            return null;
        }

        E value = data[head];
        if ( head > tail && head == data.length-1 ) {
            head = 0;
        }else if (head == tail){
            head = HEAD_DEFAULT;
            tail = TAIL_DEFAULT;
        }else{
            head++;
        }
        size--;

        return value;
    }

    @Override
    public E peekFront() {
        return data[head];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        if (size == 0){
            return "queue is Empty!!";
        }

        StringBuilder sb = new StringBuilder("[");
        int position = head;
        sb.append(data[position]);

        if(head == tail){
            sb.append("]");
            return sb.toString();
        }

        sb.append(", ");
        boolean isHeadBeforeTail = tail < head;
        do {
            position++;
            if ( isHeadBeforeTail && (position == data.length) ){
                position = 0;
                isHeadBeforeTail = false;
            }

            sb.append(data[position]);
            if(position!=tail){
                sb.append(", ");
            }

        }while (position != tail);

        sb.append("]");
        return sb.toString();
    }


}
