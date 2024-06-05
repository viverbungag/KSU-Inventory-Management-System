package com.ksu.inventory_management_system_backend.entities.transaction.withdrawTransaction;

import com.ksu.inventory_management_system_backend.entities.transaction.Transaction;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Entity(name = "withdraw_transaction")
@ToString
@RequiredArgsConstructor
@Getter
public class WithdrawTransaction extends Transaction {
}
