# Jarnan-Script

jarNan é uma linguagem do tipo script otimização com uso da base java...
Foi feita uma interface jframe com sua própria estilo de programação pura e simples.
A aplicação tem uma meta de implementar um minerado de dados csv com base em java puro.


 ![Screenshot](https://uploaddeimagens.com.br/images/002/516/290/original/jarnan.png?1574803856)

----------------------------------------------------------------------------------------------------------------------------
indices: [x] = Completo / [n] = Não feito  / [b]= Erro ou bug / [a]=Atulizado / [ñ]=Incompleto / [att] = Proxima atulização
----------------------------------------------------------------------------------------------------------------------------

_______________________________________________________________________________________________________________

1.criando variavis dentro do linguagem, o uso do : ser para separar a variavel do valor.[ñ]

x:["10"] [ ] 

x:[10]   [ ]

x:1.0    [ ]

x:10     [x]

x:"10"   [x]

_______________________________________________________________________________________________________________

2.print e igual a pr: valor do print.[x]

pr: ola mundo

![Screenshot](https://uploaddeimagens.com.br/images/002/516/315/original/jarnanprint.png?1574805069)


_______________________________________________________________________________________________________________
3.verifica variavel [x]

v:x

![Screenshot](https://uploaddeimagens.com.br/images/002/516/307/original/jarnanvariavel.png?1574804712)


_______________________________________________________________________________________________________________
4.Estrutura de logica (if=normal) (e=else) (elif= else if) [n]

if->10==x?
{

pr:são iguais!

}

elif->10>x

{
pr:são diferentes!

}

el

{

pr:('é maior')

}

_______________________________________________________________________________________________________________


5.for exemplo de estrutura de repetição [ñ]
for(i:1(i<=10)i++) [x]
{

pr:(v:x)[n]

}

for(i:10(i>=1)i--) [n]
{

pr:(v:x)

}


![Screenshot](https://uploaddeimagens.com.br/images/002/516/320/original/jarnanfor.png?1574805768)

_______________________________________________________________________________________________________________
6.while strutura de repetição logica[n]

wh-> x!=10?{

pr:(x+'erro no sistema')

}
_______________________________________________________________________________________________________________

7.switch case logica[n]

sw->x{

c->x:1

if......

br

c->x:2

if.....

br

def
}
_______________________________________________________________________________________________________________

8.conversão type[n]

x:"10"

y:type.int(x)

z:type.float(x)

s:type.string(x)

_______________________________________________________________________________________________________________
9.função e return[n]

void valor(

x:10

return x

);
___________________________________________________________________________
10.Ler dados em csv [ñ]


Digitando o "g" na area de codigo [x]
                                              
Proxima atulização  g -d c:grafico.csv col:1 [att]
                                             


