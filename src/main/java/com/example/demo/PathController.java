package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
public class PathController {

    @Autowired
    private PathServiceImpl pathService;

    @GetMapping(path = "/paths")
    public List<Path> getPaths(){
        return pathService.getPaths();
    }

    @GetMapping(path = "/paths/{id}")
    public Path getPath(@PathVariable() int id){
        return pathService.getPath(id);
    }

    @PutMapping(path = "/paths")
    public void createPath(@RequestBody Path path){
        pathService.createPath(path);
    }

}
