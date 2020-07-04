package mgm.crud_firebase_demo.ui

import android.view.View
import mgm.crud_firebase_demo.data.Author

interface RecyclerViewClickListener {
    fun onRecyclerViewItemClicked(view: View, author: Author)
}