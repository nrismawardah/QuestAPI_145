package com.example.consumerestapi.ui.view

import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consumerestapi.ui.PenyediaViewModel
import com.example.consumerestapi.ui.customwidget.TopAppBar
import com.example.consumerestapi.ui.navigation.DestinasiNavigasi
import com.example.consumerestapi.ui.viewmodel.EditViewModel
import kotlinx.coroutines.launch

object DestinasiEdit : DestinasiNavigasi {
    override val route = "nim_edit"
    override val titleRes = "Edit Mahasiswa"
    const val nim = "nim"
    val routeWithArgs = "$route/{$nim}"
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun EditView(
    navigateBack: () -> Unit,
    onNavigateUp: () -> Unit,
    modifier: Modifier = Modifier,
    viewModel: EditViewModel = viewModel(factory = PenyediaViewModel.Factory)
){
    val coroutineScope = rememberCoroutineScope()

    Scaffold (
        topBar = {
            TopAppBar(
                title = DestinasiEdit.titleRes,
                canNavigateBack = true,
                navigateUp = onNavigateUp
            )
        }
    ){ innerPadding ->
        EntryBody(
            insertUiState = viewModel.uiState,
            onSiswaValueChange = viewModel::updateInsertMhsState,
            onSaveClick = {
                coroutineScope.launch {
                    viewModel.editMahasiswa()
                    navigateBack()
                }
            },
            modifier = modifier
                .padding(innerPadding)
                .offset(y = (-70).dp)
        )

    }
}