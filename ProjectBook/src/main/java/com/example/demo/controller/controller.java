package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.book;
import com.example.demo.model.bookshope;
import com.example.demo.repository.bookerepo;
import com.example.demo.service.serviceclass;

import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
public class controller {
	      @Autowired
	      serviceclass sec;
		   @PostMapping("/post")
		   public bookshope adddetails(@RequestBody bookshope na) {
			   return sec.saveinfo(na); 
		   }
		   @GetMapping("/get")
		   public List<bookshope>selectall()
		   {
			   return sec.getall();
		   }
		   @GetMapping("/getbyid")
		   public Optional<bookshope>get(@PathVariable int id)
		   {
			   return sec.findalli(id);
		   }
		   @DeleteMapping("/delete")
		   public String Deleteoption(@PathVariable int id)
		   {
			   sec.delete(id);
			   return "deleted";
		   }
		   @Autowired
			
			public bookerepo brepo;
		@Tag(name = "Get Details",description = "To get the required detail")

			@GetMapping("/query")

			public List<book> getAll()
			{
				return brepo.findAll();
			}
		@Tag(name = "Deleting",description = "Deleting the given details")
			@DeleteMapping("/deletequery/{id}/{bookname}")
			public String deleteDetails(@PathVariable int id,@PathVariable String bookname)
			{	
			brepo.deleteById(id,bookname);
				return "Deleted Successfully";
			}
			@Tag(name = "Updating",description = "Update the given details")
			@PutMapping("/queryupdate/{id}/{bookname}")
			public String updateDetails(@PathVariable int ccode,@PathVariable String cname)
			{
				brepo.update(ccode,cname); 
				 return "updated";
			}
			//jpql
			@Tag(name = "Get Details",description = "To get the required detail")
			@GetMapping("/queryget/{id}")
			public bookshope querybyid(@PathVariable ("id")int id)
			{
				return brepo.querybyid(id);
			}
			@Tag(name = "Deleting",description = "Deleting the given details")
				@DeleteMapping("/jpqldelete/{bookname}")
			public String jpqldelete(@PathVariable("bookname")String bookname)
			{
				brepo.delete(bookname);
				return "deleted";
			}
				@Tag(name = "Get Details",description = "To get the required detail")
			@GetMapping("/jpqlget/{one}/{two}")
			public List<book> between(@PathVariable("one")int one,@PathVariable("two")int two)
			{
				return brepo.between(one,two);
			}
		}


