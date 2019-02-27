package global.sesoc.account.DAO;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import global.sesoc.account.VO.AccountBook;
import global.sesoc.account.VO.AccountOwner;

public interface AccountMapper {

	public int insertAccountOwner(AccountOwner accountowner);
	
	public AccountOwner selectAccountOwner(AccountOwner accountowner);
	
	public int inputaccountbook(AccountBook accountbook);

	public ArrayList<AccountBook> selectAllaccountbook(String id);
}
