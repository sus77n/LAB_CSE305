public class Permanent implements Contract{
    private int ContractID;
    private int PropertyID;
    private int TenentID;
    private float RentAmount;

    public Permanent() {

    }

    
    @Override
    public void BuildContractID(int ContractID) {
        this.ContractID = ContractID;
    }

    @Override
    public void BuildProperyID(int PropertyID) {
        this.PropertyID = PropertyID;
    }

    @Override
    public void BuildTenantID(int TenentID) {
        this.TenentID= TenentID;
    }

    @Override
    public void BuildRentAmount(float RentAmount) {
        this.RentAmount = RentAmount;
    }

    @Override
    public ContractObject SignContract() {
        return new ContractObject(ContractID, PropertyID, TenentID, RentAmount);
    }


    public int getContractID() {
        return ContractID;
    }


    public void setContractID(int contractID) {
        ContractID = contractID;
    }


    public int getPropertyID() {
        return PropertyID;
    }


    public void setPropertyID(int propertyID) {
        PropertyID = propertyID;
    }


    public int getTenentID() {
        return TenentID;
    }


    public void setTenentID(int tenentID) {
        TenentID = tenentID;
    }


    public float getRentAmount() {
        return RentAmount;
    }


    public void setRentAmount(float rentAmount) {
        RentAmount = rentAmount;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Contract ID: " + ContractID + "\n" + "Property ID: "+ PropertyID + "\n" + "Tenent ID: "+ TenentID + "\n" + "Rent amount: "+ RentAmount);

        return sb.toString();
    }
}
