package kodlamaio.entities;

public class Course {
    private int courseId;
    private String courseName;
    private double price;
    
    public Course(int courseId, String courseName, double price) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.price = price;
    }
    public int getCourseId() {
        return courseId;
    }
    public String getCourseName() {
        return courseName;
    }
    public double getPrice() {
        return price;
    }
    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    
}
