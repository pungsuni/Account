package com.zerobase.convpay.service;

import com.zerobase.convpay.type.CancelPaymentResult;
import com.zerobase.convpay.type.PayMethodType;
import com.zerobase.convpay.type.PaymentResult;

public interface PaymentInterface {
    PayMethodType getPayMethodType();
    public PaymentResult payment(Integer payAmount);
    public CancelPaymentResult cancelPayment(Integer cancelAmount);

}
