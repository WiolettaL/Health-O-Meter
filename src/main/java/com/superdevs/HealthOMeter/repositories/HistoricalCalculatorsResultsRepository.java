package com.superdevs.HealthOMeter.repositories;

import com.superdevs.HealthOMeter.entity.HistoricalCalculatorsResults;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Transactional
@Repository
public interface HistoricalCalculatorsResultsRepository extends JpaRepository<HistoricalCalculatorsResults, Long> {

    @Override
    List<HistoricalCalculatorsResults> findAll();

    @Override
    Optional<HistoricalCalculatorsResults> findById(Long id);

    boolean existsById(Long id);

    @Override
    void deleteById(Long id);
}

