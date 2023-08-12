package com.entertainment.ourvault.repository.others.streamPage;

import com.entertainment.ourvault.model.dto.StreamPageDto;

import java.util.List;
import java.util.Optional;

public interface StreamPageRepository {

    List<StreamPageDto> getAllStreamPages();

    Optional<StreamPageDto> GetStreamPageById(int idStreamPage);

    Optional<StreamPageDto> getStreamPageByName(String name);

    StreamPageDto saveStreamPage(StreamPageDto streamPageDto);

    void deleteStreamPage(int idStreamPage);
}
