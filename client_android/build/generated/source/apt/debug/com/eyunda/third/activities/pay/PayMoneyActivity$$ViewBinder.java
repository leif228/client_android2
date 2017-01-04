// Generated code from Butter Knife. Do not modify!
package com.eyunda.third.activities.pay;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class PayMoneyActivity$$ViewBinder<T extends com.eyunda.third.activities.pay.PayMoneyActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427439, "field 'sureDate'");
    target.sureDate = finder.castView(view, 2131427439, "field 'sureDate'");
    view = finder.findRequiredView(source, 2131428012, "field 'descript'");
    target.descript = finder.castView(view, 2131428012, "field 'descript'");
    view = finder.findRequiredView(source, 2131427385, "field 'btnSave' and method 'translate'");
    target.btnSave = finder.castView(view, 2131427385, "field 'btnSave'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.translate(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427705, "field 'tansNum'");
    target.tansNum = finder.castView(view, 2131427705, "field 'tansNum'");
    view = finder.findRequiredView(source, 2131428013, "field 'useSure' and method 'checkedChanged'");
    target.useSure = finder.castView(view, 2131428013, "field 'useSure'");
    ((android.widget.CompoundButton) view).setOnCheckedChangeListener(
      new android.widget.CompoundButton.OnCheckedChangeListener() {
        @Override public void onCheckedChanged(
          android.widget.CompoundButton p0,
          boolean p1
        ) {
          target.checkedChanged(p1);
        }
      });
    view = finder.findRequiredView(source, 2131428015, "field 'title_ll'");
    target.title_ll = finder.castView(view, 2131428015, "field 'title_ll'");
    view = finder.findRequiredView(source, 2131428016, "field 'title_ll_tv'");
    target.title_ll_tv = finder.castView(view, 2131428016, "field 'title_ll_tv'");
    view = finder.findRequiredView(source, 2131428019, "field 'receiveAccount'");
    target.receiveAccount = finder.castView(view, 2131428019, "field 'receiveAccount'");
    view = finder.findRequiredView(source, 2131428017, "field 'loginName'");
    target.loginName = finder.castView(view, 2131428017, "field 'loginName'");
  }

  @Override public void unbind(T target) {
    target.sureDate = null;
    target.descript = null;
    target.btnSave = null;
    target.tansNum = null;
    target.useSure = null;
    target.title_ll = null;
    target.title_ll_tv = null;
    target.receiveAccount = null;
    target.loginName = null;
  }
}
