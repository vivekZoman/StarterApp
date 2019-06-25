package com.application.zomato.starter.data

class Restaurant {
    var restaurantName : String? = "Restaurant Name"
    var restaurantAddress : String? = "Restaurant Address"
    var description : String? = "Description"

    constructor( name: String , address : String, des : String ){
        this.restaurantAddress = address
        this.restaurantName = name;
        this.description = des
    }
}