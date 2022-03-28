package com.example.shoppa.presentation

import androidx.lifecycle.ViewModel
import com.example.shoppa.data.ShopListRepositoryImpl
import com.example.shoppa.domain.DeleteShopItemUseCase
import com.example.shoppa.domain.EditShopItemUseCase
import com.example.shoppa.domain.GetShopItemUseCase

class MainViewModel : ViewModel() {

    private val repository = ShopListRepositoryImpl

    private val getShopListUseCase = GetShopItemUseCase(repository)
    private val deleteShopListUseCase = DeleteShopItemUseCase(repository)
    private val editShopListUseCase = EditShopItemUseCase(repository)


}