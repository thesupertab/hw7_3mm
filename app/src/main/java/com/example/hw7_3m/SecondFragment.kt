package com.example.hw7_3m

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hw7_3m.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private lateinit var binding: FragmentSecondBinding

    private val musicList = arrayListOf(
        Music("1","Группа крови","Кино","4:51"),
        Music("2","Faded","Alan Walker","3:33"),
        Music("3","The spectre","Alan Walker","3:27"),
        Music("4","Alone","Alan Walker","2:44"),
        Music("5","Darkside","Alan Walker","4:00"),
        Music("6","Звезда по имени солнце","Кино","3:40"),
        Music("7","Перемен","Кино","4:56"),
        Music("8","Alone","Marshmallo","3:20"),
        Music("9","Together","Marshmallo","3:48"),
        Music("10","Find Me","Marshmallo","3:08")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        val adapter = MusicAdapter(musicList, this::onClick)
        binding.musicRv.adapter = adapter
    }

    private fun onClick(pos: Int) {
        val intent = Intent(activity, DetailActivity::class.java)
        intent.putExtra("key2", pos)
        startActivity(intent)
    }
}