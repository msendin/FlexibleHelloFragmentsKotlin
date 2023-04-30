package eps.udl.flexiblehellofragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import eps.udl.flexiblehellofragments.databinding.DetailFragmentBinding

class DetailFrag : Fragment() {
    var tview: TextView? = null
    private var binding: DetailFragmentBinding? = null

    override fun onViewCreated(v: View, savedInstanceState: Bundle?) {
        super.onViewCreated(v, savedInstanceState)
        tview = requireView().findViewById(R.id.captain)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        //super.onCreateView(inflater, container, savedInstanceState)
        binding = DetailFragmentBinding.inflate(inflater, container, false)
        binding!!.captain!!.text = "Johnathan Archer"
        return binding!!.root
    }

    fun mostrarDetalle(item: String?) {
            binding!!.captain.text = item
    }
}
