import kodlamaio.business.CategoryManager;
import kodlamaio.business.CourseManager;
import kodlamaio.core.logging.DataBaseLogger;
import kodlamaio.core.logging.FileLogger;
import kodlamaio.core.logging.Logger;
import kodlamaio.core.logging.MailLogger;
import kodlamaio.dataAccess.JdbcCategoryDao;
import kodlamaio.dataAccess.JdbcCourseDao;
import kodlamaio.entities.Category;
import kodlamaio.entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {
        Logger[] loggers = {new DataBaseLogger(), new FileLogger(), new MailLogger()};
        
        CategoryManager categoryManager = new CategoryManager(new JdbcCategoryDao(), loggers);
        Category category1 = new Category("Web", 1);
        categoryManager.add(category1);
        System.out.println("------------------------------------");

        CourseManager courseManager = new CourseManager(loggers, new JdbcCourseDao());
        Course course1 = new Course(1, "Python", 11);
        courseManager.add(course1);
        System.out.println("------------------------------------");
        
        Course course2 = new Course(2, "Java", 10);
        courseManager.add(course2);

    }
}
