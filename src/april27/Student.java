package april27;

import java.util.Objects;

public class Student {

    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


//    public boolean equals(Object o){
//
//         if(o instanceof Student){
//             return this.id == ((Student)o).id && this.name.equals(((Student) o).name);
//         }else{
//             return false;
//         }
//
//
//    }

    // WHY do you need to override hashcode() method along with equals() method?

    // hashcode() method prevents hash collisions when sorting the objects




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }
}
