class Banco {
    // ...

    inserir(contaum: Conta): void {
        if (!this.consultar(contaum)) {
            console.log("Conta Inválida!");
            return; // Fail first: Termina a operação aqui se a conta for inválida
        }

        this.contas.push(contaum); // Tell, don't ask: Diz ao banco para inserir a conta
    }

    // ...
}
