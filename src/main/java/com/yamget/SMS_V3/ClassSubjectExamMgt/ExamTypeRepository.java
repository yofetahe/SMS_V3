package com.yamget.SMS_V3.ClassSubjectExamMgt;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExamTypeRepository extends CrudRepository<ExamType, Long> {

}
