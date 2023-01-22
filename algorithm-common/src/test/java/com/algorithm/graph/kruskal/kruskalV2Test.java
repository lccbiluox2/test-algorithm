package com.algorithm.graph.kruskal;

import com.algorithm.entity.tree.TreeNode;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import static org.junit.Assert.*;

public class kruskalV2Test {

    @Test
    public void kruskalMST() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readTree(new TreeNode().getClass().toString());
        System.out.println("result: " + jsonNode.get("b"));

    }
}