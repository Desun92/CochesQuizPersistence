package es.android.coches.repositorio.implementacion;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;
import java.util.Optional;

import es.android.coches.entidad.Pregunta;
import es.android.coches.repositorio.interfaz.Repositorio;

public class RepositorioSQLiteImpl extends SQLiteOpenHelper implements Repositorio<Pregunta> {

    public RepositorioSQLiteImpl(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    @Override
    public Optional<Pregunta> get(long id) {
        return Optional.empty();
    }

    @Override
    public List<Pregunta> getAll() {
        return null;
    }

    @Override
    public void save(Pregunta pregunta) {

    }

    @Override
    public void update(Pregunta pregunta) {

    }

    @Override
    public void delete(Pregunta pregunta) {

    }
}
