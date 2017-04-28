package com.twigs.springmvc.booking;

import javax.validation.constraints.Min;
import java.sql.Date;

public class Booking {

    @Min(value = 1, message = "invalid booking number.")
    private long bookingId;
    private long clientId;
    private String company;
    private String brand;
    private String bookingProduct;
    private String bookingType;
    private int bookingStatus;
    private int optionStatus;
    private Date quoteDate;
    private Date bookingDate;
    private Date departureDate;
    private Date definiteDate;
    private Date firmDate;
    private Date balanceDueDate;
    private boolean manualComm;
    private double commission;
    private double totalPrice;
    private double totalCost;
    private double invoiceTotal;
    private double deposit;

    public long getBookingId() {
        return bookingId;
    }

    public void setBookingId(long bookingId) {
        this.bookingId = bookingId;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBookingProduct() {
        return bookingProduct;
    }

    public void setBookingProduct(String bookingProduct) {
        this.bookingProduct = bookingProduct;
    }

    public String getBookingType() {
        return bookingType;
    }

    public void setBookingType(String bookingType) {
        this.bookingType = bookingType;
    }

    public int getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(int bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getOptionStatus() {
        return optionStatus;
    }

    public void setOptionStatus(int optionStatus) {
        this.optionStatus = optionStatus;
    }

    public Date getQuoteDate() {
        return quoteDate;
    }

    public void setQuoteDate(Date quoteDate) {
        this.quoteDate = quoteDate;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public Date getDefiniteDate() {
        return definiteDate;
    }

    public void setDefiniteDate(Date definiteDate) {
        this.definiteDate = definiteDate;
    }

    public Date getFirmDate() {
        return firmDate;
    }

    public void setFirmDate(Date firmDate) {
        this.firmDate = firmDate;
    }

    public Date getBalanceDueDate() {
        return balanceDueDate;
    }

    public void setBalanceDueDate(Date balanceDueDate) {
        this.balanceDueDate = balanceDueDate;
    }

    public boolean isManualComm() {
        return manualComm;
    }

    public void setManualComm(boolean manualComm) {
        this.manualComm = manualComm;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }
}