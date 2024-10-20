package com.nt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.entity.Employye;



public interface IEmployyeRepository extends JpaRepository<Employye, Integer> {

}
