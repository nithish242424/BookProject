package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.demo.model.book;
import com.example.demo.model.bookshope;

import jakarta.transaction.Transactional;

public interface bookerepo extends JpaRepository<book, Integer> {
	@Query(value="select * from suresh where id= ?1", nativeQuery = true)

	public List<bookshope> getD(@Param("id") int id);

	@Modifying

	@Transactional

	@Query(value="delete from suresh where id=:id and bookname =:bookname",nativeQuery=true)

	Integer deleteById(@Param("id") int id,@Param("bookname") String bookname);
	@Modifying

	@Transactional

	@Query(value="update suresh set id =:id where bookname =:bookname",nativeQuery=true)

	public void  update(@Param("id") int id,@Param("bookname") String bookname);
//jpql
	@Query("select s from book s where s.id=?1")
	public bookshope querybyid(int id);
	
	
	
	@Modifying
	@Transactional
	@Query(value = "delete from book s where s.bookname=?1")
	public void delete(String bookname);
	 
	@Query(value = "select s from book s where s.id between ?1 and ?2")
	public List<book> between(int one,int two);

}
