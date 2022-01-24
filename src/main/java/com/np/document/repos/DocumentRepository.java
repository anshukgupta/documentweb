package com.np.document.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.np.document.entities.Document;

public interface DocumentRepository extends JpaRepository<Document, Long>{

}
