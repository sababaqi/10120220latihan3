// Generated code from Butter Knife. Do not modify!
package com.example.a10120220latihan3;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.CallSuper;
import androidx.annotation.UiThread;

import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;

public class LoginCodeActivity_ViewBinding implements Unbinder {
  private LoginCodeActivity target;

  private View view7f090064;

  @UiThread
  public LoginCodeActivity_ViewBinding(LoginCodeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public LoginCodeActivity_ViewBinding(final LoginCodeActivity target, View source) {
    this.target = target;

    View view;
    target.txtAgree = Utils.findRequiredViewAsType(source, R.id.txtCheckCodeAgree, "field 'txtAgree'", TextView.class);
    target.edtInputCode = Utils.findRequiredViewAsType(source, R.id.edtInputCode, "field 'edtInputCode'", EditText.class);
    view = Utils.findRequiredView(source, R.id.btnCheckCode, "method 'masuk'");
    view7f090064 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.masuk(p0);
      }
    });

    Context context = source.getContext();
    Resources res = context.getResources();
    target.emptyTitle = res.getString(R.string.check_code_warning_empty_title);
    target.emptyMessage = res.getString(R.string.check_code_warning_empty_desc);
    target.warningTitle = res.getString(R.string.warning_title);
  }

  @Override
  @CallSuper
  public void unbind() {
    LoginCodeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.txtAgree = null;
    target.edtInputCode = null;

    view7f090064.setOnClickListener(null);
    view7f090064 = null;
  }
}
