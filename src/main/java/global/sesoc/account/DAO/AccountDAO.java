package global.sesoc.account.DAO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.account.VO.AccountBook;
import global.sesoc.account.VO.AccountOwner;

@Repository
public class AccountDAO {

	@Autowired
	SqlSession session;
	
	public int insertAccountOwner(AccountOwner accountowner) {
		int result = 0;
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		try {
			result = mapper.insertAccountOwner(accountowner);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return result;
		}
		return result;
	}
	
	public AccountOwner selectAccountOwner(AccountOwner accountowner) {
		AccountOwner result = null;
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		try {
			result = mapper.selectAccountOwner(accountowner);			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return result;
		}
		
		return result;
	}
	
	
	public int inputaccountbook(AccountBook accountbook){
		int result = 0;
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		try {
			result = mapper.inputaccountbook(accountbook);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return result;
		}
		
		return result;
	}

	public ArrayList<AccountBook> selectAllaccountbook(String id){
		ArrayList<AccountBook> result =null;
		AccountMapper mapper = session.getMapper(AccountMapper.class);
		try {
			result = mapper.selectAllaccountbook(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return result;
		}
		
		return result;
	}
}
