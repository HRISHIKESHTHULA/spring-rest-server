package com.example.ganesh;



import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Currency;


@Repository
public interface AccountRepository extends CrudRepository<Account, Long> {  }
