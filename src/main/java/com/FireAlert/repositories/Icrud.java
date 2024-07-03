package com.FireAlert.repositories;

import com.FireAlert.models.Fire;
import org.springframework.data.repository.CrudRepository;

public interface Icrud extends CrudRepository<Fire, Integer> {
}
