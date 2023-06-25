package com.Test.RecipeManagement.Model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
//@Table(name = "#USER")
public class RecipeUser {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	private String firstname;
	private String lastName;
	private String gmail;
	
	@OneToMany(cascade = CascadeType.ALL)
	private List<Recipe>  recipe;
	/**
	 * @param userId
	 * @param firstname
	 * @param lastName
	 * @param gmail
	 * @param recipe
	 */
//	public RecipeUser(String userId, String firstname, String lastName, String gmail, List<Recipe> recipe) {
//		super();
//		this.userId = userId;
//		this.firstname = firstname;
//		this.lastName = lastName;
//		
//		this.gmail = gmail;
//		this.recipe = recipe;
//	}


	




	public String getFirstname() {
		return firstname;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGmail() {
		return gmail;
	}

	public void setGmail(String gmail) {
		this.gmail = gmail;
	}

	public List<Recipe> getRecipe() {
		return recipe;
	}

	public void setRecipe(List<Recipe> recipe) {
		this.recipe = recipe;
	}
}
