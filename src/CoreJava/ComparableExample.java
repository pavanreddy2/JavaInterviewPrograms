package CoreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User implements Comparable<User>{
    int rollno;
    String name;
    int age;

    public User(int rollno, String name, int age) {
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }


    public int compareTo(User user) {
        if (age == user.age) {
            return 0;
        } else if (age > user.age) {
            return 1;
        } else {
            return -1;
        }
    }

}
public class ComparableExample {
    public static void main(String[] args) {
        List<User> al = new ArrayList<>();
        al.add(new User(101,"vijay",23));
        al.add(new User(102,"pavan",22));
        al.add(new User(103,"sai",24));

        Collections.sort(al);
        for (User user :al) {
            System.out.println(user.rollno+" "+user.name+" "+user.age);
        }
    }
}
