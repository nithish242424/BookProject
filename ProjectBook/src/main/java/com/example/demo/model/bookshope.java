package com.example.demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class bookshope {
   @Id
   @GeneratedValue
   private int id;
   private String authorname;
   @OneToMany(cascade = CascadeType.ALL)
   @JoinColumn
   private List<book> model;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAuthorname() {
	return authorname;
}
public void setAuthorname(String authorname) {
	this.authorname = authorname;
}

}
