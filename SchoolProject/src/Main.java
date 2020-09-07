import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            ArrayList<Student> students = new ArrayList<Student>();
            ArrayList<Teacher> teachers = new ArrayList<Teacher>();
            Scanner input = new Scanner(System.in);

            int menuChoice = 6;
            do {
                System.out.println("\t\t\twelcome to the school simulator");
                System.out.println("\t\t1. Add Student\t2. Add Teacher\t3. Search Students and teachers\t4. remove student\t5.remove teacher\t6.exit");
                try {
                    System.out.println("Enter a choice: ");
                    menuChoice = Integer.parseInt(input.nextLine());
                } catch (NumberFormatException e) {
                    continue;
                }

                if (menuChoice==1)
                {
                    System.out.println("Full name:");
                    String name = input.nextLine();

                    int age = -1;
                    do {
                            System.out.println("Age:");
                            age = Integer.parseInt(input.nextLine());

                    } while (age <= 0);

                    System.out.println("choose a Course: Programing, Design or Developing");
                    String course = input.nextLine();

                    System.out.println("Year:");
                    String year = input.nextLine();

                    System.out.println("Section 1, 2 or 3 ?:");
                    String section = input.nextLine();
                    System.out.println("Student Added!!!'");

                    Student student = new Student(name, age, course, year, section);

                    students.add(student);



                }
                else if (menuChoice==2) {
                    System.out.println("Full name:");
                    String Name = input.nextLine();
                    System.out.println("choose a Course: Programing, Design or Developing\"");
                    String Course = input.nextLine();
                    System.out.println("Section 1, 2 or 3 ?");
                    String Section = input.nextLine();
                    System.out.println("teacher Added!!!'");
                    Teacher Teacher = new Teacher(Name,Course,Section,Section);
                    teachers.add(Teacher);
                }

                    else if (menuChoice==3) {
                    System.out.println("Students:");
                    for (Student student : students)
                    {
                        System.out.println(student);
                    }
                    System.out.println("teachers : ");
                    for (Teacher teacher : teachers) {
                        System.out.println(teacher);
                    }
                }
                    else if (menuChoice==4) {
                    System.out.println("Please, enter the name to remove the Student: ");
                    String name =input.nextLine();
                    for (Student e : students) {
                        if (e.getname().equals(name)) {
                            students.remove(e);
                           break;
                        }
                    }
                }
                    else if (menuChoice==5) {
                    System.out.println("Please, enter the name to remove the Teacher: ");
                    String name = input.nextLine();
                    for (Teacher e : teachers) {
                        if (e.getName().equals(name)) {
                            teachers.remove(e);
                            break;
                        }
                    }
                }
            } while (menuChoice<6);
        }

    }

