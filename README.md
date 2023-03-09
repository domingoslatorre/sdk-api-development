# SDK API Development

Este repositório tem como objetivo apresentar um guideline para criação de SDKs para APIs, considerando critérios de projeto e melhores práticas. 

## O que é um SDK?

Um SDK (Software Development Kit) para uma API (Interface de Programação de Aplicativos) é um conjunto de ferramentas de desenvolvimento que permite aos desenvolvedores integrar a API em seus próprios aplicativos de software.

O SDK geralmente inclui bibliotecas, documentação, exemplos de código e outras ferramentas que ajudam os desenvolvedores a interagir com a API e integrá-la em seus aplicativos com mais facilidade.

Por exemplo, O PayPal é um serviço de pagamentos on-line que permite aos usuários enviar e receber dinheiro de forma segura em todo o mundo. Para ajudar os desenvolvedores a integrar os recursos do PayPal em seus aplicativos, a empresa oferece um SDK que contém ferramentas para simplificar o processo de pagamento.

O SDK do PayPal inclui bibliotecas de código-fonte aberto para várias plataformas, como Android, iOS, JavaScript e PHP, bem como documentação detalhada e exemplos de código. Essas ferramentas ajudam os desenvolvedores a implementar a funcionalidade de pagamento do PayPal em seus aplicativos de forma fácil e segura.

## Desenvolvimento de um SDK

Desenvolver um SDK (Software Development Kit) é um processo complexo que pode envolver várias etapas:

1. Definir quais recursos que a API oferece serão suportados pelo SDK;
1. Determinar as linguagens/plataformas que o SDK irá suportar e os recursos de desenvolvimento necessários para criar as bibliotecas de código;
1. Construir uma documentação para o SDK, incluindo instruções de instalação, exemplos de código, referência da API e outras informações relevantes;
1. Desenvolver as bibliotecas de código para cada plataforma, utilizando as melhores práticas e seguindo as diretrizes de design da plataforma;
1. Testar o SDK em diferentes ambientes para garantir que ele funcione conforme o esperado e que atenda aos requisitos de segurança;
1. Disponibilizar o SDK para os desenvolvedores, fornecendo acesso à documentação e às bibliotecas de código;
1. Manter o SDK atualizado com novas versões da plataforma e atualizações de segurança.

O desenvolvimento de um SDK pode ser um processo complexo e demorado. Portanto, é importante ter uma equipe dedicada para criar e manter um SDK que atenda às necessidades dos desenvolvedores.

## Questões de projetos de software

Ao construir um SDK, há algumas considerações de projeto de software importantes que devem ser levadas em consideração para garantir um produto de qualidade e fácil de usar:

### Modularidade
O SDK deve ser construído de forma modular, permitindo que os desenvolvedores utilizem apenas as partes necessárias da API.

Uma abordagem comum para alcançar a modularidade é dividir o SDK em módulos independentes que realizam tarefas específicas. Cada módulo pode ser implementado como uma biblioteca separada, permitindo que os desenvolvedores escolham quais módulos precisam e importem apenas essas bibliotecas em seus projetos.

Além disso, a modularidade também torna o SDK mais fácil de manter e atualizar, uma vez que as mudanças em um módulo não afetarão necessariamente outros módulos do SDK. Isso significa que os desenvolvedores podem se concentrar na manutenção e atualização dos módulos que são relevantes para suas aplicações, sem precisar se preocupar com o impacto em outras partes do SDK.

### Flexibilidade
O SDK deve ser flexível o suficiente para permitir que os desenvolvedores personalizem e estendam sua funcionalidade para atender às suas necessidades.

Uma das maneiras de tornar o SDK mais flexível é permitir a configuração de parâmetros específicos, que permitem que os desenvolvedores ajustem o comportamento do SDK para atender às suas necessidades. Por exemplo, um SDK de pagamento pode permitir que os desenvolvedores configurem as taxas de transação, o tempo de processamento ou outros detalhes específicos do processamento de pagamentos.

Além disso, o SDK deve ser fácil de integrar com outras bibliotecas e ferramentas utilizadas pelos desenvolvedores de aplicativos. Isso inclui a utilização de padrões de integração comuns, documentação clara e suporte técnico para ajudar os desenvolvedores a integrar o SDK com suas aplicações.

### Compatibilidade
A compatibilidade se refere à capacidade do SDK de trabalhar em conjunto com outros sistemas e tecnologias, como plataformas de desenvolvimento, linguagens de programação, frameworks e bibliotecas.

Para garantir a compatibilidade do SDK, é importante que ele seja projetado para ser compatível com as tecnologias mais comuns usadas pelos desenvolvedores de aplicativos. Por exemplo, se o SDK é para uma plataforma móvel, ele deve ser compatível com as linguagens de programação e frameworks usados ​​nessa plataforma.

### Desempenho
O SDK deve ser construído com desempenho em mente, minimizando a sobrecarga de rede e tempo de resposta.

Para garantir um bom desempenho do SDK, é importante que os desenvolvedores projetem o código de forma eficiente, usando algoritmos e estruturas de dados adequadas para lidar com as tarefas que o SDK precisa executar. Além disso, os desenvolvedores devem realizar testes de desempenho para avaliar o desempenho do SDK em diferentes condições de uso e ambientes de implementação.

Outro aspecto importante do desempenho é a eficiência de uso de recursos, como memória e processamento. O SDK deve ser projetado para usar os recursos de forma eficiente, sem consumir excessivamente recursos do sistema e afetar negativamente o desempenho geral do sistema.

### Segurança
O SDK deve ser seguro, protegendo as informações dos usuários e assegurando que as transações sejam processadas de forma segura.

Para garantir a segurança do SDK, é importante que os desenvolvedores implementem mecanismos de autenticação e autorização robustos para garantir que apenas usuários autorizados tenham acesso aos dados e funcionalidades da API. Além disso, os desenvolvedores devem implementar criptografia forte e padrões de segurança de rede para garantir a confidencialidade das informações que são trocadas entre os aplicativos e a API.

### Padronização
O SDK deve seguir padrões estabelecidos para a plataforma e a linguagem de programação escolhida para garantir a consistência e interoperabilidade com outros sistemas.

A padronização pode incluir a adoção de padrões de nomenclatura de classes, variáveis e funções, bem como a adesão a convenções de estilo de código. Isso ajuda a garantir que os usuários possam facilmente entender e trabalhar com o código do SDK.

A padronização também pode incluir a conformidade com padrões de codificação amplamente aceitos, como a arquitetura de software em camadas, o uso de bibliotecas de terceiros e a documentação clara de APIs e funções. Essas práticas ajudam a garantir que o SDK seja facilmente integrado com outros sistemas e projetos.

A padronização também é importante para garantir a escalabilidade e manutenibilidade do SDK. Ao adotar práticas comuns de codificação e estruturação de código, os desenvolvedores podem tornar o SDK mais fácil de manter, atualizar e expandir no futuro.

### Testes
O SDK deve ser testado em diferentes plataformas e situações para garantir sua qualidade e funcionalidade.

Existem vários tipos de testes que podem ser aplicados a um SDK, incluindo testes unitários, testes de integração, testes de sistema, testes de aceitação e testes de regressão. Cada tipo de teste tem um objetivo específico e é usado em diferentes estágios do ciclo de vida do desenvolvimento de software.

É importante que os desenvolvedores realizem testes em diferentes ambientes e configurações para garantir que o SDK funcione corretamente em diferentes sistemas operacionais, dispositivos e configurações de rede.

### Documentação
A documentação é uma consideração crítica de projeto de software na construção de um SDK, pois permite que os desenvolvedores compreendam como utilizar a API e desenvolver aplicações com base nela. A documentação deve ser clara, abrangente e fácil de seguir para garantir que os desenvolvedores possam utilizar o SDK sem dificuldades.

Uma documentação bem escrita deve fornecer instruções passo a passo para instalação e configuração do SDK, exemplos de código e guias de uso da API. Também deve incluir informações detalhadas sobre as funcionalidades e recursos do SDK, suas limitações, requisitos e compatibilidade com outras bibliotecas e plataformas.

Uma boa documentação pode ajudar a reduzir o tempo de desenvolvimento, evitar erros comuns e melhorar a experiência do desenvolvedor. Também pode ajudar a aumentar a adoção do SDK e a satisfação do usuário final, uma vez que as aplicações desenvolvidas com o SDK terão menos problemas e bugs.

### Suporte
O SDK deve ser acompanhado de um suporte de qualidade, oferecendo aos desenvolvedores a ajuda necessária para implementar a API em seus aplicativos.

Os desenvolvedores devem fornecer um suporte eficaz para garantir que os usuários possam aproveitar ao máximo o SDK e evitar possíveis problemas. O suporte pode ser oferecido através de diferentes canais, como e-mail, chat, fóruns de discussão ou telefone. A escolha do canal de suporte pode variar dependendo do tamanho da equipe de suporte, do orçamento disponível e do perfil dos usuários.


### Cache
A utilização de cache pode ajudar a reduzir o número de solicitações de rede e melhorar o desempenho do SDK. O cache é uma técnica de armazenamento temporário de dados para reduzir a necessidade de acessar dados em um local remoto, como um servidor, toda vez que eles são necessários.


### Versionamento
O SDK deve ser versionado para permitir que os desenvolvedores possam atualizar suas implementações sem afetar a compatibilidade com versões anteriores.

Existem algumas boas práticas a serem consideradas ao implementar o versionamento em um SDK:

- Semântica de versionamento: é importante adotar uma semântica de versionamento clara e consistente. A maioria dos desenvolvedores segue a convenção "Major.Minor.Patch", em que o número da versão aumenta de acordo com o grau de mudança na funcionalidade do SDK.
- Compatibilidade: as versões do SDK devem ser compatíveis com as versões anteriores. Isso significa que novas versões não devem introduzir mudanças que quebram a compatibilidade com versões anteriores sem um aviso claro aos desenvolvedores.
- Notificação de atualização: é importante notificar os usuários do SDK quando uma nova versão está disponível e descrever claramente as alterações e melhorias que foram feitas. Isso ajuda os desenvolvedores a decidir se devem atualizar o SDK e como as alterações afetam seu código existente.
- Suporte para versões anteriores: em alguns casos, pode ser necessário dar suporte a versões anteriores do SDK por um período de tempo, mesmo após a introdução de novas versões. É importante ter um plano claro de como e por quanto tempo as versões anteriores do SDK serão suportadas.

### Gerenciamento de erros
O SDK deve lidar com erros e exceções de forma adequada, fornecendo mensagens claras e soluções para os desenvolvedores.

### Resiliência
A resiliência refere-se à capacidade do SDK de lidar com falhas temporárias ou permanentes em serviços externos ou recursos.

Algumas das melhores práticas para tornar um SDK mais resiliente incluem:

- Implementar técnicas de retry: O SDK deve ser capaz de tentar novamente uma operação que falhou várias vezes, antes de informar o usuário que a operação falhou.
- Implementar fallbacks: Se o serviço externo estiver indisponível, o SDK pode tentar realizar a mesma operação em outro serviço ou usar dados em cache para garantir que o usuário possa continuar a usar o SDK.
- Monitoramento proativo: É importante monitorar o desempenho do SDK e do serviço externo regularmente para detectar possíveis problemas antes que eles se tornem críticos.
- Capacidade de falha rápida: Se o SDK detectar um problema crítico, ele deve ser capaz de interromper a operação e notificar o usuário imediatamente, em vez de esperar até o fim da operação e retornar uma resposta incorreta.
- Resposta a eventos de falha: O SDK deve ser capaz de responder automaticamente a eventos de falha, como um serviço externo que está indisponível, em vez de esperar pelo usuário para iniciar uma ação de correção.
- Teste de resiliência: O SDK deve ser testado para sua resiliência em diferentes cenários, incluindo a indisponibilidade de serviços externos ou recursos.

Idealmente, as técnicas de resiliência devem ser incorporadas tanto no SDK quanto na aplicação que o utiliza. Ambos os componentes são importantes para garantir a resiliência da solução como um todo.

Por um lado, o SDK deve ser projetado para lidar com falhas temporárias ou permanentes em serviços externos ou dependências de recursos, de modo que o desenvolvedor que usa o SDK possa confiar que ele funcionará corretamente em diversas condições. O SDK deve ter uma capacidade de resiliência incorporada, que possa lidar com falhas de rede, atrasos, erros de autenticação, entre outros tipos de falhas que possam ocorrer.

Por outro lado, a aplicação que utiliza o SDK também deve ser projetada para ser resiliente. Ela deve ser capaz de lidar com falhas do SDK, bem como com as próprias falhas, como erros de rede ou interrupções do servidor. A aplicação deve ser capaz de lidar com essas situações de maneira inteligente, para garantir que o usuário tenha uma experiência positiva e que os dados sejam protegidos.

### Compressão de dados

A compressão é uma técnica utilizada para reduzir o tamanho dos dados transmitidos em uma rede ou armazenados em disco, o que pode ajudar a melhorar o desempenho e a eficiência do seu SDK.

Ao criar um SDK, é importante considerar o tamanho dos dados que serão transmitidos entre a aplicação e a API subjacente. Se os dados forem grandes, pode haver um impacto significativo no tempo de resposta e no desempenho geral do sistema. A compressão pode ajudar a minimizar esse impacto, reduzindo o tamanho dos dados que são transmitidos.

Existem várias técnicas de compressão disponíveis, incluindo gzip e deflate, que podem ser usadas em conjunto com seu SDK. Ao incorporar a compressão em seu SDK, você pode reduzir o tamanho dos dados que estão sendo transferidos, o que pode melhorar a eficiência da rede e reduzir o tempo de resposta da aplicação.

No entanto, é importante lembrar que a compressão pode aumentar a carga de processamento da CPU, o que pode afetar o desempenho em sistemas com recursos limitados. Portanto, é importante equilibrar o tamanho dos dados transmitidos com a carga de processamento da CPU ao decidir se deve ou não usar a compressão em seu SDK.

## Referências

- [Best practices for building SDKs for APIs](https://dzone.com/articles/best-practices-for-building-sdks-for-apis/)
- [Developing a great SDK: Guidelines & Principles](https://damieng.com/blog/2021/08/05/developing-a-great-sdk/)
- [Build an API Client SDK, the Right Way](https://sweetcode.io/build-api-client-sdk/)
- https://github.com/XeroAPI/Xero-Java