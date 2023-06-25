package com.Test.RecipeManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

import com.Test.RecipeManagement.Model.RecipeUser;

@Repository
public interface UserRepo extends JpaRepository<RecipeUser, Integer> {

}
