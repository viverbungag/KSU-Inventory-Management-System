# Inventory Management System Backend

## Description

This project is a backend service for an inventory management system. It is built with Java, SQL, Spring Boot, and Gradle.

## Installation

Provide instructions on how to install and run your project.

## Usage

Provide instructions on how to use your project.

## API Endpoints

### Category Endpoints

| Method | Endpoint                | Description                       |
|--------|-------------------------|-----------------------------------|
| POST   | /api/v1/categories      | Creates a new category.           |
| PUT    | /api/v1/categories/{id} | Updates a category by its ID.     |
| GET    | /api/v1/categories/{id} | Retrieves a category by its ID.   |
| DELETE | /api/v1/categories/{id} | Deletes a category by its ID.     |
| GET    | /api/v1/categories      | Retrieves all categories.         |

### Supplier Endpoints

| Method | Endpoint                | Description                       |
|--------|-------------------------|-----------------------------------|
| POST   | /api/v1/suppliers       | Creates a new supplier.           |
| PUT    | /api/v1/suppliers/{id}  | Updates a supplier by its ID.     |
| GET    | /api/v1/suppliers/{id}  | Retrieves a supplier by its ID.   |
| DELETE | /api/v1/suppliers/{id}  | Deletes a supplier by its ID.     |
| GET    | /api/v1/suppliers/name/{name} | Retrieves a supplier by its name. |

### Unit Endpoints

| Method | Endpoint                | Description                       |
|--------|-------------------------|-----------------------------------|
| POST   | /api/v1/units           | Creates a new unit.               |
| PUT    | /api/v1/units/{id}      | Updates a unit by its ID.         |
| GET    | /api/v1/units/{id}      | Retrieves a unit by its ID.       |
| DELETE | /api/v1/units/{id}      | Deletes a unit by its ID.         |
| GET    | /api/v1/units/name/{name} | Retrieves a unit by its name.   |
| GET    | /api/v1/units           | Retrieves all units.              |
