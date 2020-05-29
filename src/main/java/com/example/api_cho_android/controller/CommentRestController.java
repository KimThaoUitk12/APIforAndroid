package com.example.api_cho_android.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.api_cho_android.converter.CommentConverter;
import com.example.api_cho_android.dto.CommentDto;
import com.example.api_cho_android.model.Comment;
import com.example.api_cho_android.service.CommentService;

@RestController
@RequestMapping("/")
public class CommentRestController {
	@Autowired
	private CommentService commentService;
	
	@Autowired
	private CommentConverter commentConverter;
	
	//tất cả comment
	@GetMapping("/comment/find-all")
	public List<CommentDto> findAllComment(){
		List<Comment> listComment =  new ArrayList<Comment>();
		listComment = commentService.findAll();
		return commentConverter.convertToDto(listComment);
	}
	
	// tìm comment by id bai hát
	@GetMapping("api/comment/find-by-idbaihat")
	public List<CommentDto> findCommentByIdBaiHat(@RequestParam(value="id") int id) {
		return commentConverter.convertToDto(commentService.findCommentByIdBaiHat(id));
	}
	
	// tìm comment by id người dùng
	@GetMapping("/comment/find-by-idnguoidung")
	public List<CommentDto> findCommentByIdNguoiDung(@RequestParam(value="id") int id) {
		return commentConverter.convertToDto(commentService.findCommentByIdNguoiDung(id));
	}
	
	// thêm comment
	@PostMapping("/comment/add-comment")
	public CommentDto addNewComment(@RequestBody CommentDto commentDTO) {
		Comment comment = commentConverter.convertToEntity(commentDTO);
		CommentDto dto = commentConverter.convertToDto(commentService.addNew(comment));
		return dto;
	}
	

	
	

	
	
}
