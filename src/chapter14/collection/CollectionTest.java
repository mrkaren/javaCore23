package chapter14.collection;

import homework.onlineStore.model.User;
import homework.onlineStore.model.enums.UserType;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectionTest {

    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("poxos");
//        names.add("petros");
//
//        for (String name : names) {
//            System.out.println(name);
//        }
//        System.out.println("----------");
//        names.remove(0);
//
//        for (String name : names) {
//            System.out.println(name);
//        }

//        List<Integer> numbers = new LinkedList<>();
//
//        numbers.add(5);
//        numbers.add(50);
//        numbers.add(6);
//
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
//        System.out.println("-----");
//        numbers.remove(Integer.valueOf(50));
//        for (Integer number : numbers) {
//            System.out.println(number);
//        }
//
//        List<String> names = new LinkedList<>();
//
//        names.add("poxos");

//        List<User> users = new ArrayList<>();
//        User user = new User("123","Poxos","poxos@mail.com", "123456", UserType.USER);
//        users.add(user);
//
//        for (User user1 : users) {
//            System.out.println(user1);
//        }


        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("Poxos");
        myQueue.add("Aram");
        myQueue.add("Zaven");

//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());
//        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        for (String s : myQueue) {
            System.out.println(s);
        }



    }
}
