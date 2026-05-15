package com.sample.dto.interfaces;

import com.sample.dto.response.CouponBoxResponse;
import com.sample.dto.response.StoreResponse;

public interface StoreCouponInterface {
    CouponBoxResponse getCouponBox();

    StoreResponse getStore();
    void setCouponBox(CouponBoxResponse couponBox);

    void setStore(StoreResponse store);
}
