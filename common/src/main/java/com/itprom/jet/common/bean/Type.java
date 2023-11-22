package com.itprom.jet.common.bean;

/**
 * Тип сообщений для идентификации в Kafka-message:
 * STATE - состояние самолета, аэропорта
 * ROUTE - маршрут: сконфигурирован, передан
 * START - маршрут принят на обработку, его можно выкинуть из очереди в office
 */

public enum Type {
    STATE,
    ROUTE,
    START
}
