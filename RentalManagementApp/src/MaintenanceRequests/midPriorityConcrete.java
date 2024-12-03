
public class midPriorityConcrete implements IrequestProduct {

    private String priority;
    private String expireDay;
    private String status;

    @Override
    public IrequestProduct setPriority(String priority) {
        this.priority = "Medium";
        return this;
    }

    @Override
    public IrequestProduct setExpire(String expireDay) {
        this.expireDay = "12/12/2024";
        return this;
    }

    @Override
    public IrequestProduct setStatus(String status) {
        this.status = "Accepted";
        return this;
    }

    @Override
    public request processRequest() {
        System.out.println("Request accept, estimated completion date is 12/12/2024");
        return new request(priority, expireDay, status);
    }
}
