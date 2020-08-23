package io.tissue.loginlogictest_20200823

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		loginBtn.setOnClickListener {
			val usernameOrEmail = usernameOrEmail.text.toString()
			val password = password.text.toString()

			val adminEmail = "admin@test.com"
			val adminPassword = "qwer"

			if(usernameOrEmail == adminEmail && password == adminPassword ) {
				Toast.makeText(this, "관리자 로그인입니다.", Toast.LENGTH_SHORT)
						.show()
				return@setOnClickListener
			}

			Toast.makeText(this, "로그인 실패", Toast.LENGTH_SHORT)
					.show()

		}

	}
}