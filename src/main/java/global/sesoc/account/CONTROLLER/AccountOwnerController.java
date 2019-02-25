package global.sesoc.account.CONTROLLER;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import global.sesoc.account.DAO.AccountOwnerDAO;
import global.sesoc.account.VO.AccountOwner;

@Controller
public class AccountOwnerController {

	@Autowired
	AccountOwnerDAO dao;
	
	@RequestMapping(value="/signup" , method=RequestMethod.POST)
	public String signupAccountOwner() {
	return "/signup";
	}
	
	@RequestMapping(value="/insertAccountOwner" , method=RequestMethod.POST)
	public String insertAccountOwner(String id, String pw) {
		
	int result = dao.insertAccountOwner(id, pw);
		
	return "home";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String login(AccountOwner accountowner, Model model , HttpSession session) {
		
	AccountOwner result = dao.selectAccountOwner(accountowner);
		
	session.setAttribute("loginid", result.getId());
	
	return "home";
	}
	
}
