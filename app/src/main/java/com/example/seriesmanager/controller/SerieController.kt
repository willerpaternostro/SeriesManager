package com.example.seriesmanager.controller

import com.example.seriesmanager.MainSerieActivity
import com.example.seriesmanager.dao.SerieDao
import com.example.seriesmanager.dao.SerieSQLite
import com.example.seriesmanager.model.Serie
import com.example.seriesmanager.model.SerieFirebase

class SerieController(mainSerieActivity: MainSerieActivity) {
    private val serieDAO: SerieDao = SerieFirebase()

    fun inserirSerie(serie: Serie) = serieDAO.criarSerie(serie)
    fun buscarSeries() = serieDAO.recuperarSeries()
    fun apagarSerie(nome: String) = serieDAO.removerSerie(nome)

}