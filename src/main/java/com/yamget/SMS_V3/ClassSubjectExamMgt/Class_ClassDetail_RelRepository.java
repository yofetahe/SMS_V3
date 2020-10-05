package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Class_ClassDetail_RelRepository extends CrudRepository<Class_ClassDetail_Rel, Long> {
	
	@Query(value = "SELECT * FROM CLASS_DETAIL WHERE CD_ID IN (SELECT CD_ID FROM CLASS_CLASS_DETAIL_REL WHERE CL_ID = ?1)", nativeQuery = true)
	public List<ClassDetail> getClassDetailByClassId(long class_id);
	
	@Query(value = "SELECT * FROM CLASS_DETAIL WHERE CD_ID NOT IN (SELECT CD_ID FROM CLASS_CLASS_DETAIL_REL WHERE CL_ID = ?1)", nativeQuery = true)
	public List<ClassDetail> getUnrelatedClassDetailByClassId(long class_id);

}
