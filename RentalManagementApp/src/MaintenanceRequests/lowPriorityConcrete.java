import java.sql.Date;
import java.time.LocalDateTime;

public class lowPriorityConcrete implements IrequestProduct {
	
	private String priority;
	private String expireDay;
	private String status;
	
	@Override
	public IrequestProduct setPriority(String priority) {
		this.priority = "Ignore";
		return this;
	}
	@Override
	public IrequestProduct setExpire (String expireDay) {
		this.expireDay = "12/11/2024";
		return this;
	}
	@Override
	public IrequestProduct setStatus(String status) {
		this.status ="Done";
		return this;
	}
	@Override
	public request processRequest() {
		System.out.println("Request denied");
		return new request(priority, expireDay, status);
	}
}
