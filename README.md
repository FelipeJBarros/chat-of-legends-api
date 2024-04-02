# Chat of Legends - Api

[![PRs Welcome](https://img.shields.io/badge/PRs-S%C3%A3o_bem_vindos-brightgreen.svg?style=flat-square)](http://makeapullrequest.com)
[![Conventional friendly](https://img.shields.io/badge/Usamos-Conventional_commits-brightgreen.svg?style=flat-square)](http://commitizen.github.io/cz-cli/](https://www.conventionalcommits.org/en/v1.0.0/))

Desfrute de acesso às informações dos campeões do renomado jogo League of Legends e interaja com eles por meio de perguntas.

Esta API foi desenvolvida em Java, utilizando o framework Spring, e está integrada com a inteligência artificial Gemini.

## Rotas e estrutura de pastas:

### Rotas

- GET: */champions*
  - Obtém informações sobre todos os campeões cadastrados na base de dados.
- GET: */champions/{id}*
  - Obtém informações de um campeão cadastrado na base de dados com base no seu ID.
- POST: */champions/{id}/ask*
  - Envia uma pergunta específica a um campeão, recebendo uma resposta correspondente.

Esta API adere ao padrão Open API. Para mais detalhes sobre as rotas, consulte a interface Swagger em:
```

SUA_URL/swagger-ui/index.html

```
### Pastas

![estrutura de pastas](https://i.imgur.com/UcNEKf0.png)

Nossa aplicação adere ao padrão arquitetural de Clean Code, enfatizando a separação clara entre a camada de domínio e as camadas de serviços. Isso promove uma estrutura organizada e de fácil manutenção, permitindo uma melhor compreensão
do código e facilitando futuras expansões e modificações. Além disso, ao seguir os princípios do Clean Code, priorizamos a legibilidade, simplicidade e eficiência do nosso código, garantindo assim uma base sólida para o desenvolvimento e
evolução do projeto.

## Tecnologias:

![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

A API é alimentada por tecnologias de ponta.

- Java 17: A versão a mais recente versão da linguagem de programação Java, oferecendo melhorias de desempenho, novos recursos e atualizações de segurança. Com aprimoramentos como o tipo de registro e a melhoria contínua do sistema de tipo local,
o Java 17 proporciona uma base sólida para o desenvolvimento de aplicativos robustos e escaláveis.

- Spring Framework: É uma estrutura de desenvolvimento de aplicativos Java amplamente utilizada para criar aplicativos corporativos escaláveis e de alta qualidade. Oferece uma ampla gama de recursos, incluindo injeção de dependência,
controle transacional, segurança, acesso a dados e muito mais, simplificando o desenvolvimento e aumentando a produtividade dos desenvolvedores.

- Banco de dados H2: O H2 é um banco de dados relacional leve e de código aberto escrito em Java. Ele oferece suporte a modos de operação em memória ou embarcado, facilitando o desenvolvimento e os testes de aplicativos Java.
Além disso, o H2 é conhecido por sua rapidez e facilidade de configuração, tornando-o uma escolha popular para desenvolvedores que precisam de um banco de dados simples e eficiente.

- Comunicação entre serviços com OpenFeign: A comunicação entre serviços é simplificada com o OpenFeign, uma biblioteca Java projetada para facilitar a interação entre os diferentes componentes em uma arquitetura de microsserviços.
Esta ferramenta possibilita aos desenvolvedores criar clientes HTTP declarativos e dinâmicos, simplificando a integração com APIs externas. Através do OpenFeign, é possível definir interfaces Java simples para acessar serviços remotos,
reduzindo assim a complexidade do código e aprimorando a manutenibilidade do sistema. No projeto em questão, essa tecnologia foi empregada para estabelecer a comunicação com a API da inteligência artificial Gemini, garantindo uma integração
suave e eficiente.

- GIT com Conventional Commits: O Git é um sistema de controle de versão distribuído amplamente utilizado para o gerenciamento de código-fonte. O uso de Conventional Commits é uma prática que padroniza a forma como os commits são estruturados,
fornecendo informações consistentes e descritivas sobre as alterações realizadas no código. Isso facilita a compreensão do histórico de alterações e ajuda na automação de tarefas, como geração de changelogs e versionamento semântico.

- Boas práticas de desenvolvimento: Seguir boas práticas de desenvolvimento é essencial para garantir a qualidade, a robustez e a escalabilidade do software. Isso inclui aderir aos princípios do Clean Code, como escrever código legível,
modular e bem documentado, além de seguir padrões de projeto comprovados, realizar testes automatizados abrangentes e priorizar a simplicidade e a eficiência em todas as etapas do desenvolvimento do software. Essas práticas ajudam a garantir
que o código seja fácil de entender, manter e evoluir ao longo do tempo.

## License

Distributed under the MIT License.

## Contato

[![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white&link=https://www.linkedin.com/in/felipe-jonathan/)](https://www.linkedin.com/in/felipe-jonathan/)
[![Instagram](https://img.shields.io/badge/Instagram-%23E4405F.svg?style=for-the-badge&logo=Instagram&logoColor=white&link=https://www.instagram.com/belipefarros/)](https://www.instagram.com/belipefarros/)

<!-- MARKDOWN LINKS & IMAGES -->
[react-native-badge]: https://img.shields.io/badge/react_native-%2320232a.svg?style=for-the-badge&logo=react&logoColor=%2361DAFB
[expo-badge]: https://img.shields.io/badge/expo-1C1E24?style=for-the-badge&logo=expo&logoColor=#D04A37
[supabase-badge]: https://img.shields.io/badge/Supabase-3ECF8E?style=for-the-badge&logo=supabase&logoColor=white
[react-query-badge]: https://img.shields.io/badge/-React%20Query-FF4154?style=for-the-badge&logo=react%20query&logoColor=white
