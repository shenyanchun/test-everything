package com.shen.testeverything.model;

public class Room {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.id
     *
     * @mbggenerated
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column room.name
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.id
     *
     * @return the value of room.id
     *
     * @mbggenerated
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.id
     *
     * @param id the value for room.id
     *
     * @mbggenerated
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column room.name
     *
     * @return the value of room.name
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column room.name
     *
     * @param name the value for room.name
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name;
    }
}