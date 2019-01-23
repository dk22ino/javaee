package ug.pszczupak.restejbjpa.domain;


import javax.persistence.*;


@Entity
@NamedQueries({
        @NamedQuery(name = "numberVin.all", query = "SELECT number FROM NumberVin number"),
        @NamedQuery(name = "numberVin.delete.all", query = "DELETE FROM NumberVin")
})


public class NumberVin {

	private long id;
	private String number;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
	
}
