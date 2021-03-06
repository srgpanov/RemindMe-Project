package srgpanov.remindme.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import srgpanov.remindme.R;

public class TodoFragment extends AbstractTabFragment{
    private  static final int LAYOUT = R.layout.fragment_examle;




    public static TodoFragment getInstance(Context context){
        Bundle args=new Bundle();
        TodoFragment fragment = new TodoFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_item_todo));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container,  Bundle savedInstanceState) {
        view=inflater.inflate(LAYOUT,container,false);


        return view;
    }

    private Context context;



    public void setContext(Context context) {
        this.context = context;
    }
}
