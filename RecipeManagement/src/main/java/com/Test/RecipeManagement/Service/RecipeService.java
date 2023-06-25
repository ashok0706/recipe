package com.Test.RecipeManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.Test.RecipeManagement.Model.Recipe;
import com.Test.RecipeManagement.Model.RecipeUser;
import com.Test.RecipeManagement.Repository.RecipeRepo;
import com.Test.RecipeManagement.Repository.UserRepo;






@Service
public class RecipeService {
   @Autowired
   UserRepo userRepo;
   @Autowired
   RecipeRepo recipeRepo;
	
	public void addrecipe( RecipeUser user ) {
	
		userRepo.save(user);
		
	}

	public List<RecipeUser> getallrecipes() {
		
		return userRepo.findAll();
	}


	public String updaterecipe(Recipe recipe) {
//		@SuppressWarnings("deprecation")
		Recipe ref = recipeRepo.findById(recipe.getRecipeId()) .get();
		
		if(ref!=null)  {
			recipeRepo.save(recipe);
			return  "recipe Updated";
		}
		return " No Such recipe Id found";
	}

//	@SuppressWarnings("deprecation")
	public Recipe getrecipebyId(Integer id) {
	
		return recipeRepo.findById(id).get();
	}

	public String deleteRecipe(Integer id) {
		
//	 @SuppressWarnings("deprecation")
		try {
			Recipe ref = 	recipeRepo.findById(id).get();
					
		}
		catch (Exception e) {
			 return "No such Recipe Id Found";
		}
		
	
			 recipeRepo.deleteById(id);
			 return "Recipe Succefully deleted"; 
	
	}

}
