package lesson_3;

public class Main {
    public static void main(String[] args) {
//        testQueue();
        testDeque();
    }

    private static void testQueue(){
        Queue<Integer> queue = new QueueImpl<>(5);
        System.out.println("add element: "+queue.insert(34));
        System.out.println("add element: "+queue.insert(45));
        System.out.println("add element: "+queue.insert(56));
        System.out.println("add element: "+queue.insert(67));
        System.out.println("add element: "+queue.insert(78));
        System.out.println("add element: "+queue.insert(89));

        queue.display();
        System.out.println("remove: "+queue.remove());
        queue.display();
        System.out.println("add element: "+queue.insert(89));
        queue.display();
        System.out.println("remove 1: "+queue.remove());
        queue.display();
        System.out.println("remove 2: "+queue.remove());
        queue.display();
        System.out.println("remove 3: "+queue.remove());
        queue.display();
        System.out.println("remove 4: "+queue.remove());
        queue.display();
        System.out.println("remove 5: "+queue.remove());
        queue.display();

        System.out.println("add element: "+queue.insert(34));
        System.out.println("add element: "+queue.insert(45));
        System.out.println("add element: "+queue.insert(56));
        System.out.println("add element: "+queue.insert(67));
        System.out.println("add element: "+queue.insert(78));
        System.out.println("add element: "+queue.insert(89));

        queue.display();

    }

    private static void testDeque(){
        Deque<Integer> deque = new DequeImpl<>(5);
        System.out.println("add element: "+deque.insertRight(34));
        System.out.println("add element: "+deque.insertRight(45));
        System.out.println("add element: "+deque.insertRight(56));
        System.out.println("add element: "+deque.insertRight(67));
        System.out.println("add element: "+deque.insertRight(78));
        System.out.println("add element: "+deque.insertRight(89));

        deque.display();

        deque.removeLeft();
        deque.display();

        deque.removeRight();
        deque.display();

        deque.insertRight(89);
        deque.display();

        deque.insertRight(90);
        deque.display();

        System.out.println("remove 1- "+ deque.removeRight());
        deque.display();
        System.out.println("remove 2- "+ deque.removeRight());
        deque.display();
        System.out.println("remove 3- "+ deque.removeRight());
        deque.display();
        System.out.println("remove 4- "+ deque.removeRight());
        deque.display();
        System.out.println("remove 5- "+ deque.removeRight());
        deque.display();

        System.out.println("--> LEFT test");

        System.out.println("add element: "+deque.insertLeft(34));
        System.out.println("add element: "+deque.insertLeft(45));
        System.out.println("add element: "+deque.insertLeft(56));
        System.out.println("add element: "+deque.insertLeft(67));
        System.out.println("add element: "+deque.insertLeft(78));
        System.out.println("add element: "+deque.insertLeft(89));
        deque.display();

        System.out.println("remove 1- "+ deque.removeLeft());
        deque.display();
        System.out.println("remove 2- "+ deque.removeLeft());
        deque.display();
        System.out.println("remove 3- "+ deque.removeLeft());
        deque.display();
        System.out.println("remove 4- "+ deque.removeLeft());
        deque.display();
        System.out.println("remove 5- "+ deque.removeLeft());
        deque.display();

    }
}
