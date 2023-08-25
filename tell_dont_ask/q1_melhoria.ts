//ESSE É MEU CODIGO ANTIGO LINHA 2 ATÉ LINHA 39
class Triangulo{
    constructor (public a: number, public b: number, public c: number) {}

    ehTriangulo(a: number, b: number, c: number): boolean {
        return this.a > Math.abs(this.b-this.c) && (this.b+this.c) > this.a ;
    }

    ehIsoceles(a: number, b: number, c: number): boolean{
        if(!this.ehTriangulo(a, b, c)){
            return false
        }else{
            return this.a === this.b || this.a === this.c || this.b === this.c ;
        }
    }

    ehEquilatero(a: number, b: number, c: number): boolean{
        if(!this.ehTriangulo(a, b, c)){
            return false
        }else{
            return this.a === this.b && this.b === this.c ;
        }
    }

    ehEscaleno(a: number, b: number, c: number): boolean{
        if(!this.ehTriangulo(a, b, c)){
            return false
        }else{
            return this.a != this.b || this.a != this.c || this.b != this.c ;
        }
    }

}

let t1: Triangulo = new Triangulo(5, 4, 3);
console.log(t1.ehTriangulo(5, 4, 3));
console.log(t1.ehEquilatero(5, 4, 3));
console.log(t1.ehIsoceles(5, 4, 3));
console.log(t1.ehEscaleno(5, 4, 3));

//AGORA ESSE SERIA MEU CODIGO COM MELHORIAS 
class TrianguloMelhorado {
    constructor(public a: number, public b: number, public c: number) {}

    ehTriangulo2(): boolean {
        return this.a < this.b + this.c && this.b < this.a + this.c && this.c < this.a + this.b;
    }

    ehIsoceles2(): boolean {
        return this.ehTriangulo2() && (this.a === this.b || this.a === this.c || this.b === this.c);
    }

    ehEquilatero2(): boolean {
        return this.ehTriangulo2() && this.a === this.b && this.b === this.c;
    }

    ehEscaleno2(): boolean {
        return this.ehTriangulo2() && !this.ehEquilatero2() && !this.ehIsoceles2();
    }
}

let t2: TrianguloMelhorado = new TrianguloMelhorado(5, 4, 3);
console.log(t2.ehTriangulo2());
console.log(t2.ehEquilatero2());
console.log(t2.ehIsoceles2());
console.log(t2.ehEscaleno2());

/*
Principais mudanças:

1. Os métodos agora não recebem argumentos, pois eles usam os lados do triângulo
armazenados nas propriedades da instância.

2. A verificação se é um triângulo foi simplificada usando a desigualdade triangular.

3. Os métodos ehIsoceles, ehEquilatero e ehEscaleno agora verificam primeiro
se é um triângulo antes de prosseguir com a verificação do tipo de triângulo.
*/