// ... (código anterior)

class Banco {
    // ...

    inserir(contaum: Conta): void {
        if (this.consultar(contaum)) {
            this.contas.push(contaum);
        } else {
            console.log("Conta Inválida!");
        }
    }

    // ...
}
