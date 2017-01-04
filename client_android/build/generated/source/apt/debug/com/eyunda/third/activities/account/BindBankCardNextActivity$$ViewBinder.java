// Generated code from Butter Knife. Do not modify!
package com.eyunda.third.activities.account;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class BindBankCardNextActivity$$ViewBinder<T extends com.eyunda.third.activities.account.BindBankCardNextActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427385, "field 'btnSave'");
    target.btnSave = finder.castView(view, 2131427385, "field 'btnSave'");
    view = finder.findRequiredView(source, 2131427743, "field 'btnClose' and method 'close'");
    target.btnClose = finder.castView(view, 2131427743, "field 'btnClose'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.close(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427712, "field 'btnSubmit' and method 'submit'");
    target.btnSubmit = finder.castView(view, 2131427712, "field 'btnSubmit'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.submit(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427705, "field 'tansNum'");
    target.tansNum = finder.castView(view, 2131427705, "field 'tansNum'");
    view = finder.findRequiredView(source, 2131427700, "field 'paypw'");
    target.paypw = finder.castView(view, 2131427700, "field 'paypw'");
    view = finder.findRequiredView(source, 2131427708, "field 'sm'");
    target.sm = finder.castView(view, 2131427708, "field 'sm'");
    view = finder.findRequiredView(source, 2131427741, "field 'mobile4'");
    target.mobile4 = finder.castView(view, 2131427741, "field 'mobile4'");
  }

  @Override public void unbind(T target) {
    target.btnSave = null;
    target.btnClose = null;
    target.btnSubmit = null;
    target.tansNum = null;
    target.paypw = null;
    target.sm = null;
    target.mobile4 = null;
  }
}
