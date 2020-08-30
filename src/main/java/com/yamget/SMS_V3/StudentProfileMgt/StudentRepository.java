package com.yamget.SMS_V3.StudentProfileMgt;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	@Query(value = "SELECT * FROM STUD_INFORMATION WHERE ID_NO = ?1", nativeQuery = true)
	public List<Student> getStudentNumPerClass(int academic_year);
}
