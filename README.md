# 🧑‍🚀 Serie Recursiva
Algoritmo que gera uma serie recursiva até o N'ésimo termo (1/1 + 1/2 + 1/3 + ...  + 1/N)

## 📝 Enunciado:
Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um número
inteiro (N), apresente a saída da somatória.
<br>
• O Código deve apresentar, em formato de comentário, como foi definida a condição
de parada;
• O Código deve apresentar, em formato de comentário, como foi definida a relação de
chamada dos passos;

---

## Como usar:

### Clone esse repositório:
```bash
git clone https://github.com/GabrielGit10110/Serie_Recursiva.git
```
### Entre no diretório:
```bash
cd Serie_Recursiva
```

### ⚙️ Como compilar:
1. Transforme todos os arquivos.java em arquivos.class:
```bash
javac -s src -d dist src/controller/SerieRecursivaController.java src/view/SerieRecursiva.java
```

2. Execute:
```bash
java -cp dist view.SerieRecursiva
``` 

*@ Opcional - Compilação para jar:*
1. Crie um MANIFEST.txt e adicione o caminho correto para a classe Main:
```bash
touch MANIFEST.txt
echo 'Main-Class: view.SerieRecursiva' > MANIFEST.txt
```

2. Faca a compilação para jar:
```bash
jar -cvfm SerieRecursiva.jar MANIFEST.txt -C dist .
```

3. Execute o jar:
```bash
java -jar SerieRecursiva.jar
```
