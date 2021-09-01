package com.challenge.devops.retodevopsback.services;

import com.challenge.devops.retodevopsback.entities.Pipeline;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PipelineServiceImpl implements IPipelineService {

    private static final List<Pipeline> pipelines = new ArrayList<>();

    static {
        pipelines.add(new Pipeline(1, "Angular Pipeline", "Jhon"));
        pipelines.add(new Pipeline(2, "AWS Pipeline", "Peter"));
        pipelines.add(new Pipeline(3, "Spring Pipeline", "Mayra"));
    }

    @Override
    public List<Pipeline> getListOfPipelines() {
        return pipelines;
    }

    @Override
    public Pipeline findPipelineById(int id) {
        for (Pipeline p : pipelines) {
            if (p.getId() == id)
                return p;
        }
        return null;
    }
}
