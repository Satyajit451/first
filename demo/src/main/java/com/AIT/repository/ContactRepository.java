package com.AIT.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AIT.entities.contact;


@Repository
public interface ContactRepository extends JpaRepository<contact, Serializable>
{

}
