package com.supermarket.demo.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.supermarket.demo.model.Supermarket;

@Repository
public interface SuperMarketRepository extends JpaRepository<Supermarket,Integer>{

	

	
	
	//positional parameter -> ?order match
	@Query("select s from Supermarket s where s.brand=?1 and s.name=?2")
	 public List<Supermarket> getProdByBrand(String brand,String name);
	
	//named parameter -> just name
//	@Query("select s from Player s where s.team=:team")
//	 public List<Supermarket> getProdByBrand(String brand);
	List<Supermarket> findByNameStartingWith(String prefix) ;
	List<Supermarket> findByNameEndingWith(String suffix) ;

	
	//DML
	@Modifying
	@Query("delete from Supermarket s where s.name=?1")
	public int deleteProdByName(String name);
	
	
	@Modifying
	@Query("update Supermarket s set s.brand=?1 where s.name=?2")
	public int updateProdByName(String brand,String name) ;
	
	
	@Query(value = "select * from Supermarket s where s.brand=?1",nativeQuery=true)
	public List<Supermarket> fetchByBrand(String brand) ;

	

	


}
