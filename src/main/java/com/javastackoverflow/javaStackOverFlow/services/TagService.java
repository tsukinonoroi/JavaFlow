package com.javastackoverflow.javaStackOverFlow.services;


import com.javastackoverflow.javaStackOverFlow.models.Tag;
import com.javastackoverflow.javaStackOverFlow.repository.TagRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class TagService {

    private final TagRepository tagRepository;

    @Transactional
    public void addTagInAllTagsList(String tagName) {
        Tag tag = new Tag();
        tag.setTagName(tagName);
        tagRepository.save(tag);
    }

    public List<Tag> getAllTags() {
        return tagRepository.findAll();
    }

    @Transactional
    public void deleteTagInAllTagsList(Long id) {
        tagRepository.deleteById(id);
    }
}
