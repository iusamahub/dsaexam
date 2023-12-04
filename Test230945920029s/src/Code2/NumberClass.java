package Code2;

import java.util.Objects;

public class NumberClass {

	private int no;
	
	public NumberClass(int no) {
		super();
		this.no = no;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "NumberClass [no=" + no + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NumberClass other = (NumberClass) obj;
		return no == other.no;
	}
	
	
}
