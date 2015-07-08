package com.sudarshan.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class MyUsers {
	
	@Id
	@GeneratedValue(generator="user_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="user_seq", sequenceName="user_seq")
	private Integer id;
	
	private String name;
	
	private String email;
	
	private String password;
	
	@ManyToMany
	@JoinTable
	private List<MyRoles> roles;
	
	@OneToMany(mappedBy="user")
	private List<MyBlog> blogs;
	
	
	
	public List<MyRoles> getRoles() {
		return roles;
	}

	public void setRoles(List<MyRoles> roles) {
		this.roles = roles;
	}

	public List<MyBlog> getBlogs() {
		return blogs;
	}

	public void setBlogs(List<MyBlog> blogs) {
		this.blogs = blogs;
	}

	public List<MyRoles> getList() {
		return roles;
	}

	public void setList(List<MyRoles> roles) {
		this.roles = roles;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
}
