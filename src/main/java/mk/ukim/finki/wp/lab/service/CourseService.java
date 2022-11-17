package mk.ukim.finki.wp.lab.service;

import mk.ukim.finki.wp.lab.model.Course;
import mk.ukim.finki.wp.lab.model.Student;

import java.util.List;

public interface CourseService {
    List<Course> listAll();

    List<Student> listStudentsByCourse(Long courseId);

    Course addStudentInCourse(String username, Long courseId);

    Course findById(Long courseId);

    void saveCourse(String courseName, String courseDescription, Long teacherId) throws Exception;

    void deleteCourse(Long courseId) throws Exception;

    void editCourse(Long courseId, String courseName, String courseDescription, Long teacherId) throws Exception;

}
