package in.ashokit.repository;

import in.ashokit.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherRepository extends CrudRepository<Teacher , Integer> {
}
