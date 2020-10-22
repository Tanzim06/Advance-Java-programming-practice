package Chapter09.program.Paralelism.Transection;

import java.math.BigDecimal;

public class Transection {
	
	private String transectionId;
	private boolean credit;
	private BigDecimal amount;
	
	public Transection(String transectionId, boolean credit, BigDecimal amount) {
		super();
		this.transectionId = transectionId;
		this.credit = credit;
		this.amount = amount;
	}

	public String getTransectionId() {
		return transectionId;
	}

	public void setTransectionId(String transectionId) {
		this.transectionId = transectionId;
	}

	public boolean isCredit() {
		return credit;
	}

	public void setCredit(boolean credit) {
		this.credit = credit;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
	
}
