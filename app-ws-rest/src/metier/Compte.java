package metier;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import org.codehaus.jackson.annotate.JsonIgnore;

public class Compte {
	
	private Integer code;
	private double solde;
	@XmlTransient
	private Date datecreation;
	
	public Compte() {
	}

	public Compte(Integer code, double solde, Date datecreation) {
		this.code = code;
		this.solde = solde;
		this.datecreation = datecreation;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	@JsonIgnore
	public Date getDatecreation() {
		return datecreation;
	}

	public void setDatecreation(Date datecreation) {
		this.datecreation = datecreation;
	}
	
}
