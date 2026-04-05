import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

// Make sure you pass the list here
class JokesAdapter(private val jokes: List<Joke>) : RecyclerView.Adapter<JokesAdapter.JokesViewHolder>() {

    inner class JokesViewHolder(val binding: ItemJokesBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): JokesViewHolder {
        val binding = ItemJokesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return JokesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: JokesViewHolder, position: Int) {
        val currentJoke = jokes[position]
        // Assuming your 'Joke' model has a field called 'joke'
        holder.binding.textView.text = currentJoke.joke
    }

    // THIS FIXES THE "MISSING RETURN" ERROR
    override fun getItemCount(): Int {
        return jokes.size
    }
}