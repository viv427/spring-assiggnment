package com.vivek.springassignment.dao;

import java.util.List;

import com.vivek.springassignment.dto.InterviewDTO;

public interface InterviewDAO {
	List<InterviewDTO> getAllInterviewItems();
	List<InterviewDTO> saveInterview(InterviewDTO interview);
	List<InterviewDTO> editInterview(InterviewDTO interview);
	List<InterviewDTO> deleteInterview(InterviewDTO interview);
}
