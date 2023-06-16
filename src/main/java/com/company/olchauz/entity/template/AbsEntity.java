package com.company.olchauz.entity.template;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
@MappedSuperclass
@Getter
@Setter
@EntityListeners(AuditingEntityListener.class)
public abstract class AbsEntity implements Serializable {

    //CreatedDate
    @CreationTimestamp
    @CreatedDate
    @Column(updatable = false, nullable = false)
    private LocalDate createdAt;

    @UpdateTimestamp
    @LastModifiedDate
    @Column(nullable = false)
    private LocalDateTime updateAt;

    @CreatedBy
    @Column(updatable = false)
    private UUID createdById;

    @LastModifiedBy
    private UUID updateById;
    /*
     @LastModifiedBy
     anotatsiya bir jadvalda yozilgan ma'lumotlarni o'zgartirgan oxirgi
     foydalanuvchi haqida ma'lumotlarni saqlash uchun foydalaniladi.
     */

    /*@MappedSuperclass anotatsiyasi berilgan klassni table sifatida ma'lum etmaydi,
     ammo uning atributlari qo'shimcha table atributlar bilan birlashtiriladi.
     Bunda, berilgan klass boshqa klasslar tomonidan "extend" qilinishi yoki
      uning atributlari yordamida database da table ga data lar saqlanmasi uchun ishlatiladi.
    */


}
