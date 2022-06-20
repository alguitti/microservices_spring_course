package br.com.andre.hrpayroll.entities;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Worker implements Serializable{

	private static final long serialVersionUID = 9080284430081495864L;
	
	private Long id;
	private String name;
	private Double dailyIncome;
	
}
