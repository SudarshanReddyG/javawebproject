package com.sudarshan.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

@Entity
public class MyRoles {
	
	@Id
	@GeneratedValue(generator="role_seq", strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="role_seq", sequenceName="role_seq")
	private Integer id;
	
	private String name;

	@ManyToMany(mappedBy="roles")
	private List<MyUsers> users;
	
	
	
	public List<MyUsers> getUsers() {
		return users;
	}

	public void setUsers(List<MyUsers> users) {
		this.users = users;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
