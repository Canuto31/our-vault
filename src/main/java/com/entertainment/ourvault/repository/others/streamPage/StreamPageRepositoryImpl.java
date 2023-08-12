package com.entertainment.ourvault.repository.others.streamPage;

import com.entertainment.ourvault.mapper.StreamPageMapper;
import com.entertainment.ourvault.model.dto.StreamPageDto;
import com.entertainment.ourvault.model.entity.StreamPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class StreamPageRepositoryImpl implements StreamPageRepository{

    @Autowired
    private StreamPageCrudRepository repository;
    @Autowired
    private StreamPageMapper mapper;

    @Override
    public List<StreamPageDto> getAllStreamPages() {
        List<StreamPage> streamPages = (List<StreamPage>) repository.findAll();
        return mapper.entitiesToDtos(streamPages);
    }

    @Override
    public Optional<StreamPageDto> GetStreamPageById(int idStreamPage) {
        return repository.findById(idStreamPage).map(streamPage -> mapper.entityToDto(streamPage));
    }

    @Override
    public Optional<StreamPageDto> getStreamPageByName(String name) {
        return repository.findStreamPageByName(name).map(streamPage -> mapper.entityToDto(streamPage));
    }

    @Override
    public StreamPageDto saveStreamPage(StreamPageDto streamPageDto) {
        StreamPage streamPage = mapper.dtoToEntity(streamPageDto);
        return mapper.entityToDto(repository.save(streamPage));
    }

    @Override
    public void deleteStreamPage(int idStreamPage) {
        repository.deleteById(idStreamPage);
    }
}
