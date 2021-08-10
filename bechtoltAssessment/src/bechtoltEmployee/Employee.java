package bechtoltEmployee;

import java.util.Date;
import java.util.Objects;

public class Employee 
{
	private int id;
	private String name;
	private Date dateHired;
	private boolean managerFlag;
	private boolean partTimeFlag;
	
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Date getDateHired() 
	{
		return dateHired;
	}
	
	public void setDateHired(Date dateHired) 
	{
		this.dateHired = dateHired;
	}
	
	public boolean isManager() 
	{
		return managerFlag;
	}
	
	public void setManagerFlag(boolean managerFlag) 
	{
		this.managerFlag = managerFlag;
	}

	public boolean isPartTimeFlag() 
	{
		return partTimeFlag;
	}

	public void setPartTimeFlag(boolean partTimeFlag) 
	{
		this.partTimeFlag = partTimeFlag;
	}

	@Override
	public int hashCode() 
	{
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return id == other.id;
	}
}
