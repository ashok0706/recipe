package com.Test.RecipeManagement.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe  {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer Id;
	private String recipeNameString; 
	private String ingredients;
	private String instructions;
//	private String comment;
//	private String comentingUsernamel;
    

	
	/**
	 * @param recipeId
	 * @param recipeNameString
	 * @param ingredients
	 * @param instructions
	 * @param comment
	 * @param comentingUsernamel
	 */
//	public Recipe(Integer recipeId, String recipeNameString, String ingredients, String instructions, String comment,
//			String comentingUsernamel) {
//		super();
//		this.Id = recipeId;
//		this.recipeNameString = recipeNameString;
//		this.ingredients = ingredients;
//		this.instructions = instructions;
//		this.comment = comment;
//		this.comentingUsernamel = comentingUsernamel;
//	}
//	public String getComentingUsernamel() {
//		return comentingUsernamel;
//	}
//	public void setComentingUsernamel(String comentingUsernamel) {
//		this.comentingUsernamel = comentingUsernamel;
//	}
	public Integer getRecipeId() {
		return Id;
	}
	public void setRecipeId(Integer recipeId) {
		this.Id = recipeId;
	}
	public String getRecipeNameString() {
		return recipeNameString;
	}
	public void setRecipeNameString(String recipeNameString) {
		this.recipeNameString = recipeNameString;
	}
	public String getIngredients() {
		return ingredients;
	}
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	public String getInstructions() {
		return instructions;
	}
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
//	public String getComment() {
//		return comment;
//	}
//	public void setComment(String comment) {
//		this.comment = comment;
//	}
}
