package ru.home.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import ru.home.models.Course;

public interface CoursesRepository extends Crud<Course> {

}
