package pe.nunez.jhonatan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.nunez.jhonatan.model.Bus;

public interface IBusRepository extends JpaRepository<Bus, Long> {

}
