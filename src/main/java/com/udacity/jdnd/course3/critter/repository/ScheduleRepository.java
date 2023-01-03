package com.udacity.jdnd.course3.critter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.udacity.jdnd.course3.critter.entitty.Schedule;

@Repository
public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
	List<Schedule> findByEmployeeIdList(Long employeeId);
    List<Schedule> findByPetIdList(Long petId);
}
