console.log("Connected!!!");

var selectCounter = 1;

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
        '<select class="form-control">' +
            '<option>Category...</option>' +
            '<option value="first_name">First name</option>' +
            '<option value="last_name">Last name</option>' +
            '<option value="">Age</option>' +
            '<option value="">City</option>' +
            '<option value="">Email address</option>' +
        '</select></div>  ' +
        '<div id="deleteRow" class="col-1 text-center"><span><i class="fas fa-trash-alt grey icon"></i></span>   ' +
        '</div>' +
        '</div>')
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

    console.log("POST!!!!");

    var columnList = [];

    var records = document.querySelector(".records");
    var optionList = document.getElementsByClassName("option");

    console.log("Option list size: " + optionList.length);

    for(var i = 1; i <= optionList.length; i++) {

        console.log("For loop");

        var column = document.getElementById("select_" + i);
        var columnName = new Column(column.options[column.selectedIndex].value);
        columnList.push(columnName);

        console.log(columnName);
    }


    var httpRequest = new XMLHttpRequest();

    //Nazwa wysylana w Jsonie musi byc taka sama jak pole w klasie z lista!!!!
    var json = "{\"columnList\": " + JSON.stringify(columnList) + ", \"recordNumber\": " + JSON.stringify(records.value) + "}";

    console.log(json);

    var recordJson = JSON.stringify(records.value);

    httpRequest.open('POST', '/data');
    httpRequest.send(json);

    console.log("After post!!!");

}


class Column {
    constructor(name) {
        this.name = name;
    }
}
