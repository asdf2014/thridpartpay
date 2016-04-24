package com.thirdpartpay.web.model.customer;

public class Customer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.customer_id
     *
     * @mbggenerated
     */
    private Integer customerId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.customer_name
     *
     * @mbggenerated
     */
    private String customerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.customer_password
     *
     * @mbggenerated
     */
    private String customerPassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.sex
     *
     * @mbggenerated
     */
    private Integer sex;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.country
     *
     * @mbggenerated
     */
    private String country;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Customer.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.customer_id
     *
     * @return the value of Customer.customer_id
     *
     * @mbggenerated
     */
    public Integer getCustomerId() {
        return customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.customer_id
     *
     * @param customerId the value for Customer.customer_id
     *
     * @mbggenerated
     */
    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.customer_name
     *
     * @return the value of Customer.customer_name
     *
     * @mbggenerated
     */
    public String getCustomerName() {
        return customerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.customer_name
     *
     * @param customerName the value for Customer.customer_name
     *
     * @mbggenerated
     */
    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.customer_password
     *
     * @return the value of Customer.customer_password
     *
     * @mbggenerated
     */
    public String getCustomerPassword() {
        return customerPassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.customer_password
     *
     * @param customerPassword the value for Customer.customer_password
     *
     * @mbggenerated
     */
    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.sex
     *
     * @return the value of Customer.sex
     *
     * @mbggenerated
     */
    public Integer getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.sex
     *
     * @param sex the value for Customer.sex
     *
     * @mbggenerated
     */
    public void setSex(Integer sex) {
        this.sex = sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.email
     *
     * @return the value of Customer.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.email
     *
     * @param email the value for Customer.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.country
     *
     * @return the value of Customer.country
     *
     * @mbggenerated
     */
    public String getCountry() {
        return country;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.country
     *
     * @param country the value for Customer.country
     *
     * @mbggenerated
     */
    public void setCountry(String country) {
        this.country = country == null ? null : country.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Customer.city
     *
     * @return the value of Customer.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Customer.city
     *
     * @param city the value for Customer.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
}