package exerciciosSet;

/*
1. Ordem de Inserção
2. Ordem Natural (nome)
3. IDE
4. Ano de criação e nome
5. Nome, ano de criação e IDE
 */

import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Linguagem {

    public static void main(String[] args) {

        System.out.println("1. Ordem de Inserção: ");
        Set<LinguagemFavorita> linguagens = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Python", 1989, "PyCharm"));
            add(new LinguagemFavorita("SQL", 1979, "MySQL"));
            add(new LinguagemFavorita("Java", 1991, "InlelliJ"));
        }};
        for (LinguagemFavorita lingua : linguagens) {
            System.out.println(lingua);
        }

        System.out.println("2. Ordem Natural (nome):");
        Set<LinguagemFavorita> linguagens2 = new TreeSet<>(linguagens);
        for (LinguagemFavorita lingua : linguagens2) {
            System.out.println(lingua);
        }

        System.out.println("3. Ordem IDE:");
        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorIde());
        linguagens4.addAll(linguagens);
        for (LinguagemFavorita lingua: linguagens4) {
            System.out.println(lingua);
        }

        System.out.println("4. Ordem: Ano de Criação e Nome: ");
        Set<LinguagemFavorita> linguagem5 = new TreeSet<>(new ComparatorAnoCriacaoNome());
        linguagem5.addAll(linguagens);
        for (LinguagemFavorita lingua : linguagem5) {
            System.out.println(lingua);
        }

        System.out.println("5. Ordem: Nome, Ano de Criação e IDE:");
        Set<LinguagemFavorita> linguagem6 = new TreeSet<>(new ComparatorNomeAnoCriacaoIde());
        linguagem6.addAll(linguagens);
        for (LinguagemFavorita lingua : linguagem6) {
            System.out.println(lingua);
        }
    }
}


class LinguagemFavorita implements Comparable <LinguagemFavorita> {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    @Override
    public String toString() {
        return "{" +
                "Linguagem='" + nome + '\'' +
                ", Ano de Criação=" + anoDeCriacao +
                ", IDE='" + ide + '\'' +
                '}';
    }

    @Override
    public int compareTo(LinguagemFavorita linguagem) {
        return this.getNome().compareToIgnoreCase(linguagem.getNome());
    }
}


class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIde().compareTo(l2.getIde());
    }
}


class ComparatorAnoCriacaoNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;
        return  l1.getNome().compareTo(l2.getNome());
    }
}


class ComparatorNomeAnoCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if (nome != 0) return nome;

        int anoDeCriacao = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if (anoDeCriacao != 0) return anoDeCriacao;

        return  l1.getIde().compareTo(l2.getIde());
    }
}