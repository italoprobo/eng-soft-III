class Pedido {
    constructor(public numero: number, public itens: Item[]) {}

    processarPedido(): void {
        let quantidadeInsuficiente = false;

        for (const item of this.itens) {
            if (item.quantidadeDisponivel() < item.quantidade) {
                quantidadeInsuficiente = true;
                break;
            }
        }

        if (quantidadeInsuficiente) {
            console.log("Quantidade insuficiente para processar o pedido");
        } else {
            console.log("Pedido processado com sucesso");
            for (const item of this.itens) {
                item.reduzirEstoque(item.quantidade);
            }
        }
    }
}

class Item {
    constructor(public nome: string, public quantidade: number) {}

    quantidadeDisponivel(): number {
        // Lógica para verificar a quantidade disponível
        return 10; // Exemplo
    }

    reduzirEstoque(quantidade: number): void {
        // Lógica para reduzir o estoque
        console.log(`Reduzindo estoque de ${this.nome} em ${quantidade} unidades`);
    }
}

const item1 = new Item("Camiseta", 3);
const item2 = new Item("Calça", 2);

const pedido = new Pedido(1, [item1, item2]);
pedido.processarPedido();
