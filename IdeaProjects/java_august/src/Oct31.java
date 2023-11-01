
import java.util.LinkedList;
import java.util.List;

public class Oct31 {

    public static void main(String[] args) {

        List<Student> students = new LinkedList<>();
        students.add(new Student("A", 35));
        students.add(new Student("b", 42));
        students.add(new Student("C", 38));
        students.add(new Student("D", 67));


             //LOgic
                Student oldestStudent = students.get(0);
                for (int i = 1; i < students.size(); i++) {
                    Student currentStudent = students.get(i);
                    if (currentStudent.getAge() > oldestStudent.getAge()) {
                        oldestStudent = currentStudent;
                    }
                }


                System.out.println("The oldest student  age is: " +  oldestStudent.getAge());
            }
        }

        class Student {
            private String name;
            private int age;

            public Student(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

