package com.lms.service;

import java.util.List;

import com.lms.request.EmailRequest;
import com.lms.request.StudentRequest;
import com.lms.response.GetAllStudentsResp;

public interface IStudentService {

	public String registerStudent(StudentRequest studentRequest);

	public String OTPVerify(EmailRequest emailRequest);
	
	public List<GetAllStudentsResp> getStudentsByParam(Long rollNo,String firstName);
}
