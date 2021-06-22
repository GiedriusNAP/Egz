package com.giedrius.sandelis.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;

//Table - Inventory

@Entity
public class Inventory extends Client {
	@Id
	@GeneratedValue
	private long id;
	@NotBlank
	private String inventoryName;
	@NotBlank
	private double weight;
	@NotBlank
	private int sector;
	@NotBlank
	private Date inventoryPlacingDate;

	protected Inventory() {

	}

	public Inventory(@NotBlank String inventoryName, @NotBlank double weight, @NotBlank int sector,
			@NotBlank Date inventoryPlacingDate) {
		super();
		this.inventoryName = inventoryName;
		this.weight = weight;
		this.sector = sector;
		this.inventoryPlacingDate = inventoryPlacingDate;
	}

	public long getId() {
		return id;
	}

	public String getInventoryName() {
		return inventoryName;
	}

	public double getWeight() {
		return weight;
	}

	public int getSector() {
		return sector;
	}

	public Date getInventoryPlacingDate() {
		return inventoryPlacingDate;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", inventoryName=" + inventoryName + ", weight=" + weight + ", sector=" + sector
				+ ", inventoryPlacingDate=" + inventoryPlacingDate + "]";
	}

}
