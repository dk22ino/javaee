package com.ug.pszczupak.domain;
import java.util.Date;


public class NewsletterUser {
	public String getImie() {
		return imie;
	}
	public void setImie(String imie) {
		this.imie = imie;
	}
	public Date getDataOd() {
		return dataOd;
	}
	public void setDataOd(Date dataOd) {
		this.dataOd = dataOd;
	}
	public Date getDataDo() {
		return dataDo;
	}
	public void setDataDo(Date dataDo) {
		this.dataDo = dataDo;
	}
	public String getTematyka() {
		return tematyka;
	}
	public void setTematyka(String tematyka) {
		this.tematyka = tematyka;
	}
	private String imie;
	private Date dataOd;
	private Date dataDo;
	private String tematyka;
	
	
	
}
