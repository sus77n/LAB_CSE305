
public class midPriorityConcreteCreator implements IrequestCreator {

	@Override
	public request createRequest() {
		IrequestProduct newRequest = new midPriorityConcrete();
		return newRequest.processRequest();
	}
}
