package eps.udl.flexiblehellofragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import eps.udl.flexiblehellofragments.databinding.DetailFragmentBinding
class DetailFrag : Fragment() {
    private lateinit var binding: DetailFragmentBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        binding = DetailFragmentBinding.inflate(inflater, container, false)
        return binding.root
    }
    fun showText(item: String?) {
            binding.captain.text = item
    }
}



