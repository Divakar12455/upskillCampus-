function validateForm() {
    let name = document.getElementById("name").value;

    if (name === "") {
        alert("Please enter student name");
        return false;
    }

    return true;
}
