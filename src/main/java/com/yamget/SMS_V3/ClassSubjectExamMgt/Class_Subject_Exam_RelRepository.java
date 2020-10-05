package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Class_Subject_Exam_RelRepository extends CrudRepository<Class_Subject_Exam_Rel, Long> {

	@Query(value = "SELECT * FROM EXAMS_TYPE WHERE ET_ID IN (SELECT ET_ID FROM CLASS_SUBJECT_EXAM_REL WHERE CL_ID = ?1 AND SUB_ID = ?2)", nativeQuery = true)
	public List<ExamType> getRelatedExamTypeByClIdSubId(long cl_id, long sub_id);
	
	@Query(value = "SELECT * FROM EXAMS_TYPE WHERE ET_ID NOT IN (SELECT ET_ID FROM CLASS_SUBJECT_EXAM_REL WHERE CL_ID = ?1 AND SUB_ID = ?2)", nativeQuery = true)
	public List<ExamType> getUnrelatedExamTypeByClIdSubId(long cl_id, long sub_id);
}
