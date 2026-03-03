package com.makers.makersbnb.repository;

import java.util.List;
import com.makers.makersbnb.model.Space;
import org.springframework.data.repository.CrudRepository;

public interface SpaceRepository extends CrudRepository<Space, Long> {

    public List<Space> findSpaceByName(String name);
}
