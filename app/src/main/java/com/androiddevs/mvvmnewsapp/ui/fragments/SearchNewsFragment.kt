package com.androiddevs.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.androiddevs.mvvmnewsapp.databinding.FragmentSearchNewsBinding

class SearchNewsFragment : Fragment() {
    private lateinit var binding: FragmentSearchNewsBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentSearchNewsBinding.inflate(inflater, container, false)
        return binding.root
    }
}