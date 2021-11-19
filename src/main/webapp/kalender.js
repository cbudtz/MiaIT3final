async function hentPatienter(){
    let result = await fetch("rest/patients");
    console.log(result.status)
    if (result.status!=200){
        alert("noget gik galt!");
    }
    let json = await result.json();
    console.log(json)
}

let listelements =""
json.forEach(function(element){
    listelements += ("<li>"+element.name+"</li>")
})