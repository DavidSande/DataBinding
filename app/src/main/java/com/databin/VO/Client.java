package com.databin.VO;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.databin.BR;

/**
 * Bean Client
 */
public class Client extends BaseObservable{
    private String name;

    public Client(String name) {
        this.name = name;
    }
    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }
}
