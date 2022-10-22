package kodlamaio.business;

import java.util.ArrayList;
import java.util.List;

import kodlamaio.core.logging.Logger;
import kodlamaio.dataAccess.CourseDao;
import kodlamaio.entities.Course;

public class CourseManager {
    private Logger[] loggers;    
    private CourseDao courseDao;
    List<Course> courseList = new ArrayList<Course>();

    

    public CourseManager(Logger[] loggers, CourseDao courseDao) {
        this.loggers = loggers;
        this.courseDao = courseDao;
    }



    public void add(Course course) throws Exception  {
        if(course.getPrice()<10){
            throw new Exception("Kursun fiyatı 0'dan küçük olamaz!");            
        }

        for (Course _course : courseList) {
            if(_course.getCourseName().equals(course.getCourseName())){
                throw new Exception("Kurs ismi aynı olamaz !!!");
            }
        }

        courseDao.add(course);
        courseList.add(course);
        

       for (Logger logger : loggers ) {
            logger.log(course.getCourseName());
       }

    }
}
