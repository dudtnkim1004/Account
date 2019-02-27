package global.sesoc.account.VO;

public class AccountBook {

	private String accountSeq;
	private String id;
	private String title;
	private String content;
	private String flag;
	private int amount;
	private String eventdate;
	private String indate;

	public AccountBook(String accountSeq, String id, String title, String content, String flag, int amount,
			String eventdate, String indate) {
		super();
		this.accountSeq = accountSeq;
		this.id = id;
		this.title = title;
		this.content = content;
		this.flag = flag;
		this.amount = amount;
		this.eventdate = eventdate;
		this.indate = indate;
	}

	public AccountBook() {
		super();
	}

	public String getAccountSeq() {
		return accountSeq;
	}

	public void setAccountSeq(String accountSeq) {
		this.accountSeq = accountSeq;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getEventdate() {
		return eventdate;
	}

	public void setEventdate(String eventdate) {
		this.eventdate = eventdate;
	}

	public String getIndate() {
		return indate;
	}

	public void setIndate(String indate) {
		this.indate = indate;
	}

	@Override
	public String toString() {
		return "AccountBook [accountSeq=" + accountSeq + ", id=" + id + ", title=" + title + ", content=" + content
				+ ", flag=" + flag + ", amount=" + amount + ", eventdate=" + eventdate + ", indate=" + indate + "]";
	}

}
