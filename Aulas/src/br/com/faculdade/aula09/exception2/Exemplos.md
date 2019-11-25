## Exemplos de tratamento de exceções

Em cada um dos exemplos seguintes, uma classe teste tenta executar o método f()
de uma de duas classes, A ou B. Na classe A, o método f() lança uma exceção do
tipo "não verificada", no caso é uma NumberFormatException. Na classe B, o
método f() lança uma exceção do tipo "verificada", no caso uma IOException. Os
diversos exemplos mostram o uso de blocos try{}, catch{} e finally {} de várias
formas, e os comentários esclarecem sobre os efeitos decorrentes.


* TesteExc1: a exceção será capturada, e as três mensagens serão exibidas. Ou seja,
mesmo depois de finally executar, o restante do método main continua.

* TesteExc2: o bloco catch não existe. Portanto, a exceção não será capturada,
gerando um stack trace. O bloco finally e' executado, mas não o que segue depois.

* TesteExc3: o bloco catch não existe, apenas o try e o finally. Com esse valor de a, a
exceção não será lançada. Nesse caso, o código depois do bloco finally também será
executado.

* TesteExc4: como a exceção que pode ser lançada por f() e' não verificada, o
compilador não reclama por não haver a cláusula throws no cabeçalho de main. Mas a
exceção será lançada, originando um stack trace, e o método main() não continuará após o
ponto da chamada de f().

* TesteExc5: como a exceção que pode ser lançada por f() e' do tipo "não verificada", o
compilador não reclama do fato de main() não informar que pode lançar uma exceção, com
"throws NumberFormatException" ou "throws Exception". Como nesse exemplo a exceção
não será lançada, o método main irá até o final.

* TesteExc6: usa-se a informação contida no objeto exceção para gerar a mensagem
de erro, pois o método f() da classe B cria exceções com uma mensagem informativa

* TesteExc7: o compilador reclama porque a exceção que pode ser lançada por f() é do
tipo "verificada" (IOException), e o método main() não tem a clausula "throws IOException"

* TesteExc8: a exceção que pode ser lançada por f() e' verificada (IOException), e o
método main() tem a clausula "throws IOException", compilando OK.