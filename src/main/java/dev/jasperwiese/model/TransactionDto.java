package dev.jasperwiese.model;

import java.time.ZonedDateTime;
import java.util.UUID;

public class TransactionDto {
    private UUID uuid;

    private Integer amount;

    private ZonedDateTime timeStamp;

    private String bankSlogan;

    public TransactionDto() {
    }

    public TransactionDto(UUID uuid, Integer amount, ZonedDateTime timeStamp, String bankSlogan) {
        this.uuid = uuid;
        this.amount = amount;
        this.timeStamp = timeStamp;
        this.bankSlogan = bankSlogan;
    }

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public ZonedDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(ZonedDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getBankSlogan() {
        return bankSlogan;
    }

    public void setBankSlogan(String bankSlogan) {
        this.bankSlogan = bankSlogan;
    }

    @Override
    public String toString() {
        return "TransactionDto{" +
                "uuid=" + uuid +
                ", amount=" + amount +
                ", timeStamp=" + timeStamp +
                ", bankSlogan='" + bankSlogan + '\'' +
                '}';
    }
}
