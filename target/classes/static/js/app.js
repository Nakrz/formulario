document.addEventListener('DOMContentLoaded', function() {
    document.getElementById('userForm').addEventListener('submit', function(event) {
        event.preventDefault();
        
        var formData = {
            nombre: document.getElementById('nombre').value,
            apellido: document.getElementById('apellido').value,
            email: document.getElementById('email').value
        };
        
        fetch('/submitFormu', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        })
        .then(response => response.text())
        .then(data => {
            alert(data);
        })
        .catch(error => {
            console.error('Error garrafal:', error);
        });
    });
});