package com.sudarshan.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;


@Entity
public class MyBlog {
	
	@Id
	@GeneratedValue(generator="blog_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="blog_seq",sequenceName="blog_seq")
	private Integer id;
	
	private String name;
	
	private String url;
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private MyUsers user;
	
	
	@OneToMany(mappedBy="blogs")
	private List<MyItem> items;
	
	
	
	public MyUsers getUser() {
		return user;
	}

	public void setUser(MyUsers user) {
		this.user = user;
	}

	public List<MyItem> getItems() {
		return items;
	}

	public void setItems(List<MyItem> items) {
		this.items = items;
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

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
