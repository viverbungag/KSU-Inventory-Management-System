package com.ksu.inventory_management_system_backend.entities.transaction.depositTransaction;

import com.ksu.inventory_management_system_backend.entities.transaction.Transaction;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;


@Entity(name = "deposit_transaction")
@ToString
@RequiredArgsConstructor
@Getter
public class DepositTransaction extends Transaction {
}
