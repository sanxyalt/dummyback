package com.democorp.dummy.data.repositories;

import com.democorp.dummy.data.entities.DumbShit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DumbShitRepository extends JpaRepository<DumbShit, Integer> {

}
