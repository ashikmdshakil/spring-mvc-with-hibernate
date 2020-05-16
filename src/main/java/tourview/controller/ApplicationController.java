package tourview.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import tourview.dao.BloggerDAO;
import tourview.entity.Blogger;

@Controller
public class ApplicationController {
	@Autowired
	Blogger blogger;
	@Autowired
	BloggerDAO bloggerdao;
	
	@RequestMapping("/")
	public String homePage() {
		// TODO Auto-generated method stub
		return "index";
	}
	@RequestMapping("register")
	@ResponseBody
	public String registerBloggers(String fullName, String nickName, String email){
		blogger.setFullName(fullName);
		blogger.setNickName(nickName);
		blogger.setEmailAdress(email);
		bloggerdao.saveBloggers(blogger);
		System.out.println("Check Database");
		return "check console ....";
	}
}
