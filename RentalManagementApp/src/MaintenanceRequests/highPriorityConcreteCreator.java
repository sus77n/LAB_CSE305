
public class highPriorityConcreteCreator implements IrequestCreator {

	@Override
	public request createRequest() {
		IrequestProduct newRequest = new highPriorityConcrete();
		return newRequest.processRequest();
	}
}
