package CoreJava;

import java.util.*;

class Employee {
    private int id;
    private String name;
    private int age;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
//Age Comparator
class AgeComparator implements Comparator<Employee>{

    public int compare(Employee e1, Employee e2) {
        if (e1.getAge() > e2.getAge()) {
            return 1;
        } else if (e1.getAge() < e2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}

//sorted by name
    class ComparebyName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
public class ComparatorExample {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"pavan",25));
        list.add(new Employee(102,"sai",29));
        list.add(new Employee(103,"sunitha",23));

        System.out.println("Sorting by age");
        Collections.sort(list,new AgeComparator());

        System.out.println(list);
      /*  for (Employee e:list) {
            System.out.println(e.getId()+" "+e.getName()+""+e.getAge());
        }*/

        System.out.println("Sorting by Name");
        //Sorted by Name
        Collections.sort(list,new ComparebyName());
        System.out.println(list);
          /*  for (Employee e1: list) {
                System.out.println(e1.getId()+" "+e1.getName()+" "+e1.getAge());
            }*/
    }
}
