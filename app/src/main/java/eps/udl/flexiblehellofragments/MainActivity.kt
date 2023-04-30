package eps.udl.flexiblehellofragments

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import eps.udl.flexiblehellofragments.databinding.MainBinding


class MainActivity : FragmentActivity() {

    private lateinit var binding: MainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}


