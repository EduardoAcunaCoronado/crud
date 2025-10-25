package com.ejemplo.crud;

import com.ejemplo.crud.entities.Product;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
@PropertySource("classpath:messages.properties")
public class ProductValidation implements Validator {

    @Override
    public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, org.springframework.validation.Errors errors) {
        Product product = (Product) target;
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", null, "NotEmpty.product.name");
//        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "description", "NotEmpty.product.description");
        if(product.getDescription() == null || product.getDescription().isEmpty()) {
            errors.rejectValue("description", null, "NotEmpty.product.description");
        }
        if(product.getPrice() == null) {
            errors.rejectValue("price", null, "NotEmpty.product.price");
        }
        else if(product.getPrice() < 500) {
            errors.rejectValue("price", null, "Min.product.price");
        }
    }

}
