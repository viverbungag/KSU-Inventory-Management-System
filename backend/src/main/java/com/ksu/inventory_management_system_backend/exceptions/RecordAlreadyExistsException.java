package com.ksu.inventory_management_system_backend.exceptions;

/**
 * Should be thrown when there is an attempt to create a new record in a table
 * but the primary key already exists.
 */
// TODO examine each table to know what the primary keys are
public class RecordAlreadyExistsException extends RuntimeException {

    public RecordAlreadyExistsException(String message) {
        super(message);
    }

}
