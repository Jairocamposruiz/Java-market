package com.jcoder.market.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "purchases_products")
public class PurchaseProduct {
    @EmbeddedId
    private PurchaseProductPK idPurchaseProduct;
    private Integer quantity;
    private BigDecimal total;
    private Boolean state;
    @ManyToOne
    @JoinColumn(name = "id_purchase", insertable = false, updatable = false)
    private Purchase purchase;
    @ManyToOne
    @JoinColumn(name = "id_product", insertable = false, updatable = false)
    private Product product;

    public PurchaseProductPK getIdPurchaseProduct() {
        return idPurchaseProduct;
    }

    public void setIdPurchaseProduct(PurchaseProductPK idPurchaseProduct) {
        this.idPurchaseProduct = idPurchaseProduct;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }
}
