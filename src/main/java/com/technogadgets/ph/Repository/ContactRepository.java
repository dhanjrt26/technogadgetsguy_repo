package com.technogadgets.ph.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.technogadgets.ph.model.ContactModel;


@Repository
public interface ContactRepository extends JpaRepository<ContactModel, Long>{
	
}