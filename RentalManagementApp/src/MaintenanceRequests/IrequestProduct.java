import java.sql.Date;

public interface IrequestProduct {
	
	IrequestProduct setPriority (String priority);
	IrequestProduct setExpire (String expireDay);
	IrequestProduct setStatus (String status);
	
	request processRequest();
	
}
