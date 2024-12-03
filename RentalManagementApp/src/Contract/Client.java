public class Client {
    public static void main(String[] args) throws Exception {
        Contract contract1 = new LongTerm();
        contract1.BuildContractID(1);
        contract1.BuildProperyID(2);
        contract1.BuildRentAmount(1111111);
        contract1.BuildTenantID(1);
        contract1.SignContract();

        System.out.println(contract1.toString());

        Document doc = new Document();
        System.out.println(doc.newDocument(contract1.toString()));
    }
}
