package com.codeinger.ibex.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.codeinger.ibex.R;
import com.codeinger.ibex.ui.activity.CategoryActivity;
import com.codeinger.ibex.ui.activity.ProductDetailActivity;
import com.codeinger.ibex.ui.adapter.MainSliderAdapter;
import com.codeinger.ibex.ui.adapter.OurServiceAdapter;
import com.codeinger.ibex.ui.adapter.ProductAdapter;

import java.util.ArrayList;
import java.util.List;

import ss.com.bannerslider.Slider;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private View view;
    private Slider slider;
    RecyclerView ourService,trendingProduct,topSelling;

    private Button moreItem;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_home, container, false);

        init();

        slider.setAdapter(new MainSliderAdapter());
        slider.setInterval(3000);


        ourService.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        trendingProduct.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));
        topSelling.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));

        ourService.setAdapter(new OurServiceAdapter(getService()));
        trendingProduct.setAdapter(new ProductAdapter(getService(), true, new ProductAdapter.OnclickCallbcak() {
            @Override
            public void onClick() {
                startActivity(new Intent(getContext(), ProductDetailActivity.class));

            }
        }));
        topSelling.setAdapter(new ProductAdapter(getService(), false, new ProductAdapter.OnclickCallbcak() {
            @Override
            public void onClick() {
                startActivity(new Intent(getContext(), ProductDetailActivity.class));

            }
        }));


        moreItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               startActivity(new Intent(getContext(), CategoryActivity.class));
            }
        });


        return view;
    }

    void replace(Fragment fragment, String backstack) {
        FragmentTransaction ft = getFragmentManager().beginTransaction();
        ft.addToBackStack(backstack);
        ft.replace(R.id.frame, fragment,backstack);
        ft.commit();
    }

    private List<String> getService() {
        List<String> list = new ArrayList<>();
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        list.add("");
        return list;
    }

    private void init() {
        slider = view.findViewById(R.id.slider);
        ourService = view.findViewById(R.id.our_service);
        trendingProduct = view.findViewById(R.id.trending_product);
        topSelling = view.findViewById(R.id.top_selling);
        moreItem = view.findViewById(R.id.moreItem);
    }
}
