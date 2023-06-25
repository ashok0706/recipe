package com.Test.RecipeManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Test.RecipeManagement.Model.Recipe;
import com.Test.RecipeManagement.Model.RecipeUser;
import com.Test.RecipeManagement.Service.RecipeService;
//import com.Test.RecipeManagement.controller.User;



@RestController
//@RequestMapping("/recipe")
public class RecipeController {

	@Autowired
	RecipeService recipeService;
	
	@RequestMapping(value = "/home")
	public String home() {
		return "homex";
	}
	
	@PostMapping("/add")
	public String addrecipe (@RequestBody RecipeUser user ) {
	 	recipeService.addrecipe(user);
	 	return "Recipe Added";
	}
	
	@GetMapping("/getAll")
	public List<RecipeUser>  getallrecipes(){
		return recipeService.getallrecipes();
	}
	
	@GetMapping("/getbyId/{id}")
	public Recipe  getrecipebyId(@PathVariable Integer id){
		return recipeService.getrecipebyId(id);
	}
	
	@PutMapping("/update")
	public String updaterecipe(Recipe recipe) {
		return recipeService.updaterecipe(recipe);
	}
	
    @DeleteMapping("/deletebyId/{id}")
    public String deleteRecipe(@PathVariable Integer id) {
    	return recipeService.deleteRecipe(id);
    }
  
}
