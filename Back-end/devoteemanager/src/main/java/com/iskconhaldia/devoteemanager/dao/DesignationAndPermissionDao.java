package com.iskconhaldia.devoteemanager.dao;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.iskconhaldia.devoteemanager.bean.DesignationAndPermission;

@Repository
public interface DesignationAndPermissionDao extends JpaRepository<DesignationAndPermission, Integer>{

	void deleteDesignationAndPermissionByDesignationId(int designationId);

	Optional<DesignationAndPermission> findDesignationAndPermissionByDesignationId(int designationId);
}
