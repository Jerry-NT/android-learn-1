import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.ontapgk.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RegisterSrceen(modifier: Modifier=Modifier
//Muc 5:
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Text(
                            text = "NguyenMinhTan - 0306221068",
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                    }
                },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = Color.Blue
                )
            )
        },
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.White)
                    .padding(paddingValues),
                verticalArrangement = Arrangement.SpaceEvenly, // Cách đều giữa các thành phần
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null,
                    modifier = modifier
                        .size(50.dp) // Điều chỉnh kích thước hình ảnh nhỏ lại
                        .padding(top = 5.dp) // Căn top padding để khoảng cách đều
                )
                Text(
                    text = "Dang Ky Tai Khoan",
                    fontSize = 30.sp,
                    fontWeight = FontWeight.ExtraBold,
                    color = Color.Blue // Đổi màu thành màu đỏ
                )
                TextField(modifier = modifier.padding(top = 12.dp),
                    value = "",
                    onValueChange = {},

                )
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Button(
                        modifier = Modifier
                            .padding(top = 16.dp), // Căn top padding để khoảng cách đều
                        shape = RoundedCornerShape(6.dp),// Khung button với góc bo nhẹ
                        onClick = {
                            // Muc 6:
                        },
                        colors = ButtonDefaults.buttonColors(
                            containerColor = Color.Blue, // Màu nền của nút
                            contentColor = Color.White    // Màu của chữ trên nút
                        )
                    ) {
                        Text(text = "Đăng Ký")
                    }
                }
            }
        }
    )
}