package in.ashokit.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import in.ashokit.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer> {
	
	//Native SQL Query...
	@Query(value = "select * from student_dtls", nativeQuery = true)
	public List<Student> getAllStudent();
	
	//HQL Query
	@Query("from Student")
	public List<Student> getStudent();
}
	
//	// select * from student_dtls where student_gender=:gender
//	public List<Student> findByGender(String gender);
//	
////
//    // select * from student_dtls where student_gender is null
//    public List<Student> findByGenderIsNull();
//
//    // select * from student_dtls where student_rank >= : rank
//    public List<Student> findByRankGreaterThanEqual(Long rank);
//
//    // select * from student_dtls where student_rank <= : rank
//    public List<Student> findByRankLessThanEqual(Long rank);
//
//
//
//    // male students who are having rank >=100 ;
//    // select * from student_dtls where student_gender=? and student_rank >= :rank
//
//    public List<Student> findByGenderAndRankGreaterThanEqual(String gender, Long rank);

//}
//	@Query("update Student set gender=:gender where id=:sid")
//	@Modifying
//	@Transactional
//	public Integer updateStudent(Integer sid, String gender);