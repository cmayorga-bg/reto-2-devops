package com.challenge.devops.retodevopsback.controllers;


import com.challenge.devops.retodevopsback.entities.Pipeline;
import com.challenge.devops.retodevopsback.services.IPipelineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PipelineController {

    @Autowired
    IPipelineService pipelineService;

    @GetMapping("/pipelines")
    public List<Pipeline> getListOfPipelines() {
        return pipelineService.getListOfPipelines();
    }

    @GetMapping("/pipelines/{id}")
    public Pipeline findPipelineById(@PathVariable int id) {
        return pipelineService.findPipelineById(id);
    }

}
