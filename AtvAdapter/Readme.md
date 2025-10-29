# Padrão Adapter — Integração de APIs de Mídia Social

## Objetivo
Demonstrar a aplicação do **padrão de projeto Adapter** por meio da implementação de um sistema simples e unificado para publicar conteúdo em múltiplas redes sociais (Twitter, Instagram, LinkedIn e TikTok).
O foco deste exercício é adaptar diferentes APIs (simuladas) para uma **interface comum**, facilitando a integração e o reuso de código.
---

## Descrição do código
O projeto contém:

- **APIs simuladas** (`adapter.model.*`): representam as interfaces nativas de cada rede social, com métodos distintos (por exemplo `tweet`, `post`, `share`, `uploadVideo`).
- **Interface unificada** (`adapter.adapter.SocialMediaAdapter`): define o método genérico `publish(String message)` que todos os adapters implementam.
- **Adapters concretos** (`adapter.adapter.*Adapter`): cada adaptador traduz a chamada genérica `publish` para o método específico da API simulada correspondente.
- **Gerenciador** (`adapter.service.SocialMediaManager`): classe que recebe um `SocialMediaAdapter` e o usa para compartilhar mensagens (`share(String message)`).
- **Classe de execução** (`Main.java`): demonstra o uso dos adapters e do gerenciador.

---

## Observações de implementação
- As APIs estão **simuladas** (apenas `System.out.println`) para atender ao escopo acadêmico e facilitar testes sem dependências externas.
- A **Factory/Strategy** mencionada no enunciado **não** foi implementada, conforme instrução. Há espaço no projeto para incluir uma `SocialMediaFactory` mais tarde, que instancie adapters com base em configuração (arquivo `.properties`, variáveis de ambiente ou perfil).
- O projeto foi projetado para ser **extensível**: adicionar uma nova rede social exige apenas criar a API simulada e o Adapter correspondente que implemente `SocialMediaAdapter`.

---

## Benefícios do padrão Adapter (no código)
- **Desacoplamento** entre o sistema e as APIs externas.
- **Uniformidade** de uso: o gerenciador usa uma única interface (`publish`) para todas as redes.
- **Facilidade de manutenção**: mudanças na API de uma rede afetam apenas o seu Adapter.
- **Extensibilidade**: adicionar novas plataformas é simples e seguro.
