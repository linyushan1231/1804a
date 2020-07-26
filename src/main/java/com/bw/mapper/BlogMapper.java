package com.bw.mapper;

import java.util.List;

import com.bw.bean.Blog;
import com.bw.bean.Category;

public interface BlogMapper {

	public List<Category> selCate();
	
	public List<Blog> selBlog(Integer cid);
	
	public void addBlog(Blog blog); 
}
