package com.bridgelabz.springbootexample.repository;

import com.bridgelabz.springbootexample.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address,Long> {
}
