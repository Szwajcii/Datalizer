console.log("Connected!!!");

$('#btnAdd').click(function() {
    $('#dataRow:last').before('<div id="dataRow" class="d-flex row justify-content-between align-items-center my-3"><div class="col-1 text-center"><button class="arrow-btn btn btn-secondary"><i class="fas fa-caret-up"></i></button>               </div><div class="col-1 text-center"><button class="arrow-btn btn btn-secondary"><i class="fas fa-caret-down"></i></button>               </div><div class="input-group col-4"><input type="text" class="form-control" aria-label="Sizing example input" aria-describedby="inputGroup-sizing-default" placeholder="New column..."></div><div class="col-5"><select class="form-control"><option>Category...</option></select></div>  <div id="deleteRow" class="col-1 text-center"><span><i class="fas fa-trash-alt grey icon"></i></span>        </div>    </div>')
});

$('#row').on('click', '#deleteRow',function() {
    $(this).parent().remove();
});

// $(document).ready(function(){
//     $('#tableMain').on('click', 'li.breakdown', function() {
//         $(this).nextUntil('li.breakdown').slideToggle(200);
//     });
// })


$(document).ready(function() {
    $('#tableMain').on('click', '#breakrow', function(){
        $(this).nextUntil('#breakrow').slideToggle(200);
    });
});



function getColumnsToGenerate() {

    console.log("POST!!!!");

    var columnList = [];

    var records = document.querySelector(".records");


    var httpRequest = new XMLHttpRequest();

    var json = "{\"columns\": " + JSON.stringify(columnList) + "}";

    httpRequest.open('POST', '/data');
    httpRequest.send(json);

}

