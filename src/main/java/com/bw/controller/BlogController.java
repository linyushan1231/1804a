package com.bw.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.bean.Blog;
import com.bw.bean.Category;
import com.bw.service.BlogService;

@Controller
public class BlogController {

	@Autowired
	private BlogService blogService;
	
	@RequestMapping("Catelist")
	public String selCate(Model m){
		
		List<Category> list = blogService.selCate();
		
		m.addAttribute("list", list);
		
		return "catelist";
	}
	
	@RequestMapping("SelBlog")
	public String SelBlog(Model m,Integer cid){
		
		List<Blog> list = blogService.selBlog(cid);
		
		m.addAttribute("list", list);
		
		return "bloglist";
	}
	
	@RequestMapping("queryCate")
	@ResponseBody
	public List<Category> queryCate(){
		
		List<Category> list = blogService.selCate();
		
		return list;
	}
	
	@RequestMapping("addBlog")
	public String addBlog(Blog blog){
		try {
			blogService.addBlog(blog);
			return "redirect:Catelist";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return "add";
		}
	}
}
