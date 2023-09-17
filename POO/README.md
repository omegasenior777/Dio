+--------------------------+
|        iPhone            |
+--------------------------+
| - modelo: String         |
|--------------------------|
| + tocarMusica(): void    |
| + pausarMusica(): void   |
| + selecionarMusica(): void |
| + ligar(): void          |
| + atender(): void        |
| + iniciarConversaVoz(): void |
| + exibirPagina(): void   |
| + adicionarNovaAba(): void |
| + atualizarPagina(): void|
+--------------------------+
          ^
          |
          |implements
+--------------------------+
|   ReprodutorMusical      |
+--------------------------+
| + tocarMusica(): void    |
| + pausarMusica(): void   |
| + selecionarMusica(): void |
+--------------------------+
          ^
          |
          |implements
+--------------------------+
|   AparelhoTelefônico     |
+--------------------------+
| + ligar(): void          |
| + atender(): void        |
| + iniciarCorreioVoz(): void |
+--------------------------+
          ^
          |
          |implements
+--------------------------+
|   NavegadorNaInternet    |
+--------------------------+
| + exibirPagina(): void   |
| + adicionarNovaAba(): void |
| + atualizarPagina(): void|
+--------------------------+
