package CoreJava;

import java.util.Objects;

class Teacher {
    int id;
    String name;

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

    public Teacher(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return id == teacher.id && Objects.equals(name, teacher.name);
    }


}
public class HashCodeEquals {
    public static void main(String[] args) {
        Teacher t = new Teacher(1,"Pavan");
        Teacher t2 = new Teacher(1,"Pavan");

        System.out.println(t.hashCode());
        System.out.println(t2.hashCode());
        System.out.println(t.equals(t2));
    }
}
