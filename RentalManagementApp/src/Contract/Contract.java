public interface Contract {
    void BuildContractID(int ContractID);
    void BuildProperyID(int PropertyID);
    void BuildTenantID(int TenentID);
    void BuildRentAmount(float RentAmount);
    ContractObject SignContract();
}