package com.emlakcepte.client;

public class Banner {

	private String ilanNo;
	private int adet;
	private String telNo1;
	private String telNo2;
	private String adres;

	/*public Banner(String ilanNo, int adet, String telNo1, String telNo2, String adres) {
		super();
		this.ilanNo = ilanNo;
		this.adet = adet;
		this.telNo1 = telNo1;
		this.telNo2 = telNo2;
		this.adres = adres;
	}*/

	public String getIlanNo() {
		return ilanNo;
	}

	public void setIlanNo(String ilanNo) {
		this.ilanNo = ilanNo;
	}

	public int getAdet() {
		return adet;
	}

	public void setAdet(int adet) {
		this.adet = adet;
	}

	public String getTelNo1() {
		return telNo1;
	}

	public void setTelNo1(String telNo1) {
		this.telNo1 = telNo1;
	}

	public String getTelNo2() {
		return telNo2;
	}

	public void setTelNo2(String telNo2) {
		this.telNo2 = telNo2;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	@Override
	public String toString() {
		return "Banner [ilanNo=" + ilanNo + ", adet=" + adet + ", telNo1=" + telNo1 + ", telNo2=" + telNo2 + "]";
	}

}
