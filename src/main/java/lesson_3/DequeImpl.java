package lesson_3;

public class DequeImpl <E> implements Deque<E>{

    protected final E[] data;
    protected int size;

    protected int right;
    protected int left;

    private final int LEFT_DEFAULT = 1;
    private final int RIGHT_DEFAULT = -1;

    private boolean isFirstInsert = true;

    public DequeImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        this.right = RIGHT_DEFAULT;
        this.left = LEFT_DEFAULT;
    }

    @Override
    public boolean insertLeft(E value) {
        if(isFull()){
            return false;
        }
        if (isFirstInsert){
            right++;
            isFirstInsert = false;
        }

        if (left == 0){
            left = data.length;
        }

        data[--left] = value;
        size ++;

        return true;
    }

    @Override
    public boolean insertRight(E value) {
        if(isFull()){
            return false;
        }

        if (isFirstInsert){
            left--;
            isFirstInsert = false;
        }

        if (right == data.length-1){
            right = RIGHT_DEFAULT;
        }

        data[++right] = value;
        size ++;

        return true;
    }

    @Override
    public E removeLeft() {

        if(isEmpty()){
            return null;
        }

        E value = data[left];
        if(right < left && left == data.length-1){
            left = 0;
        } else if (right == left){
            defDeque();
        }else {
            left++;
        }
        size--;

        return value;

    }

    @Override
    public E removeRight() {

        if (isEmpty()){
            return null;
        }

        E value = data[right];
        if(right < left && right == 0){
            right = data.length-1;
        } else if (right == left){
            defDeque();
        }else {
            right--;
        }
        size--;

        return value;
    }

    @Override
    public boolean insert(E value) {
        return insertRight(value);
    }

    @Override
    public E remove() {
        return removeLeft();
    }

    @Override
    public E peekFront() {
        return data[left];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
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
            return "deque is Empty!!";
        }

        StringBuilder sb = new StringBuilder("[");
        int position = left;
        sb.append(data[position]);

        if(left == right){
            sb.append("]");
            return sb.toString();
        }

        sb.append(", ");
        boolean isRightBeforeLeft = right < left;
        do {
            position++;
            if ( isRightBeforeLeft && (position == data.length) ){
                position = 0;
                isRightBeforeLeft = false;
            }

            sb.append(data[position]);
            if(position!=right){
                sb.append(", ");
            }

        }while (position != right);

        sb.append("]");
        return sb.toString();
    }

    private void defDeque(){
        right = RIGHT_DEFAULT;
        left = LEFT_DEFAULT;
        isFirstInsert = true;
    }
}
