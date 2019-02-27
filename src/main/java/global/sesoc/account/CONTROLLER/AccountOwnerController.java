package global.sesoc.account.CONTROLLER;

import java.util.ArrayList;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import global.sesoc.account.DAO.AccountDAO;
import global.sesoc.account.VO.AccountBook;
import global.sesoc.account.VO.AccountOwner;

@Controller
public class AccountOwnerController {

	@Autowired
	AccountDAO dao;
	
	@RequestMapping(value="/signup" , method=RequestMethod.POST)
	public String signupAccountOwner() {
	return "/signup";
	}
	
	@RequestMapping(value="/insertAccountOwner" , method=RequestMethod.POST)
	public String insertAccountOwner(AccountOwner accountowner) {
		
		int result = dao.insertAccountOwner(accountowner);
		if (result == 0) {
			return "redirect:/signup";
		}
		return "redirect:/";
	}
	
	@RequestMapping(value="/login" , method=RequestMethod.POST)
	public String login(AccountOwner accountowner,HttpSession session) {
		
	AccountOwner result = dao.selectAccountOwner(accountowner);
	
	if (result == null) {
		return "home";
	} else {
		session.setAttribute("loginId", result.getId());
	}
	
	return "account";
	}

	@RequestMapping(value="/inputaccountbook" , method=RequestMethod.POST)
	public @ResponseBody int inputaccountbook(AccountBook accountbook , HttpSession session) {	
		
		String loginId = (String) session.getAttribute("loginId"); //<----- 이건 어디에 쓰나요?
		
		accountbook.setId(loginId);
		
		int result = dao.inputaccountbook(accountbook);
		
		return result;
	}
	
	@RequestMapping(value="/selectAllaccountbook" , method=RequestMethod.GET)
	public @ResponseBody ArrayList<AccountBook> selectAllaccountbook(HttpSession session) {	
	
		ArrayList<AccountBook> result = null;
		
		String loginId = (String) session.getAttribute("loginId");
		
		result = dao.selectAllaccountbook(loginId);
		
		return result;
	}
	
	
}
