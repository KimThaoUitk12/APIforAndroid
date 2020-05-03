package com.example.api_cho_android.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.api_cho_android.model.Comment;
import com.example.api_cho_android.keyclass.KeyForComment;

@Repository
public interface CommentRepository extends JpaRepository<Comment,KeyForComment> {

	@Query("select c from Comment c where c.idBaiHat=?1")
	List<Comment> findCommentByIdBaiHat(int idBaiHat);
	
	@Query("select c from Comment c where c.idNguoiDung=?1")
	List<Comment> findCommentByIdNguoiDung(int idNguoiDung);
}
