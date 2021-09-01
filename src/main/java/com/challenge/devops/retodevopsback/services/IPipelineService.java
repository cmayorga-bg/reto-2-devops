package com.challenge.devops.retodevopsback.services;

import com.challenge.devops.retodevopsback.entities.Pipeline;

import java.util.List;

public interface IPipelineService {
    public List<Pipeline> getListOfPipelines();
    public Pipeline findPipelineById(int id);
}
