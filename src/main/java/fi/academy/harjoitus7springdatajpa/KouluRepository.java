package fi.academy.harjoitus7springdatajpa;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface KouluRepository extends PagingAndSortingRepository<Koulu, Integer> {
}
