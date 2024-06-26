package com.example.imageUpDown.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.imageUpDown.entity.ImageEntity;



 
@Repository
public interface ImageRepository
        extends JpaRepository<ImageEntity, Long> {

	List<ImageEntity> findImageByUserId(Long id);
 
}
