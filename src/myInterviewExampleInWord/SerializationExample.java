package myInterviewExampleInWord;

import java.io.*;

public class SerializationExample implements Serializable {

    private static final long serialVersionUID = 1L;

    //Fields applicable for serialization
    private int nonTransientField;
    private transient String transientField; // will not be serialized
    private static String staticField ;
    private final int finalField = 42;

    public SerializationExample(int nonTransientField, String transientField) {
        this.nonTransientField = nonTransientField;
        this.transientField = transientField;
    }

    public static void main(String[] args) {
        serializeObject();

        // Deserialize the object
        SerializationExample deserializedObject = deserializeObject();
        System.out.println("Deserialized Object: " + deserializedObject);
    }

    private static void serializeObject(){
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("F:\\All My Practice\\student"))) {
            SerializationExample objectToSerialize = new SerializationExample(100, "TransientValue");
            oos.writeObject(objectToSerialize);
            System.out.println("Object has been serialized");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static SerializationExample deserializeObject() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("F:\\All My Practice\\student"))) {
            return (SerializationExample) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String toString() {
        return "SerializationExample{" +
                "nonTransientField=" + nonTransientField +
                ", transientField='" + transientField + '\'' +
                ", staticField='" + staticField + '\'' +
                ", finalField=" + finalField +
                '}';
    }
}
