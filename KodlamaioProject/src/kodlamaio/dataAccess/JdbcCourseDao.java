package kodlamaio.dataAccess;

import kodlamaio.entities.Course;

public class JdbcCourseDao implements CourseDao {
    public void add(Course course) {
        System.out.println("---------------------");
        System.out.println("Kurs JDBC veritabanına eklendi!");
    }
    
}
