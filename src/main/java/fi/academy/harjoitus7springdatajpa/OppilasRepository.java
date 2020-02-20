package fi.academy.harjoitus7springdatajpa;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface OppilasRepository extends PagingAndSortingRepository<Oppilas, Integer> {
}
