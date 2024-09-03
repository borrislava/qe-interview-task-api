package resources

class User {
    private int id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;
    private def company = [
            name: "",
            catchPhrase: "",
            bs: ""
    ];
    private Address address;
    private Todo todo;

    User() {}

    User(int id, String name, String username, String email, def address, String phone, String website, def company) {
        this.name = name == 'null'|| null ? '' : name;
        this.username = username == 'null'|| null ? '' : username;
        this.email = email == 'null'|| null ? '' : email;
        this.id = id;
        this.address = new Address (address.street, address.suite, address.city, address.zipcode, address.geo);
        this.phone = (phone == 'null'|| null) ? '' : phone;
        this.website = (website == 'null'|| null) ? '' : website;
        this.company.name = (company.name == 'null'|| null) ? '' : company.name;
        this.company.catchPhrase = (company.catchPhrase == 'null'|| null) ? '' : company.catchPhrase;
        this.company.bs = (company.bs == 'null'|| null ? '' : company.bs);
        this.address = new Address(address.street, address.suite, address.city, address.zipcode, address.geo);
    }

    int getId() {
        return id;
    }

    String getUsername() {
        return username
    }

    String getName() {
        return name
    }

    String getEmail() {
        return email;
    }

    Address getAddress() {
        return address;
    }

    String getPhone() {
        return phone;
    }

    String getWebsite() {
        return website;
    }

    def getCompany() {
        return company;
    }
}