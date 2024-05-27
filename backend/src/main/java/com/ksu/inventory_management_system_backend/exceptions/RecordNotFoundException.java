package com.ksu.inventory_management_system_backend.exceptions;

/**
 * Should be thrown when there is no record found.
 */
public class RecordNotFoundException extends RuntimeException {

    public RecordNotFoundException(String message) {}

}
