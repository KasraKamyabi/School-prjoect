import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;

public class Student {

        private String m_name;
        private int m_age;
        private String m_course;
        private String m_year;
        private String m_section;

        public Student( String name, int age, String course, String year, String section )
        {
            m_name = name;
            m_age = age;
            m_course = course;
            m_year = year;
            m_section = section;
        }

        public String getname()
        {
            return m_name;
        }

        public int getage()
        {
            return m_age;
        }

        public String getcourse()
        {
            return m_course;
        }

        public String getyear()
        {
            return m_year;
        }

        public String getsection()
        {
            return m_section;
        }

        public String toString()
        {
            return "name: " + m_name + ", age: " + m_age +
                    ", course: " + m_course + ", year: " + m_year +
                    ", section: " + m_section;
        }


}
