package in.Ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.Ashokit.entity.KES;
@Repository
public interface AsRegistationRepo extends JpaRepository<KES, Serializable> {


	


}
