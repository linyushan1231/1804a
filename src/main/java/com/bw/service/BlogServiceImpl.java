package com.bw.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.bean.Blog;
import com.bw.bean.Category;
import com.bw.mapper.BlogMapper;

@Service
public class BlogServiceImpl implements BlogService {

	@Autowired
	private BlogMapper blogMapper;

	@Override
	public List<Category> selCate() {
		// TODO Auto-generated method stub
		return blogMapper.selCate();
	}

	@Override
	public List<Blog> selBlog(Integer cid) {
		// TODO Auto-generated method stub
		return blogMapper.selBlog(cid);
	}

	@Override
	public void addBlog(Blog blog) {
		// TODO Auto-generated method stub
		blogMapper.addBlog(blog);
	}
}
