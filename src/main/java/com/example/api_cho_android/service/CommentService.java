package com.example.api_cho_android.service;

import java.util.List;

import com.example.api_cho_android.model.Comment;

public interface CommentService {


	    public List<Comment> findAll();		
		
		public Comment addNew(Comment comment);
	
		
		public List<Comment> findCommentByIdBaiHat(int idBaiHat);
		
		public List<Comment> findCommentByIdNguoiDung(int idNguoiDung);
		
}
