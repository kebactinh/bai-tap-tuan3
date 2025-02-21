package bai3;

public enum ContractType {
	FULL_TIME(1, "Full-time"), PART_TIME(2, "Part-time"), CONTRACTOR(3, "Contractor");

	private int value;
	private String label;

	/**
	 * Constructor
	 * 
	 * @param value the value
	 * @param label the label
	 */
	private ContractType(int value, String label) {
		this.value = value;
		this.label = label;
	}

	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}
}
