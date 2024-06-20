package com.srikantvs.java8.textblocks;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class TextBlocksDemo {
    // find /home/codespace/.m2/repository/com/fasterxml/ -name "*.jar" -exec cp {} ./lib/ \;
    public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String data = "{\r\n"
                + "\"Name\" : \"Java\","
                + "\n\"RollNO\" : \"20\"\r\n"
                + "}";
        // Text blocks can bed used in place of string literal improve the readability of code
        String jsonDataWithTextBlocks = """
                {
                    "companyName": "companyName",
                    "description": "description"
                }
                """;

        JsonNode result1 = objectMapper.readTree(jsonDataWithTextBlocks);
        System.out.println(result1.toPrettyString());

        JsonNode result2 = objectMapper.readTree(data);
        System.out.println(result2.toPrettyString());
    }

}
