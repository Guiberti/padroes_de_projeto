# Sistema de Batalha RPG — Padrão Strategy

Este projeto foi desenvolvido como atividade da disciplina **Padrões de Projeto**, com o objetivo de aplicar o **padrão Strategy** em um sistema de combate de RPG medieval.

---

## Objetivo

Demonstrar o uso do **padrão Strategy** para permitir que diferentes personagens possam **equipar e utilizar armas variadas**, cada uma com **efeitos especiais únicos**, sem modificar o código principal das classes de personagem.

---

## Funcionalidades

- **Troca dinâmica de armas** durante a batalha (implementação do Strategy).
- **Armas com efeitos especiais**, como sangramento, queimadura e atordoamento.
- **Sistema de batalha** com turnos e lógica básica de vitória.
- **Três classes principais de personagens**: Guerreiro, Arqueiro e Mago.
- Suporte a **novas armas e efeitos**, sem alterar o código base.
- Arquitetura extensível e organizada por pacotes.
---

## Padrão de Projeto: Strategy

O padrão **Strategy** permite definir uma família de algoritmos (neste caso, **armas**) e torná-los intercambiáveis.  
Assim, cada personagem pode trocar de arma durante a execução sem precisar alterar sua implementação.

Exemplo simplificado:

```java
Personagem guerreiro = new Guerreiro("Thorin");
guerreiro.trocarArma(new EspadaLonga());
guerreiro.atacar(new Mago("Merlin"));
```

---

## Efeitos Especiais

| Arma | Dano Base | Efeito | Custo de Mana | Requisito |
|------|------------|---------|----------------|------------|
| Espada Longa | 15 | Corte Profundo (sangramento) | 0 | Força ≥ 10 |
| Arco Élfico | 12 | Chuva de Flechas (ataque em área) | 15 | Destreza ≥ 8 |
| Cajado Arcano | 8 | Bola de Fogo (queimadura) | 25 | Inteligência ≥ 12 |
| Machado de Guerra | 18 | Golpe Esmagador (atordoar) | 5 | Força ≥ 15 |
| Adaga Sombria | 10 | Ataque Furtivo (dano triplo desprevenido) | 10 | Destreza ≥ 12 |