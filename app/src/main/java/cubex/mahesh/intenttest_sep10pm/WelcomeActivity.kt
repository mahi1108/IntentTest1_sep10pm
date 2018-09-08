package cubex.mahesh.intenttest_sep10pm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class WelcomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        var name = intent.getStringExtra("person_name")
        welcome_text.text = "Welcome 2 NareshIT : $name"
    }
}
