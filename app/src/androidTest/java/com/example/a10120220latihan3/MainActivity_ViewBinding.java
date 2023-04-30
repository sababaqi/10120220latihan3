package com.example.a10120220latihan3;

import android.view.View;

import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;

import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

public class MainActivity_ViewBinding implements Unbinder {
    private MainActivity target;

    private View view7f090066;

    @UiThread
    public MainActivity_ViewBinding(MainActivity target) {
        this(target, target.getWindow().getDecorView());
    }

    @UiThread
    public MainActivity_ViewBinding(final MainActivity target, View source) {
        this.target = target;

        View view;
        view = Utils.findRequiredView(source, R.id.btnWalkthroughStart, "method 'mulai'");
        view7f090066 = view;
        view.setOnClickListener(new DebouncingOnClickListener() {
            @Override
            public void doClick(View p0) {
                target.mulai();
            }
        });
    }

    @Override
    @CallSuper
    public void unbind() {
        if (target == null) throw new IllegalStateException("Bindings already cleared.");
        target = null;


        view7f090066.setOnClickListener(null);
        view7f090066 = null;
    }
}
