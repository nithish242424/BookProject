package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.bookshope;
import com.example.demo.repository.bookerepo;
import com.example.demo.repository.shoperepo;
@Service
public class serviceclass {
    @Autowired
    shoperepo srepo;
    @Autowired
    bookerepo brepo;
    
	public bookshope saveinfo(bookshope na) {
		// TODO Auto-generated method stub
		return srepo.save(na);
	}

	public List<bookshope> getall() {
		// TODO Auto-generated method stub
		return srepo.findAll();
	}

	public Optional<bookshope> findalli(int id) {
		// TODO Auto-generated method stub
		return srepo.findById(id);
	}

	public void delete(int id) {
		srepo.deleteById(id);
		
	}
	public bookshope updateinfo(bookshope bsp)
	{
		return srepo.saveAndFlush(bsp);
	}

}
