package rafaelsergio.com.br.blocodenotasapp.view.formulario

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import rafaelsergio.com.br.blocodenotasapp.model.Nota
import rafaelsergio.com.br.blocodenotasapp.model.ResponseStatus
import rafaelsergio.com.br.blocodenotasapp.repository.NotaRepository

class FormularioViewModel : ViewModel(){

    val notaRepository = NotaRepository()

    val responseStatus: MutableLiveData<ResponseStatus> = MutableLiveData()

    fun salvar(titulo: String, descricao: String){
    val nota = Nota(null, titulo, descricao)
        notaRepository.salvar(nota, onComplete = {responseStatus.value = ResponseStatus(true, "Dados gravado com sucesso")}
                , onError = {responseStatus.value = ResponseStatus(false, it?.message!!)})

    }
}