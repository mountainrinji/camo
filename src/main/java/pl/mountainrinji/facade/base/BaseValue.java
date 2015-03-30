package pl.mountainrinji.facade.base;

public class BaseValue {
	private boolean isError = false;
	private String errorMessage;
	
	public BaseValue() {
		this.isError = false;
		this.errorMessage = null;
	}
	
	public BaseValue(boolean isError, String errorMessage) {
		this.isError = isError;
		this.errorMessage = errorMessage;
	}

	public boolean isError() {
		return isError;
	}

	public String getErrorMessage() {
		return errorMessage;
	}
	
	

}
