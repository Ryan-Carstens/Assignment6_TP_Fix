package za.ac.cput.assignment6.domain;

/**
 * Created by Ryan Carstens 213133040.
 */
public abstract class Contract {
    private Long id;
    private int ContractNum;
    private int IdCheckNum;
    private int DetailsCheckNum;
    public Contract nextContract;

    public void setNextContract(Contract nextContract)
    {
        this.nextContract = nextContract;
    }

    public Long getId() {
        return id;
    }

    public int getContractNum() {
        return ContractNum;
    }

    public int getDetailsCheckNum() {
        return DetailsCheckNum;
    }

    public int getIdCheckNum() {
        return IdCheckNum;
    }

    public abstract String contractType(String type);
}