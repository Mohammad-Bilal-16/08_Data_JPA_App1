package in.ashokit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ashokit.entity.Product;
import in.ashokit.repository.ProductRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		ProductRepository productRepository = context.getBean(ProductRepository.class);
		
		Product p = new Product();
		
		productRepository.save(p);
		System.out.println("Record Inserted....");
	
	}
}

//StudentRepository studentRepository = context.getBean(StudentRepository.class);

/*
 * Student student = studentRepository.findById(101).get();
 * //student.setActiveSW("Y"); student.setActiveSW("N");
 * 
 * studentRepository.save(student);
 */

/*
 * studentRepository.deleteStudent(106); System.out.println("Deleted....");
 */

//TeacherRepository teacherRepository = context.getBean(TeacherRepository.class);
//
//StudentRepository studentRepository = context.getBean(StudentRepository.class);


/*
 * List<Teacher> students = teacherRepository.findAll(Sort.by("subject"));
 * students.forEach(System.out::println);
 */

/*
 * Scanner scan = new Scanner(System.in);
 * System.out.println("Enter Page Number!"); int pageNo = scan.nextInt();
 * 
 * int pageSize = 3;
 * 
 * PageRequest pageRequest = PageRequest.of(pageNo, pageSize); Page<Teacher>
 * students = teacherRepository.findAll(pageRequest); List<Teacher> content =
 * students.getContent(); content.forEach(System.out::println);
 */
 
 


/*
 * Teacher t1 = new Teacher(1 , "Max" , "Java"); Teacher t2 = new Teacher(2 ,
 * "Alex" , "SpringBoot"); Teacher t3 = new Teacher(3 , "Tim" , "Spring");
 * Teacher t4 = new Teacher(4 , "David" , "SQL"); Teacher t5 = new Teacher(5 ,
 * "Jhon" , "AWS");
 * 
 * List<Teacher> Teacherlist = Arrays.asList(t1,t2,t3,t4,t5);
 * teacherRepository.saveAll(Teacherlist);
 */



//List<Student> allStudent = studentRepository.getAllStudent();
//allStudent.forEach(System.out::println);
//
//List<Student> list = studentRepository.getStudent();
//list.forEach(System.out::println);


//		List<Student> genderList = studentRepository.findByGender("MALE");
//		genderList.forEach(s -> System.out.println(s));
//		
//
//		List<Student> byRankGreaterThanEqual = studentRepository.findByRankGreaterThanEqual(11l);
//		byRankGreaterThanEqual.forEach(System.out::println);
//
////		List<Student> byGenderIsNull = studentRepository.findByGenderIsNull();
////		byGenderIsNull.forEach(System.out::println);
//
//		List<Student> studentListRankLess = studentRepository.findByRankLessThanEqual(11l);
//		studentListRankLess.forEach(System.out::println);
//
//		List<Student> listStudent = studentRepository.findByGenderAndRankGreaterThanEqual("MALE", 11l);
//		listStudent.forEach(System.out::println);

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

//		TeacherRepository teacherRepository = context.getBean(TeacherRepository.class);

//		Teacher t = new Teacher();
//		t.setId(101);
//		t.setName("Ashok");
//		t.setSubject("Java Spring Boot");
//
//		teacherRepository.save(t);
//		System.out.println("Teacher Record inserted.....");


//		ProductRepository productRepo = context.getBean(ProductRepository.class);
//
//		productRepo.getAllProducts().forEach(System.out::println);