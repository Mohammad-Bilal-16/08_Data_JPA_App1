package in.ashokit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Student;
import in.ashokit.repository.StudentRepository;
import in.ashokit.repository.TeacherRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		List<Student> genderList = studentRepository.findByGender("MALE");
		genderList.forEach(s -> System.out.println(s));
		

		List<Student> byRankGreaterThanEqual = studentRepository.findByRankGreaterThanEqual(11l);
		byRankGreaterThanEqual.forEach(System.out::println);

//		List<Student> byGenderIsNull = studentRepository.findByGenderIsNull();
//		byGenderIsNull.forEach(System.out::println);

		List<Student> studentListRankLess = studentRepository.findByRankLessThanEqual(11l);
		studentListRankLess.forEach(System.out::println);

		List<Student> listStudent = studentRepository.findByGenderAndRankGreaterThanEqual("MALE", 11l);
		listStudent.forEach(System.out::println);

//		Student s = new Student(101 , "Katy" , 1l , "FEMALE" , "A");
//		Student s1 = new Student(102 , "Max" , 11l , "MALE" , "A");
//		Student s2 = new Student(103 , "Alex" , 12l , "MALE" , "A");
//		Student s3 = new Student(104 , "Charls" , 2l , "MALE" , "A");
//		Student s4 = new Student(105 , "Dayle" , 9l , "MALE" , "A");
//		Student s5 = new Student(106 , "David" , 234l , "MALE" , "A");
//
//		List<Student> studentList = Arrays.asList(s, s1, s2, s3, s4, s5);
//		studentRepository.saveAll(studentList);

//		long count = studentRepository.count();
//		System.out.println("Record Count :: " + count);

//		if(studentRepository.existsById(103)){
//			studentRepository.deleteById(103);
//			System.out.println("Record deleted...");
//		}else{
//			System.out.println("Record is not Present...");
//		}

//		Iterable<Student> findAll = studentRepository.findAll();
//		//findAll.forEach(student -> System.out.println(student));
//		findAll.forEach(System.out::println);

//		Optional<Student> optional = studentRepository.findById(101);

//		if(optional.isPresent()){
//			System.out.println(optional.get());
//		}
//		System.out.println("Student Record inserted....");

//		Student s = new Student();
//		s.setId(101);
//		s.setName("Bilal");
//		s.setRank(1234l);
//		studentrepo.save(s);
//
//		System.out.println("Student Record inserted....");

		TeacherRepository teacherRepository = context.getBean(TeacherRepository.class);

//		Teacher t = new Teacher();
//		t.setId(101);
//		t.setName("Ashok");
//		t.setSubject("Java Spring Boot");
//
//		teacherRepository.save(t);
//		System.out.println("Teacher Record inserted.....");
	}
}

//		ProductRepository productRepo = context.getBean(ProductRepository.class);
//
//		productRepo.getAllProducts().forEach(System.out::println);