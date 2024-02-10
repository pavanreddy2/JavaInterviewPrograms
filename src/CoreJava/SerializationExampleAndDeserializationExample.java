package CoreJava;

import java.io.*;

class Student implements Serializable{
    int id;
    String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
public class SerializationExampleAndDeserializationExample{
    public static void main(String[] args) {
        Student s1 = new Student(101,"Pavan");
        FileOutputStream file;

        {
            try {
                file = new FileOutputStream("serialization.txt");
                ObjectOutputStream out = new ObjectOutputStream(file);
                out.writeObject(s1);
                out.flush();
                System.out.println("Obejct Successfully saved in the file");

                //create a stream to read the object
                FileInputStream file1 = new FileInputStream("serialization.txt");
                ObjectInputStream inputStream = new ObjectInputStream(file1);
                Student s = (Student) inputStream.readObject();
                System.out.println(s.id +" "+s.name);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
