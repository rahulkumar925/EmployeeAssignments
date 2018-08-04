// Create class employee with attributes id, name, and monthlyBasic.
public class Employee {
	
	private int Id;
	private String name;
	private float monthlyBasic;
	private static final float medallowance=1250F;
    private static float hra=0.5F;
    private static final float conallowance=800F;
    private float PF;
    private float Esic = 0.0F;
    private float tax;
    
    void getIdname(int Id,String name)
    {
    	this.Id=Id;
    	this.name=name;
    }
    
    void setmonthlyBasic(float mbasic)
    {
    	monthlyBasic=mbasic;
    	
    }
    
	//Getting annual Basic
    float getAnnualBasic()
    {
    	return 12*monthlyBasic;
    }
    
	//Getting monthly gross salary.
    float getMonthlyGrossSalary()
    {
    	hra= 0.5F * monthlyBasic;
    	
    	return monthlyBasic + hra + medallowance + conallowance;
    }
    
    //Getting annual gross salary
    float getAnnualGrossSalary()
    {
    	return 12*getMonthlyGrossSalary();
    }
    
	//Getting monthly deductions.
    float getMonthlyDeductions()
    {
    	PF= 0.1F * monthlyBasic;
    	if(PF>6500F)
    	{
    		PF=6500F;
    	}
    	if(monthlyBasic <= 5000F)
    	{
    		Esic = 0.0475F * monthlyBasic;
    		
    	}
    	
    	if(getMonthlyGrossSalary()<=10000)
    	{
    		tax=50F;
    	}
    	else
    	{
    		tax=100F;
    	}
    	
    	return getPFRate()+Esic+tax;
    }
    
	//Getting monthly takehome
    float getMonthlyTakeHome()
    {
    	return getMonthlyGrossSalary()-getMonthlyDeductions();
    }
    
	//getting annual takehome
    float getAnnualTakeHome()
    {
    	return 12*getMonthlyTakeHome();
    }
    
    float getPFRate()
    {
    	return PF;
    }
    
    void setPFRate(float f)
    {
    	f= 0.1F * monthlyBasic;
    	if(f>6500F)
    	{
    		f=6500F;
    	}
    	PF=f;
    }
    
	//Displaying all

    public void display()
    {
    	System.out.println("Employee Id:" +Id);
        System.out.println("Employee Name:" +name);
    	System.out.println("Monthly basic: " +monthlyBasic);
    	System.out.println("Annual basic: " +getAnnualBasic());
    	System.out.println("Monthly Gross: " +getMonthlyGrossSalary());
    	System.out.println("Annual Gross: " +getAnnualGrossSalary());
    	System.out.println("Monthly Deductions: " +getMonthlyDeductions());
    	System.out.println("Monthly Take Home: " +getMonthlyTakeHome());
    	System.out.println("Annual Take Home: " +getAnnualTakeHome());
    	
    	
    	
    	
    }
    
	
	

}
