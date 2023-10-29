package org.edu.fabs.SRP.solution;

import java.math.BigDecimal;

public class Produto {

    private String name;
    private BigDecimal price;

    public Produto(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

}
