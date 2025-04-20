package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher , Integer> {
}
