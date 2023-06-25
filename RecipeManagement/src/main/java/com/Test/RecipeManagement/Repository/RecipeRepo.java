package com.Test.RecipeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Test.RecipeManagement.Model.Recipe;
@Repository
public interface RecipeRepo extends JpaRepository<Recipe, Integer>{

}
