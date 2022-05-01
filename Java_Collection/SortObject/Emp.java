package SortObject;

public class Emp implements Comparable {

	int empNo;
	String empName;

	public Emp(int eno, String ename) {
		this.empNo = eno;
		this.empName = ename;
	}

	@Override
//	public int compareTo(Object o) {
//		Emp ref = (Emp)o;
//		return empName.compareTo(ref.empName);
//	}
	
	public int compareTo(Object o) {
		Emp ref = (Emp)o;
		return (this.empNo==ref.empNo) ? 0 : (this.empNo > ref.empNo) ? 1 : (this.empNo < ref.empNo) ? -1 : 0;
	}
	
	

}

// return  (this.empNo > ref.empNo) ? 1 : (this.empNo < ref.empNo) ? -1 :(this.empNo==ref.empNo) ? 0 : 0 ;