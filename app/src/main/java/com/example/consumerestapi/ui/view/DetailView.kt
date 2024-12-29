package com.example.consumerestapi.ui.view

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.consumerestapi.ui.PenyediaViewModel
import com.example.consumerestapi.ui.navigation.DestinasiNavigasi
import com.example.consumerestapi.ui.viewmodel.DetailViewModel

object DestinasiDetail : DestinasiNavigasi {
    override val route = "nim_detail"
    override val titleRes = "Detail Mahasiswa"
    const val nim = "nim"
    val routeWithArgs = "$route/{$nim}"
}

@Composable
fun DetailView(
    modifier: Modifier = Modifier,
    navigateBack: () -> Unit,
    onEditClick: (String) -> Unit,
    detailViewModel: DetailViewModel = viewModel(factory = PenyediaViewModel.Factory)
){

}