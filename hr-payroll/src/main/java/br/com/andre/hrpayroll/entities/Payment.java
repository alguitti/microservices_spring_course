package br.com.andre.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter
@ToString
public class Payment implements Serializable{

	private static final long serialVersionUID = -2949496552281131664L;
	private String name;
	private Double dailyIncome;
	private Integer days;
	
	//para o Jackson serializar iniciar com get
	public Double getTotal() {
		
		return dailyIncome * days;
		
	}
}
