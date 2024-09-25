package spring_practice.spring_basic.service;

import lombok.Getter;
import org.springframework.stereotype.Component;
import spring_practice.spring_basic.repository.ProductRepository;

@Component
public class ProductService {

    @Getter
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
}
