package com.cft.weixin.bean.scan.result;


import com.cft.weixin.bean.BaseResult;
import com.cft.weixin.bean.scan.crud.ProductCreate;

public class ProductGetResult extends BaseResult {
    private ProductCreate productCreate;

    public ProductCreate getProductCreate() {
        return productCreate;
    }

    public void setProductCreate(ProductCreate productCreate) {
        this.productCreate = productCreate;
    }
}
