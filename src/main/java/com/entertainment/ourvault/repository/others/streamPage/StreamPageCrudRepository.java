package com.entertainment.ourvault.repository.others.streamPage;

import com.entertainment.ourvault.model.entity.StreamPage;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface StreamPageCrudRepository extends CrudRepository<StreamPage, Integer> {

    Optional<StreamPage> findStreamPageByName(String name);
}
