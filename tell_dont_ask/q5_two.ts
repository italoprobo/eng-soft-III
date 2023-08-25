//Antes

class Animal {
    constructor(public tipo: string) {}

    fazerSom(): string {
        if (this.tipo === "gato") {
            return "Miau";
        } else if (this.tipo === "cachorro") {
            return "Au au";
        } else if (this.tipo === "vaca") {
            return "Muu";
        } else {
            return "Desconhecido";
        }
    }
}

const animal1 = new Animal("gato");
const animal2 = new Animal("cachorro");
const animal3 = new Animal("vaca");
const animal4 = new Animal("papagaio");

console.log(animal1.fazerSom());
console.log(animal2.fazerSom());
console.log(animal3.fazerSom());
console.log(animal4.fazerSom());

//Early return

class Animal1 {
    constructor(public tipo: string) {}

    fazerSom(): string {
        if (this.tipo === "gato") {
            return "Miau";
        }
        if (this.tipo === "cachorro") {
            return "Au au";
        }
        if (this.tipo === "vaca") {
            return "Muu";
        }
        return "Desconhecido";
    }
}

//Polimorfismo

class Animal3 {
    fazerSom(): string {
        return "Desconhecido";
    }
}

class Gato extends Animal3 {
    fazerSom(): string {
        return "Miau";
    }
}

class Cachorro extends Animal3 {
    fazerSom(): string {
        return "Au au";
    }
}

class Vaca extends Animal3 {
    fazerSom(): string {
        return "Muu";
    }
}

const animal10 = new Gato();
const animal20 = new Cachorro();
const animal30 = new Vaca();
const animal40 = new Animal3(); 

console.log(animal1.fazerSom());
console.log(animal2.fazerSom());
console.log(animal3.fazerSom());
console.log(animal4.fazerSom());
