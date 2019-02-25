package leavesc.hello.databindingsamples;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import leavesc.hello.databindingsamples.databinding.ActivityMain8Binding;

public class Main8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMain8Binding binding = DataBindingUtil.setContentView(this, R.layout.activity_main8);
        binding.setList(new ArrayList<String>());
        Map<String, String> map = new HashMap<>();
        map.put("leavesC", "Hi");
        binding.setMap(map);
        binding.setKey("leavesC");
        Set<String> set = new HashSet<>();
        set.add("xxx");
        binding.setSet(set);
        binding.setArray(new String[]{"Hi", "hello"});
    }

}