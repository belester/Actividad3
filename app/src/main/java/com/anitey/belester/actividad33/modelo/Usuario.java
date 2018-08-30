package com.anitey.belester.actividad33.modelo;

import android.os.Parcel;
import android.os.Parcelable;

public class Usuario implements Parcelable{

    public String nombre;
    public String apellido;
    public int edad;



    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {

        parcel.writeString(nombre);

        parcel.writeString(apellido);

        parcel.writeInt(edad);

    }



    public static final Parcelable.Creator<Usuario> CREATOR

            = new Parcelable.Creator<Usuario>(){

        public Usuario createFromParcel(Parcel in) {

            return new Usuario(in);
        }
        @Override
        public Usuario[] newArray(int i) {

            return new Usuario[i];
        }
    };
    private Usuario(Parcel in){

        this.nombre = in.readString();

        this.apellido = in.readString();

        this.edad = in.readInt();
    }

    public  Usuario(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
}