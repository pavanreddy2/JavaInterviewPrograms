package myInterviewExampleInWord;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Person implements Serializable{
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private transient String address;

    public Person(int id, String name,String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
public class SerializationExample2 {
    public static void main(String[] args) throws IOException {
            serializedPerson();
        List<Person> deserializedList = deserialization();
            if (deserializedList != null){
                deserializedList.forEach(System.out::println);
            }
    }

    public static void serializedPerson () throws IOException {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("F:\\All My Practice\\Person.ser"))){
           // List<Person> list = new ArrayList<>();
            List<Person> personList = Arrays.asList(new Person(1,"Pavan","Kurnool"),
                         new Person(1, "anurudh","Bangalore"));

           List<Person> list =  personList.stream()
                            .collect(Collectors.toList());
            System.out.println("Person Object has been serialized.." + list);
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static List<Person> deserialization() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("F:\\All My Practice\\Person.ser"))) {
            return (List<Person>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
