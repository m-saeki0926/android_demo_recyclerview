package landland.tech.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import landland.tech.myapplication.adapter.VerticalAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRecyclerView();
    }

    private void initRecyclerView() {
        // Setting recycler view
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        // Generate demo data
        List<Object> demoList = new ArrayList<>();
        demoList.add(null);
        demoList.add(null);
        demoList.add(null);
        demoList.add(null);
        demoList.add(null);
        // Setting adapter
        VerticalAdapter adapter = new VerticalAdapter(this, demoList);
        recyclerView.swapAdapter(adapter, false);
    }
}
