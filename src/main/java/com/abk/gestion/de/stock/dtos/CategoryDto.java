package com.abk.gestion.de.stock.dtos;

import com.abk.gestion.de.stock.entities.AbstractEntity;
import com.abk.gestion.de.stock.entities.Article;
import com.abk.gestion.de.stock.entities.Category;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.beans.BeanUtils;


import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class CategoryDto {
    private Long id ;
    private String code;
    private String designation ;

    @JsonIgnore
    private List<Article> articles;

    public CategoryDto fromCategory (Category category){
       return  CategoryDto.builder()
               .id(category.getId())
               .code(category.getCode())
               .designation(category.getDesignation())
               .build() ;
    }
    public Category fromCategoryDto(CategoryDto categoryDto){
          Category category = new Category() ;
        BeanUtils.copyProperties(categoryDto,category);
        return category ;
    }

}
