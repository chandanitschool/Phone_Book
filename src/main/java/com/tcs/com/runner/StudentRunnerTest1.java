package com.tcs.com.runner;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tcs.com.model.Student;
import com.tcs.com.repo.StudentRepo;
@Component
public class StudentRunnerTest1 implements CommandLineRunner {


		@Autowired
		private StudentRepo repo;

		@Override
		public void run(String... args) throws Exception {


			repo.save(new Student(101,"satya",2.2)); 
			repo.save(new Student(102,"bulu",3.2)); 
			repo.save(new Student(103,"chinu",4.2));

			repo.saveAll(Arrays.asList(new Student(104,"A",4.5), 
					new Student(105,"B",5.5), 
					new Student(106,"C",6.5), 
					new Student(107,"D",7.5) ) );

			repo.save(new Student(101, "dhana", 5.0));

			//repo.findAll().forEach(System.out::println);;

			Iterable<Student> findAll = repo.findAll();
			for (Student student : findAll) {
				System.out.println(student);
			}

			Optional<Student> findById = repo.findById(106);

			if (findById.isPresent()) {
				Student s=findById.get();
				System.out.println(s);
			}

			System.out.println(repo.existsById(102));

			System.out.println(repo.count());

			repo.deleteById(103);

			repo.deleteAll(Arrays.asList(new Student(101,"dhana",5.0),
										new Student(102,"bulu",3.2)
										));
			
			repo.findAllById(Arrays.asList(105,106,107)).forEach(System.out::println);
			
			//System.exit(0);


		}

	


		
	}


