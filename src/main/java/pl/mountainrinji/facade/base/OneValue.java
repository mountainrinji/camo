package pl.mountainrinji.facade.base;

public class OneValue extends BaseValue {
	private Object value;

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public OneValue(Object value) {
		super();
		this.value = value;
	}
	
	public OneValue(String errorMessage) {
		super(true, errorMessage);
	}
	
	
}
