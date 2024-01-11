package com.cs.ibit.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.cs.ibit.models.WebCounter;

public interface WebCounterRepository extends JpaRepository<WebCounter, String>{
}
