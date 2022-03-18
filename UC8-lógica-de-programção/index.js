
console.log("por favor escolha uma opção");
console.log("1 - Para realizar Inscrição");
console.log("2 - Para visualizar eventos");
console.log("3 - Para Sair");
//variavel deveria ser capturada da escolha do usuario
var opcao = 2;

function realizarInsc ()
{
    // variavel idade deveria ser inserida pelo usuario 
   let idade = 18;
    if (idade >= 18) {
        console.log("Cadastro permitido!");
        let listaDeInscrito = ["Lucas","Francisco","Anderson","Flávia","Chico", "Mário", "José", "Maria"];
        let quantidadeDeinscritos = listaDeInscrito.length;

        if (quantidadeDeinscritos < 100) {
        // aqui deveria ter um comando para o usuaria colocar os seus dados e ser capturado pelo sistema e armazenado
        listaDeInscrito.push("João");
         console.log("Incrição realizada com sucesso")
         console.log("Lista de insscrito até o momento");
         console.log(listaDeInscrito);
        } else {
         console.log("Cadastro não realizado, limite de inscrição excedido");
        }

    }

    else {
        console.log("Cadastro não permitido, menor de idade!");
      }
}

//inicio incerção
function eventos (){
    console.log("Escolha uma opçao para maiores informações");
    console.log("1 - Evento UC7 ");
    console.log("2 - Evento Uc8");
    console.log("3 - voltar ao menu anterio");

   opcao = 1;

    if ((opcao == 1 ) || (opcao == 2) || (opcao == 3 ))
{
switch (opcao) {
    case 1:
       
        console.log (" Evento UC7 será um evento para discutir as fomas de se utilizar a Metodologia Ágeis em seus projetos");
    break;
    case 2:
        console.log (" Evento UC8 será um evento para discutir as Novas metodologias voltada para Lógica de Programação");
        console.log ("opcao 2 escolhida");
    break;
    case 3:
        console.log ("opcao 3 escolhida");
    break;
    }
 } 
    else {
        console.log ("por favor digite uma opção valida");
         }

}
//fim inserção

if ((opcao == 1 ) || (opcao == 2) || (opcao == 3 ))
{
switch (opcao) {
    case 1:
        realizarInsc ();
    break;
    case 2:
        eventos ();
    break;
    case 3:
        console.log ("opcao 3 escolhida");
    break;
    }
 } 
    else {
        console.log ("por favor digite uma opção valida");
         }
    
