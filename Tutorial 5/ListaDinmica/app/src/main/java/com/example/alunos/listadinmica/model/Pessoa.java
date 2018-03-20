package com.example.alunos.listadinmica.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by alunos on 20/03/18.
 */

public class Pessoa implements Parcelable{

    private String nome;
    private String telefone;
    private int imagem;

    protected Pessoa(Parcel in) {
        nome = in.readString();
        telefone = in.readString();
        imagem = in.readInt();
    }

    public Pessoa(String nome, String telefone, int idImagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = idImagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int id) {
        this.imagem = id;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nome);
        dest.writeString(telefone);
        dest.writeInt(imagem);
    }

    public static final Parcelable.Creator<Pessoa> CREATOR = new Parcelable.Creator<Pessoa>() {
        public Pessoa createFromParcel(Parcel in) {
            return new Pessoa(in);
        }

        public Pessoa[] newArray(int size) {
            return new Pessoa[size];
        }
    };

}
