package com.edufect.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.edufect.model.Accounts;
import com.edufect.model.NetBankings;

public interface NetBankingsRepository extends JpaRepository<NetBankings, Long> {

	Page<NetBankings> findByAccounts2(Accounts accounts, Pageable pageable);

}
