package com.sudarshan.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class MyItem {
	
	@Id
	@GeneratedValue(generator="item_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="item_seq",sequenceName="item_seq")
	private Integer id;
	
	private String title;
	
	private String description;
	
	private Date publishedDate;
	
	private String link;
	
	@ManyToOne
	@JoinColumn(name="blog_id")
	private MyBlog blogs;
	
	

	public MyBlog getBlogs() {
		return blogs;
	}

	public void setBlogs(MyBlog blogs) {
		this.blogs = blogs;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getPublishedDate() {
		return publishedDate;
	}

	public void setPublishedDate(Date publishedDate) {
		this.publishedDate = publishedDate;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
}
