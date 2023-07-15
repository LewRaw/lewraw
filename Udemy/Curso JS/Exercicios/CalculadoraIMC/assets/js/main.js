function scopoGlobal(){
    const form = document.querySelector('#form');

    function calcularIMC(evento){
        evento.preventDefault();
        let pesoString = form.querySelector('#input-peso');
        let alturaString = form.querySelector('#input-altura');
        let response = form.querySelector('#response');
        let peso = Number(pesoString.value.replace(',','.'));
        let altura =  Number(alturaString.value.replace(',','.'));

        if (validaAltura(altura) && validaPeso(peso)){
            let valorImc = (peso/(altura**2)).toFixed(2)
            //
            console.log(valorImc)
            if (valorImc < 18.5){
                response.value = 'Abaixo do peso'
                response.style.background = "rgb(156, 59, 55)"
            }else if(valorImc >= 18.5 && valorImc < 25){
                response.value = 'Peso normal'
                response.style.background = "rgb(54, 121, 54)";
            }else if(valorImc >= 25 && valorImc < 30){
                response.value = 'Excesso de Peso'
                response.style.background = "rgb(156, 59, 55)";
            }else if(valorImc >= 30 && valorImc < 35){
                response.value ='Obesidade nivel 1'
                response.style.background = "rgb(156, 59, 55)";
            }else if(valorImc >= 35 && valorImc < 40){
                response.value ='Obesidade nivel 2'
                response.style.background = "rgb(156, 59, 55)";
            }else{
                response.value ='Obesidade nivel 3'  
                response.style.background = "rgb(156, 59, 55)";              
            }      
        }else{           
            response.style.background = "rgb(156, 59, 55)";
            if (!validaAltura(altura) && !validaPeso(peso)){
                response.value = 'Altura e Peso inválidos'
            }else if(!validaAltura(altura) && validaPeso(peso)){
                response.value = 'Altura inválida'
            }else{!validaPeso(peso) && validaAltura(altura)
                response.value = 'Peso inválido'
            }
        }
        response.style.display = ""
        response.style.color = "black"
    }

    function validaPeso(peso){
        if ((peso < 10.00)||isNaN(peso)){
            return false;
        }else{
            return true;
        };
    };

    function validaAltura(altura){
        if (((altura*100)<=40)||isNaN(altura)){
            return false;
        }else{
            return true;
        };
    };

    form.addEventListener('submit',calcularIMC)
}

scopoGlobal();