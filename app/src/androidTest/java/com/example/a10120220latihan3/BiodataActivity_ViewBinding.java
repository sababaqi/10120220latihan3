package com.example.a10120220latihan3;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;

import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

public class BiodataActivity_ViewBinding implements Unbinder {
    private BiodataActivity target;

    private View view7f090062;

    @UiThread
    public BiodataActivity_ViewBinding(BiodataActivity target) {
        this(target, target.getWindow().getDecorView());
    }

    @UiThread
    public BiodataActivity_ViewBinding(final BiodataActivity target, View source) {
        this.target = target;

        View view;
        target.edtNama = Utils.findRequiredViewAsType(source, R.id.edtBiodataName, "field 'edtNama'", EditText.class);
        view = Utils.findRequiredView(source, R.id.btnBiodataNext, "method 'selanjutnya'");
        view7f090062 = view;
        view.setOnClickListener(new DebouncingOnClickListener() {
            @Override
            public void doClick(View p0) {
                target.selanjutnya();
            }
        });

        Context context = source.getContext();
        Resources res = context.getResources();
        target.emptyTitle = res.getString(R.string.check_code_warning_empty_title_name);
        target.emptyMessage = res.getString(R.string.check_code_warning_empty_desc_name);
        target.warningTitle = res.getString(R.string.warning_title);
    }

    @Override
    @CallSuper
    public void unbind() {
        BiodataActivity target = this.target;
        if (target == null) throw new IllegalStateException("Bindings already cleared.");
        this.target = null;

        target.edtNama = null;

        view7f090062.setOnClickListener(null);
        view7f090062 = null;
    }
}
