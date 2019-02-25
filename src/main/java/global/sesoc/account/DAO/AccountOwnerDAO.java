package global.sesoc.account.DAO;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import global.sesoc.account.VO.AccountOwner;

@Repository
public class AccountOwnerDAO {

	@Autowired
	SqlSession session;
	
	public int insertAccountOwner(String id, String pw) {
		
		int result = 0;
		
		AccountOwnerMapper mapper = session.getMapper(AccountOwnerMapper.class);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("pw", pw);
		
		result = mapper.insertAccountOwner(map);
		
		return result;
	}
	
	public AccountOwner selectAccountOwner(AccountOwner accountowner) {
		
		AccountOwner result = null;
		
		AccountOwnerMapper mapper = session.getMapper(AccountOwnerMapper.class);
		
		result = mapper.selectAccountOwner(accountowner);
		
		return result;
	}
}
