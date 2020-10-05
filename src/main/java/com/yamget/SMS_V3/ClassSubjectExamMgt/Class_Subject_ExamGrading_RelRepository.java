package com.yamget.SMS_V3.ClassSubjectExamMgt;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Class_Subject_ExamGrading_RelRepository extends CrudRepository<Class_Subject_ExamGrading_Rel, Long> {

	@Query(value = "SELECT * FROM EXAMS_GRADE WHERE EG_ID IN (SELECT EG_ID FROM CLASS_SUBJECT_EXAM_GRADING_REL WHERE CL_ID = ?1 AND SUB_ID = ?2)", nativeQuery = true)
	public List<ExamGrade> getRelatedExamGradingByClIdSubId(long cl_id, long sub_id);
	
	@Query(value = "SELECT * FROM EXAMS_GRADE WHERE EG_ID NOT IN (SELECT EG_ID FROM CLASS_SUBJECT_EXAM_GRADING_REL WHERE CL_ID = ?1 AND SUB_ID = ?2)", nativeQuery = true)
	public List<ExamGrade> getUnrelatedExamGradingByClIdSubId(long cl_id, long sub_id);
}
