package in.ashokit;

import in.ashokit.entity.Student;
import in.ashokit.entity.Teacher;
import in.ashokit.repository.StudentRepository;
import in.ashokit.repository.TeacherRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		StudentRepository studentRepository = context.getBean(StudentRepository.class);

		long count = studentRepository.count();
		System.out.println("Record Count :: " + count);

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