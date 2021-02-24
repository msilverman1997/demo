package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController()
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8080")
public class PathController {

    @Autowired
    private PathServiceImpl pathService;

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path = "/paths")
    public List<Path> getPaths(){
        System.out.println("Get Paths");
        return pathService.getPaths();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping(path = "/paths/{id}")
    public Path getPath(@PathVariable() int id){
        return pathService.getPath(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(path = "/paths")
    public void createPath(@RequestBody Path path){
        System.out.println("Create Path");
        pathService.createPath(path);
    }

}
