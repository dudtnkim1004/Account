package global.sesoc.account.DAO;

import java.util.Map;

import global.sesoc.account.VO.AccountOwner;

public interface AccountOwnerMapper {

	public int insertAccountOwner(Map<String, Object> map);
	
	public AccountOwner selectAccountOwner(AccountOwner accountowner);
}
