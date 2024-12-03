public class ContractObject {
    private int ContractID;
    private int PropertyID;
    private int TenentID;
    private float RentAmount;

    public ContractObject(int contractID, int propertyID, int tenentID, float rentAmount) {
        ContractID = contractID;
        PropertyID = propertyID;
        TenentID = tenentID;
        RentAmount = rentAmount;
    }

    public int getContractID() {
        return ContractID;
    }

    public int getPropertyID() {
        return PropertyID;
    }

    public int getTenentID() {
        return TenentID;
    }

    public float getRentAmount() {
        return RentAmount;
    }

    public void setContractID(int contractID) {
        ContractID = contractID;
    }

    public void setPropertyID(int propertyID) {
        PropertyID = propertyID;
    }

    public void setTenentID(int tenentID) {
        TenentID = tenentID;
    }

    public void setRentAmount(float rentAmount) {
        RentAmount = rentAmount;
    }

    
}
