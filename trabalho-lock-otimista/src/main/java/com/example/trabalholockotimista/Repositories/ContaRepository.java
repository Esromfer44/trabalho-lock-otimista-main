package com.example.trabalholockotimista.Repositories;

import com.example.trabalholockotimista.Entities.NewConta;

import jakarta.persistence.LockModeType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.stereotype.Repository;

@Repository
public interface ContaRepository extends JpaRepository<NewConta, Long> {
    @Lock(LockModeType.OPTIMISTIC)
    NewConta findByNumeroConta(String numeroConta);
}
