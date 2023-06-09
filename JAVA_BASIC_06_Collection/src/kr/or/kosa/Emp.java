package kr.or.kosa;

//한건의 데이터를 담을 수 있는 클래스
//데이터베이스의 테이블과 1:1로 맵핑하는 클래스
//create table emp(empno number, ename, varchar(30));
//select * from emp where empno=7902
//DataTranferObject, VO, DOMAIN

public class Emp {
	private int empno;
	private String ename;
	private String job;
	
	public Emp(int empno, String ename, String job){
		this.empno = empno;
		this.ename = ename;
		this.job = job;
	}
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + "]";
	}
	
}