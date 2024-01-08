 $(document).ready(function () {
    $('form').submit(function (event) {
        var name = $('#name').val();
        var price = $('#price').val();
        var description = $('#description').val();

        if (name.trim() === '' || price.trim() === '' || description.trim() === '') {
            alert('Por favor, preencha todos os campos.');
            event.preventDefault();
            return;
        }

        if (isNaN(price)) {
            alert('Por favor, insira um valor válido para o preço.');
            event.preventDefault();
        }
    });
});
