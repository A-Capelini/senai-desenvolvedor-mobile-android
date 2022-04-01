class Cliente{
    constructor(nome, endereco, tel, email){
        this._nome = nome;
        this._endereco = endereco;
        this._tel = tel;
        this._email = email;
    }

    get nome() {
        return this._nome;
    }

    set nome(nome) {
        this._nome = nome;
    }
    
    get endereco() {
        return this._endereco;
    }

    set endereco(endereco) {
        this._endereco = endereco;
    }

    get tel() {
        return this._tel;
    }

    set tel(tel) {
        this._tel = tel;
    }

    get email() {
        return this._email;
    }

    set email(email) {
        this._email = email;
    }

    imprimirDados() {
        return "Nome: " + this._nome +
        "\nEndereço: " + this._endereco +
        "\nTelefone: " + this._tel +
        "\ne-mail: " + this.email
    }
}


let cliente = new Cliente('Anderson Andrade','Rua Pernambucana 360', "(11) 99999-5555", "anderson@gmail.com");
let cliente_2 = new Cliente("Flavia Souza", "Paraibana 333 ", "(88) 88811-5555" , "flavia@supercompras.com");


class Pfisica extends Cliente{
    constructor (nome, endereco, tel, email, cpf, dataNiver){
        super(nome, endereco, tel, email);
        this._cpf = cpf;
        this._dataNiver = dataNiver;
    }
    get cpf(){
        return this._cpf;
    }
    set cpf(cpf){
        this._cpf = cpf;
    }

    get dataNiver(){
        return this._dataNiver;
    }

    set dataNiver(dataNiver){
        this._dataNiver = dataNiver;
    }

    imprimirDados(){
        return super.imprimirDados() + "\nCPF: " + this._cpf + "\nData Naniverasrio: " + this._dataNiver;
    }
}


class Pjuridica extends Cliente {
    constructor (nome, tel, endereco, email, razaoSocial, cnpj) {
        super(nome, tel, endereco, email);
        this._razaoSocial = razaoSocial;
        this._cnpj = cnpj;
    }

    get razaoSocial() {
        return this._razaoSocial;
    }

    set razaoSocial(razaoSocial) {
        this._razaoSocial = razaoSocial;
    }

    get cnpj() {
        return this._cnpj;
    }

    set cnpj(cnpj){
        this._cnpj = cnpj;
    }

    imprimirDados(){
        return super.imprimirDados() + "\nRazão Social: " + this._razaoSocial + "\nCNPJ: " + this._cnpj;
    }
}


let pfisica = new Pfisica(cliente._nome, cliente._endereco, cliente._tel, cliente._email, "277.415.888-45", "05/12/89");

let pJuridica = new Pjuridica(cliente_2._nome, cliente_2._endereco, cliente_2._tel, cliente_2.email,"Super Compras Comercial Ltda", "22.222.555/0001-58");


console.log("\nCliente Pessoa Juridica")
console.log(pJuridica.imprimirDados());
console.log("\nCliente Pessoa Fisica");
console.log(pfisica.imprimirDados());