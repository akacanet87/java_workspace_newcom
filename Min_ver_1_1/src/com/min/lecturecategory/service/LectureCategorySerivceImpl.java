package com.min.lecturecategory.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.min.domain.LectureCategory;
import com.min.lecturecategory.dao.LectureCategoryDAO;

@Service
public class LectureCategorySerivceImpl implements LectureCategoryService{

	@Autowired
	@Qualifier("lectureCategoryDAOSpringJdbc")
	private LectureCategoryDAO lectureCategoryDAO;
	
	@Override
	public List<LectureCategory> selectAll() {
		
		List<LectureCategory> list = lectureCategoryDAO.selectAll();
		
		return list;
		
	}

}
