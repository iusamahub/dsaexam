package Code1;

import java.util.Objects;

public class EmpImpl {
	
	
	private int empid;
	private String fname;
	private String gender;
	
	public EmpImpl() {
		super();
	}

	

	public EmpImpl(int id,String name,String g) {
		empid=id;
		fname=name;
		gender=g;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public String toString() {
		return "EmpImpl [empid=" + empid + ", fname=" + fname + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(gender);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmpImpl other = (EmpImpl) obj;
		return Objects.equals(gender, other.gender);
	}
	

}
