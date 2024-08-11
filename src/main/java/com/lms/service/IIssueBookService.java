package com.lms.service;

import java.util.List;

import com.lms.response.GetAllIssuedBooks;

public interface IIssueBookService {
	public boolean issueBookToStudent(Long rollNo,Long bookId);

	public List<GetAllIssuedBooks> getAllIssuedBooks(Long rollNo,Long bookId);
}
