package com.example.demo;

import java.util.List;

public interface PathService {

    public void createPath(Path path);

    public List<Path> getPaths();

    public Path getPath(int id);

}
