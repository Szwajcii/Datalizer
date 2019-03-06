console.log("Connected!!!");

var selectCounter = 3;

$('#btnAdd').click(function() {
    $('#dataRow:last').after('<div id="dataRow" class="d-flex row justify-content-between align-items-center my-3">' +
        '<div class="col-1 text-center">' +
        '<button class="arrow-btn btn btn-secondary"><i class="fas fa-caret-up"></i>' +
        '</button>               </div>' +
        '<div class="col-1 text-center">' +
        '<button class="arrow-btn btn btn-secondary"><i class="fas fa-caret-down"></i></button>               </div>' +
        '<div class="input-group col-4">' +
        '<input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" placeholder="New column...">' +
        '</div><div class="col-5">' +
        '<select id="select_' + selectCounter +'" class="form-control dupa">' +
            '<option>Category...</option>' +
            '<option value="first_name">First name</option>' +
            '<option value="last_name">Last name</option>' +
            '<option value="female_name">Female name</option>' +
            '<option value="male_name">Male name</option>' +
            '<option value="age">Age</option>' +
            '<option value="phone_number">Phone number</option>' +
            '<option value="email">Email address</option>' +
            '<option value="city_US">City in United States</option>' +
            '<option value="city_EU">City in Europe</option>' +
            '<option value="capitals_world">Capital</option>' +
            '<option value="country">Country</option>' +
            '<option value="creditcard_name">Creditcard Company Name</option>' +
            '<option value="creditcard_number_visa">Creditcard Visa Number</option>' +
            '<option value="creditcard_number_american_express">Creditcard American Express Number</option>' +
            '<option value="currency_code">Currency Code</option>' +
            '<option value="ipv4">IPv4 number</option>' +
            '<option value="ipv6">IPv6 number</option>' +
            '<option value="login">Login</option>' +
            '<option value="password">Password</option>' +
        '</select></div>  ' +
        '<div id="deleteRow" class="col-1 text-center"><span><i class="fas fa-trash-alt grey icon"></i></span>   ' +
        '</div>' +
        '</div>');
        selectCounter++;
});

$('#row').on('click', '#deleteRow',function() {
    $(this).parent().remove();
});


$(document).ready(function() {
    $('#tableMain').on('click', '#breakrow', function(){
        $(this).nextUntil('#breakrow').slideToggle(200);
    });
});



function getColumnsToGenerate() {

    var columnList = [];

    var records = document.querySelector(".records");
    var optionList = document.getElementsByClassName("dupa");


    for(var i = 1; i <= optionList.length; i++) {

        var column = document.getElementById("select_" + i);
        var columnName = new Column(column.options[column.selectedIndex].value);
        columnList.push(columnName);

    }
    console.log(selectCounter);

    var httpRequest = new XMLHttpRequest();

    //Nazwa wysylana w Jsonie musi byc taka sama jak pole w klasie z lista!!!!
    var json = "{\"columnList\": " + JSON.stringify(columnList) + ", \"recordNumber\": " + JSON.stringify(records.value) + "}";

    httpRequest.open('POST', '/data');
    httpRequest.send(json);

}


class Column {
    constructor(name) {
        this.name = name;
    }
}
