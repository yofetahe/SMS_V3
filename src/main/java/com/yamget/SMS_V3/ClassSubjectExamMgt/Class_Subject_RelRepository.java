package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Class_Subject_RelRepository extends CrudRepository<Class_Subject_Rel, Long> {

	@Query(value = "SELECT * FROM SUBJECT_LIST WHERE SUB_ID IN (SELECT SUB_ID FROM CLASS_SUBJECT_REL WHERE CL_ID = ?1)", nativeQuery = true)
	public List<SubjectType> getRelatedSubjectByClassId(long class_id);
	
	@Query(value = "SELECT * FROM SUBJECT_LIST WHERE SUB_ID NOT IN (SELECT SUB_ID FROM CLASS_SUBJECT_REL WHERE CL_ID = ?1)", nativeQuery = true)
	public List<SubjectType> getUnrelatedSubjectByClassId(long class_id);
}
