package resources

import java.util.LinkedHashMap;

class Address {

    private String street;
    private String suite;
    private String city;
    private String zipcode;
    private def geo = [lat: "", lng: ""];

    Address(String street, String suite, String city, String zipcode, def geo) {
        this.street = (street == 'null'|| null) ? '' : street;
        this.suite = (suite == 'null'|| null) ? '' : suite;
        this.city = (city == 'null'|| null) ? '' : city;
        this.zipcode = (zipcode == 'null'|| null) ? '' : zipcode;
        this.geo.lat = (geo.lat == 'null'|| null) ? '' : geo.lat;
        this.geo.lng = (geo.lng == 'null'|| null) ? '' : geo.lng;
    }

    String getStreet() {
        return street
    }

    String getSuite() {
        return suite
    }

    String getCity() {
        return city
    }

    String getZipcode() {
        return zipcode
    }

    def getGeo() {
        return geo
    }
}
