package org.dremlogic.repository;

import org.dremlogic.entity.EmployeeAddress;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmplAddressRepository extends JpaRepository <EmployeeAddress,Long> {

}
