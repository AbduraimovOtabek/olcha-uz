package com.company.olchauz.entity;

import com.company.olchauz.entity.template.AbsUUIDEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;


@Getter
@Setter
@Entity
@Table(name = "users")
@DynamicInsert
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbsUUIDEntity {

    @Column(unique = true,name = "phone_number")
    private String phoneNumber;

    private String password;

    private String firstName;

    private String lastName;

}
