package com.example.api_cho_android.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.api_cho_android.model.Comment;
import com.example.api_cho_android.repository.CommentRepository;
import com.example.api_cho_android.service.CommentService;

@Service
public class CommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;
	
	@Override
	public List<Comment> findAll() {
		List<Comment> listComment = new ArrayList<Comment>();
		listComment = commentRepository.findAll();
		return listComment;
	}

	@Override
	public Comment addNew(Comment comment) {
		Comment entity = commentRepository.saveAndFlush(comment);
		return entity;
	}


	@Override
	public List<Comment> findCommentByIdBaiHat(int idBaiHat) {
		List<Comment> listComment = new ArrayList<Comment>();
		listComment = commentRepository.findCommentByIdBaiHat(idBaiHat);
		return listComment;
	}

	@Override
	public List<Comment> findCommentByIdNguoiDung(int idNguoiDung) {
		List<Comment> listComment = new ArrayList<Comment>();
		listComment = commentRepository.findCommentByIdNguoiDung(idNguoiDung);
		return listComment;
	}

	
}
