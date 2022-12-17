package io.slawek.korean.dao;

import io.slawek.korean.model.Vocab;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VocabDao extends JpaRepository<Vocab, Long> {


}
