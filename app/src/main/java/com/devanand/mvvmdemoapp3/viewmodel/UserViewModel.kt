package com.devanand.mvvmdemoapp3.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.devanand.mvvmdemoapp3.models.UserModel
import com.devanand.mvvmdemoapp3.repository.UserRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class UserViewModel @Inject constructor(private val repo: UserRepo) : ViewModel() {

   private val _userData = MutableLiveData<List<UserModel>>()
    val userData : LiveData<List<UserModel>> = _userData

    init {
        viewModelScope.launch {
            _userData.value = repo.getUserDataRepo()
        }
    }
}