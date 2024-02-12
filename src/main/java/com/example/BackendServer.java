package com.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class BackendServer {
    public static void main(String[] args) {
        // Set the port for your server (e.g., 4567)
        port(4567);

        // Set up Jackson ObjectMapper for JSON serialization
        ObjectMapper objectMapper = new ObjectMapper();

        // Define a simple route to handle incoming requests
        get("/hello", (req, res) -> {
            // Get and print the request details
            handleRequest(req);

            // Create a simple response object
            ApiResponse response = new ApiResponse("{Hello, this is your backend server!}");

            // Set the response type to JSON
            res.type("application/json");

            // Serialize the response object to JSON and return
            return objectMapper.writeValueAsString(response);
        });
        post("/hello", (req, res) -> {
            // Get and print the request details
            handleRequest(req);

            // Create a simple response object
            ApiResponse response = new ApiResponse("{Hello, this is your backend server!}");

            // Set the response type to JSON
            res.type("application/json");

            // Serialize the response object to JSON and return
            return objectMapper.writeValueAsString(response);
        });
        put("/hello", (req, res) -> {
            // Get and print the request details
            handleRequest(req);

            // Create a simple response object
            ApiResponse response = new ApiResponse("{Hello, this is your backend server!}");

            // Set the response type to JSON
            res.type("application/json");

            // Serialize the response object to JSON and return
            return objectMapper.writeValueAsString(response);
        });
        delete("/hello", (req, res) -> {
            // Get and print the request details
           handleRequest(req);

            // Create a simple response object
            ApiResponse response = new ApiResponse("{Hello, this is your backend server!}");

            // Set the response type to JSON
            res.type("application/json");

            // Serialize the response object to JSON and return
            return objectMapper.writeValueAsString(response);
        });
    }

    private static String handleRequest(spark.Request req) {
        // Set the response type to JSON

        // Get and print the request details
        System.out.println("Received request:");
        System.out.println("Method: " + req.requestMethod());
        System.out.println("Query Parameters: " + req.queryParams());
        Map<String, String> headers = new HashMap<>();
        req.headers().forEach(header -> headers.put(header, req.headers(header)));
        System.out.println("Headers: " + headers);
        System.out.println("Body: " + req.body());

        return null;

    }
}
