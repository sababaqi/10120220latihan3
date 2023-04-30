// Generated code from Butter Knife. Do not modify!
package com.example.a10120220latihan3;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;

import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

public class DoneActivity_ViewBinding implements Unbinder {
  private DoneActivity target;

  private View view7f090065;

  @UiThread
  public DoneActivity_ViewBinding(DoneActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public DoneActivity_ViewBinding(final DoneActivity target, View source) {
    this.target = target;

    View view;
    target.txtNama = Utils.findRequiredViewAsType(source, R.id.txtDoneTitle, "field 'txtNama'", TextView.class);
    view = Utils.findRequiredView(source, R.id.btnDoneNext, "method 'selesai'");
    view7f090065 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.selesai(p0);
      }
    });

    Context context = source.getContext();
    Resources res = context.getResources();
    target.beres = res.getString(R.string.activation_beres);
    target.sudahBisa = res.getString(R.string.activation_sudah_bisa);
    target.setiap = res.getString(R.string.activation_setiap);
    target.buat = res.getString(R.string.activation_buat);
  }

  @Override
  @CallSuper
  public void unbind() {
    DoneActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtNama = null;

    view7f090065.setOnClickListener(null);
    view7f090065 = null;
  }
}
