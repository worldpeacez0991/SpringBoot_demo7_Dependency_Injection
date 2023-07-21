package com.example.chessDemo.model;

/**
 * JDK 14 then can use 'record' class 
 */
public record Piece(String side, String type, String position) {}
