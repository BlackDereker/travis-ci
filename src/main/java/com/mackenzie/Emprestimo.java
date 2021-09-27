package com.mackenzie;

public class Emprestimo {
    
    public static boolean pedir(int saldo, boolean historicoBom, boolean concessao) {
        return saldo > 1000 || historicoBom || concessao;
    }

}
