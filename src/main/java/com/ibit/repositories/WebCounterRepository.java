package com.ibit.repositories;
import com.ibit.models.WebCounter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WebCounterRepository extends JpaRepository<WebCounter, String>{
}
