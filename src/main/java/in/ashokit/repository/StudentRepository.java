package in.ashokit.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ashokit.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {


}



//@Query("delete from Student where id = :sid")
//@Modifying
//@Transactional
//public void deleteStudent(Integer sid);
//
//@Query("update Student set gender=:gender where id=:sid")
//@Modifying
//@Transactional
//public Integer updateStudent(Integer sid, String gender);
//
//@Query(value = "insert into student_dtls(student_id,student_name,student_gender) values(:id, :name, :gender)", nativeQuery = true)
//@Modifying
//@Transactional
//public void insertStudent(Integer id, String name, String gender);

/*
 * //Native SQL Query...
 * 
 * @Query(value = "select * from student_dtls", nativeQuery = true) public
 * List<Student> getAllStudent();
 * 
 * //HQL Query
 * 
 * @Query("from Student") public List<Student> getStudent();
 */
	
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