package vn.formatter;

import org.springframework.core.convert.converter.Converter;
import vn.entity.Student;

import java.util.Date;

public class StudentConverter implements Converter<Date, Student> {
    @Override
    public Student convert(Date source) {
        return null;
    }
}
