package eps.udl.flexiblehellofragments

import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import eps.udl.flexiblehellofragments.databinding.DetailBinding

class DetailActivity : FragmentActivity() {

    private lateinit var binding: DetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val detalle: DetailFrag? =
            supportFragmentManager.findFragmentById(R.id.frag_capt) as DetailFrag?
        if (detalle != null) detalle.mostrarDetalle(
            intent.getStringExtra("value")
        )
    }
}