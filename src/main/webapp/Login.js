function hent() {
    user = document.getElementById("Brugernavn").value;
    password = document.getElementById("password").value;
    fetch("http://localhost:8080/IT3final_war/rest/Login?" + new URLSearchParams({
        Brugernavn: user,
        password: password,
}

    )).then(async response => {
        if (response.status >=200 && response.status <=299) {
            return response.text();
        } else {
            throw Error (await response.text());
        }
        }).then()

}