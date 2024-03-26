package co.simplon.AlloPito.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "service")
public class Service {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_service;

	@Column(name = "name_service", length = 50, nullable = false)
	private String name_service;

	public int getId_service() {
		return id_service;
	}

	public void setId_service(int id_service) {
		this.id_service = id_service;
	}

	public String getName_service() {
		return name_service;
	}

	public void setName_service(String name_service) {
		this.name_service = name_service;
	}

}
