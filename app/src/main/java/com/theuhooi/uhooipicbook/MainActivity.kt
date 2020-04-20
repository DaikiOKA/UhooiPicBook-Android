package com.theuhooi.uhooipicbook

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.theuhooi.uhooipicbook.modules.monsterdetail.MonsterDetailFragment
import com.theuhooi.uhooipicbook.modules.monsterlist.MonsterListFragment
import com.theuhooi.uhooipicbook.modules.monsterlist.entity.MonsterContent

class MainActivity : AppCompatActivity(), MonsterListFragment.OnListFragmentInteractionListener {

    // MARK: View Life-Cycle Methods

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // MARK: MonsterListFragment.OnListFragmentInteractionListener

    override fun onListFragmentInteraction(item: MonsterContent.MonsterItem?) {
        if (item == null) {
            return
        }
        val transition = supportFragmentManager.beginTransaction()
        transition.addToBackStack(null)
        transition.replace(R.id.monster_list_fragment, MonsterDetailFragment.newInstance(item))
        transition.commit()
    }

}
