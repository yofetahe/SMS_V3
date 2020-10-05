package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassTypeRepository extends CrudRepository<ClassType, Long> {
	
	@Query(value = "SELECT * FROM CLASS_LIST WHERE CLASS_STATUS = 'active'", nativeQuery = true)
	public List<ClassType> getActiveClassList();

}
