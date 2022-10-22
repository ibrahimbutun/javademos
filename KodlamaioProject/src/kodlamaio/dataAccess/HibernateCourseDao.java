package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class HibernateCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("-------------------------------------");
        System.out.println("Kurs Hibernate veritabanına eklendi! ");
    }
}
