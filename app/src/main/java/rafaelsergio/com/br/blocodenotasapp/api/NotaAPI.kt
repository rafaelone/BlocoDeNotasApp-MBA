package rafaelsergio.com.br.blocodenotasapp.api

import rafaelsergio.com.br.blocodenotasapp.model.Nota
import retrofit2.Call
import retrofit2.http.*


interface NotaAPI {


    @GET("/nota/getAll")
    fun buscarTodos() : Call<List<Nota>>

    @GET("/nota/titulo/{titulo}")
    fun buscarPorTitulo(@Path("titulo")titulo: String): Call<List<Nota>>

    @POST("/nota/salvar")
    fun salvar(@Body nota: Nota):Call<Nota>

    @DELETE("/nota/apagar/{id}")
    fun apagar(@Path("id") id:String): Call<Void>



}