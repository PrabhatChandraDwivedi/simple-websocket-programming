# Simple WebSocket Programming

This repository contains code for a straightforward WebSocket program where the server sends messages that are received by the client.

## Technology Stack
- Spring Boot for WebSocket implementation on the server-side.
- React with the `react-stomp` library for WebSocket integration on the client-side.

## Overview
This project demonstrates a basic WebSocket setup, allowing bidirectional communication between the server and client. The server, implemented using Spring Boot, sends messages to clients subscribed to a specific topic. On the client side, React with the `react-stomp` library is employed to establish a WebSocket connection, receive messages, and update the UI accordingly.

## Usage
1. Ensure the Spring Boot server is running.
2. Start the React application to establish a WebSocket connection with the server.
3. Messages sent from the server will be displayed on the client.