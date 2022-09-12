package com.app.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dvalidation")
public class DValidation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name="q1")
	private boolean q1;
	@Column(name="q2")
	private boolean q2;
	@Column(name="q3")
	private int q3;
	@Column(name="q4")
	private boolean q4;
	@Column(name="q5")
	private boolean q5;
	@Column(name="q6")
	private boolean q6;
	@Column(name="q7")
	private boolean q7;
	@Column(name="q8")
	private boolean q8;
	@Column(name="q9")
	private boolean q9;
	@Column(name="q10")
	private boolean q10;
	@Column(name="q11")
	private int q11;
	@Column(name="q12")
	private boolean q12;
	@Column(name="q13")
	private boolean q13;
	@Column(name="q14")
	private boolean q14;
	@Column(name="q15")
	private boolean q15;
	@Column(name="q16")
	private int q16;
	@Column(name="q17")
	private boolean q17;
	@Column(name="q18")
	private int q18;
	@Column(name="q19")
	private int q19;
	@Column(name="q20")
	private boolean q20;
	@Column(name="q21")
	private boolean q21;
	@Column(name="q22")
	private boolean q22;
	
	@OneToOne(cascade = CascadeType.REMOVE, orphanRemoval = true)
	@JoinColumn(name = "userid")
	private User user;
	
	public DValidation() {
		// TODO Auto-generated constructor stub
	}
	public DValidation(long id,boolean q1, boolean q2, int q3, boolean q4, boolean q5, boolean q6, boolean q7, boolean q8,
			boolean q9, boolean q10, int q11, boolean q12, boolean q13, boolean q14, boolean q15, int q16, boolean q17,
			int q18, int q19, boolean q20, boolean q21, boolean q22,User user) {
		super();
		this.id=id;
		this.q1 = q1;
		this.q2 = q2;
		this.q3 = q3;
		this.q4 = q4;
		this.q5 = q5;
		this.q6 = q6;
		this.q7 = q7;
		this.q8 = q8;
		this.q9 = q9;
		this.q10 = q10;
		this.q11 = q11;
		this.q12 = q12;
		this.q13 = q13;
		this.q14 = q14;
		this.q15 = q15;
		this.q16 = q16;
		this.q17 = q17;
		this.q18 = q18;
		this.q19 = q19;
		this.q20 = q20;
		this.q21 = q21;
		this.q22 = q22;
		this.user=user;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public boolean isQ1() {
		return q1;
	}
	public void setQ1(boolean q1) {
		this.q1 = q1;
	}
	public boolean isQ2() {
		return q2;
	}
	public void setQ2(boolean q2) {
		this.q2 = q2;
	}
	public int getQ3() {
		return q3;
	}
	public void setQ3(int q3) {
		this.q3 = q3;
	}
	public boolean isQ4() {
		return q4;
	}
	public void setQ4(boolean q4) {
		this.q4 = q4;
	}
	public boolean isQ5() {
		return q5;
	}
	public void setQ5(boolean q5) {
		this.q5 = q5;
	}
	public boolean isQ6() {
		return q6;
	}
	public void setQ6(boolean q6) {
		this.q6 = q6;
	}
	public boolean isQ7() {
		return q7;
	}
	public void setQ7(boolean q7) {
		this.q7 = q7;
	}
	public boolean isQ8() {
		return q8;
	}
	public void setQ8(boolean q8) {
		this.q8 = q8;
	}
	public boolean isQ9() {
		return q9;
	}
	public void setQ9(boolean q9) {
		this.q9 = q9;
	}
	public boolean isQ10() {
		return q10;
	}
	public void setQ10(boolean q10) {
		this.q10 = q10;
	}
	public int getQ11() {
		return q11;
	}
	public void setQ11(int q11) {
		this.q11 = q11;
	}
	public boolean isQ12() {
		return q12;
	}
	public void setQ12(boolean q12) {
		this.q12 = q12;
	}
	public boolean isQ13() {
		return q13;
	}
	public void setQ13(boolean q13) {
		this.q13 = q13;
	}
	public boolean isQ14() {
		return q14;
	}
	public void setQ14(boolean q14) {
		this.q14 = q14;
	}
	public boolean isQ15() {
		return q15;
	}
	public void setQ15(boolean q15) {
		this.q15 = q15;
	}
	public int getQ16() {
		return q16;
	}
	public void setQ16(int q16) {
		this.q16 = q16;
	}
	public boolean isQ17() {
		return q17;
	}
	public void setQ17(boolean q17) {
		this.q17 = q17;
	}
	public int getQ18() {
		return q18;
	}
	public void setQ18(int q18) {
		this.q18 = q18;
	}
	public int getQ19() {
		return q19;
	}
	public void setQ19(int q19) {
		this.q19 = q19;
	}
	public boolean isQ20() {
		return q20;
	}
	public void setQ20(boolean q20) {
		this.q20 = q20;
	}
	public boolean isQ21() {
		return q21;
	}
	public void setQ21(boolean q21) {
		this.q21 = q21;
	}
	public boolean isQ22() {
		return q22;
	}
	public void setQ22(boolean q22) {
		this.q22 = q22;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
//	public String validation() {
//		if((q1&&q2&q4&&q5&&q6&&q7&&q8&&q9&&q10&&q12&&q13&&q14&&q15&&q17&&q20&&q21&&q22)&&(100<q3&&q3<180)&&(q11>12.5)&&(50<q16&&q16<100)&&(q19>45)) {
//			return "Valid";
//		}
//		return "InValid";
//		
//	}
}
