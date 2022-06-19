package br.com.andre.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "tb_worker")
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString
@AllArgsConstructor
@Getter
@Setter
public class Worker implements Serializable{

	private static final long serialVersionUID = 9080284430081495864L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private Double dailyIncome;
	
}
