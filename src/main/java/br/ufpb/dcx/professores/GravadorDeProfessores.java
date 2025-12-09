package br.ufpb.dcx.professores;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;

public class GravadorDeProfessores {

    public static final String ARQUIVO_PROFESSORES = "professores.dat";


    public void gravarDadosDeProfessores(Collection<Professor> professores) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(ARQUIVO_PROFESSORES));
        ArrayList<Professor> listaProfs = new ArrayList<>();
        listaProfs.addAll(professores);
        out.writeObject(listaProfs);

    }

    public Collection<Professor> lerDadosDeProfessores() throws IOException, ClassNotFoundException {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream(ARQUIVO_PROFESSORES));
        ArrayList<Professor> objetosLidos = (ArrayList) in.readObject();
        return objetosLidos;
    }

}
