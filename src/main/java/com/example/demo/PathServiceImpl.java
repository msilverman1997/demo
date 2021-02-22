package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PathServiceImpl implements PathService{

    @Autowired
    PathRepository pathRepository;

    @Override
    public void createPath(Path path) {
        pathRepository.save(path);
    }

    @Override
    public List<Path> getPaths() {
        return (List<Path>) pathRepository.findAll();
    }

    @Override
    public Path getPath(int id) {
        Optional<Path> optional = pathRepository.findById(id);
        return optional.orElse(null);
    }
}
