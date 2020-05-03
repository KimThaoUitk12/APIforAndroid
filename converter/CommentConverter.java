package com.example.api_cho_android.converter;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import com.example.api_cho_android.dto.CommentDto;
import com.example.api_cho_android.model.Comment;

@Component
public class CommentConverter {

	public CommentDto convertToDto(Comment comment) {
		CommentDto commentDto = new CommentDto();
		commentDto.setIdBaiHat(comment.getIdBaiHat());
		commentDto.setIdNguoiDung(comment.getIdNguoiDung());
		commentDto.setNoiDung(comment.getNoiDung());
		commentDto.setThoiDiemBinhLuan(comment.getThoiDiemBinhLuan());
	
		return commentDto;
	}
	public Comment convertToEntity(CommentDto commentDto) {
		Comment comment = new Comment();
		comment.setIdBaiHat(commentDto.getIdBaiHat());
		comment.setIdNguoiDung(commentDto.getIdNguoiDung());
		comment.setNoiDung(commentDto.getNoiDung());
		comment.setThoiDiemBinhLuan(commentDto.getThoiDiemBinhLuan());
	
	
		return comment;
	}

	public List<CommentDto> convertToDto(List<Comment> listComment) {
		List<CommentDto> listDto = new ArrayList<CommentDto>();
		for (Comment entity : listComment) {
			CommentDto dto = convertToDto(entity);
			listDto.add(dto);
		}
		return listDto;
	}
	public List<Comment> convertToEntity(List<CommentDto> listCommentDto) {
		List<Comment> listEntity = new ArrayList<Comment>();
		for (CommentDto dto : listCommentDto) {
			Comment entity = convertToEntity(dto);
			listEntity.add(entity);
		}
		return listEntity;
	}
}
