package ru.home.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.home.models.Course;
import ru.home.models.Lesson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CoursesRepositoryJdbcTemlateImpl implements CoursesRepository {

    //language=sql
    private static String SQL_SELECT_ALL_COURSES = "SELECT * from course left join lesson l on course.id = l.course_id";

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private Map<Long, Course> courseMap = new HashMap<>();

    private RowMapper<Course> courseRowMapper = (row, rowNumber) -> {
        Long courseId = row.getLong(1);

        if (!courseMap.containsKey(courseId)) {
            Course course = Course.builder()
                    .id(row.getLong("id"))
                    .title(row.getString("title"))
                    .lessons(new ArrayList<>())
                    .build();
            courseMap.put(courseId, course);
        }

        Lesson lesson = Lesson.builder()
                .id(row.getLong(3))
                .theme(row.getString("theme"))
                .build();
        courseMap.get(courseId).getLessons().add(lesson);
        return null;
    };

    public List<Course> findAll() {
        courseMap.clear();
        jdbcTemplate.query(SQL_SELECT_ALL_COURSES, courseRowMapper);
        List<Course> result = new ArrayList<>(courseMap.values());
        courseMap.clear();
        return result;
    }


    public void save(Course course) {

    }

    public Course find(Long id) {
        return null;
    }

    public void delete(Long id) {

    }
}
