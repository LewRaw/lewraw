//Aula 34 dia 12/07/23
function meuScopo () {
    const formulario = document.querySelector('.formulario');
    const resultado = document.querySelector('.resultado');

    const pessoas = []

    function recebeEvendoFormulario(evento){
        evento.preventDefault();
        const nome      = formulario.querySelector('.nome');
        const sobrenome = formulario.querySelector('.sobrenome');
        const peso      = formulario.querySelector('.peso');
        const altura    = formulario.querySelector('.altura');
        
        const dadosPessoa = {
            nome        : nome.value,
            sobrenome   : sobrenome.value,
            peso        : peso.value,
            altura      : altura.value
        };

        pessoas.push(dadosPessoa);

        let htmlPessoas = '<ul>'
        pessoas.forEach(function(pessoa){
            htmlPessoas += `<li>Nome: ${pessoa.nome}, Sobrenome: ${pessoa.sobrenome}, Peso: ${pessoa.peso}, Altura: ${pessoa.altura}</li>`;
        })
        htmlPessoas += '</ul>';
        
        resultado.innerHTML = htmlPessoas;
    };


    formulario.addEventListener('submit',recebeEvendoFormulario);
}

meuScopo();