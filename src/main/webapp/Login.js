async function hent() {
    user = document.getElementById("Brugernavn").value;
    password = document.getElementById("password").value;
    console.log("user", user)
    console.log("password", password)
    const response = await fetch("http://localhost:8080/IT3final_war/rest/login?" + new URLSearchParams({
            Brugernavn: user,
            password: password,
        }
    ))

    console.log("hej")
    if (response.status >= 200 && response.status <= 299) {
        console.log("response: ", response)
        return response.text();
    } else {
        throw Error(await response.text());
    }

}