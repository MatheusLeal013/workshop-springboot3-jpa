package com.educandoweb.course.enums;

public enum OrderStatus {

    // No enum é atribuido um valor enumerado para cada constante, começando com 0
    // Atribuir manualmente caso precisa de alterações futuras
    WAITING_PAYMENT(1),
    PAID(2),
    SHIPPED(3),
    DELIVERED(4),
    CANCELED(5);

    private int code;

    private OrderStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    // Metodo é estático porque ele pode ser usado sem ter um objeto instaciado
    public static OrderStatus valueOf(int code) {
        for (OrderStatus value : OrderStatus.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid OrderStatus code");
    }
}
