package impostos;

public class JuridicPerson extends taxPayer{
	
	private int numberOfEmployess;
	
	public JuridicPerson() {
		
	}	

	public JuridicPerson(String name, Double anualIncome, int numberOfEmployess) {
		super(name, anualIncome);
		this.numberOfEmployess = numberOfEmployess;
	}


	public int getNumberOfEmployess() {
		return numberOfEmployess;
	}



	public void setNumberOfEmployess(int numberOfEmployess) {
		this.numberOfEmployess = numberOfEmployess;
	}



	@Override
	public Double tax() {
		if(getNumberOfEmployess() > 10) {
			return getAnualIncome() * 0.14;
		}else {
			return getAnualIncome() * 0.16;
		}
	}
	
	

}
