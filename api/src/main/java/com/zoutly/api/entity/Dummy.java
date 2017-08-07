package com.zoutly.api.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "dummy")
public class Dummy {

    @Id
    @Column(nullable = false)
    @NonNull
    long id;

    @NonNull
    @Column(length = 1024)
    String value;
}
