package com.iskconhaldia.devoteemanager.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.iskconhaldia.devoteemanager.bean.DesignationAndPermission;
import com.iskconhaldia.devoteemanager.bean.Devotee;

@Repository
public interface DevoteeDao extends JpaRepository<Devotee, Long>{

	Optional<Devotee> findDevoteeByPhoneNumber(Long phoneNumber);

	void deleteDevoteeByPhoneNumber(Long phoneNumber);
	
	@Query("SELECT devotee FROM Devotee devotee WHERE devotee.phoneNumber LIKE ?1")
	Optional<Devotee> findDevoteeByMyPhoneNumber(Long phoneNumber);

	@Query("SELECT devotee FROM Devotee devotee WHERE devotee.spiritualInformation.facilitator is NULL")
	List<Devotee> findUnAllocatedDevotee();

	@Query("SELECT devotee FROM Devotee devotee WHERE devotee.spiritualInformation.facilitator is not NULL")
	List<Devotee> findAllocatedDevotee();

}
