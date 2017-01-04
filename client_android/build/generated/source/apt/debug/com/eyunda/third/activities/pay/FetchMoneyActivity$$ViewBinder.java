// Generated code from Butter Knife. Do not modify!
package com.eyunda.third.activities.pay;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class FetchMoneyActivity$$ViewBinder<T extends com.eyunda.third.activities.pay.FetchMoneyActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
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
    view = finder.findRequiredView(source, 2131427439, "field 'sureDate'");
    target.sureDate = finder.castView(view, 2131427439, "field 'sureDate'");
    view = finder.findRequiredView(source, 2131428014, "field 'twoDCode'");
    target.twoDCode = finder.castView(view, 2131428014, "field 'twoDCode'");
    view = finder.findRequiredView(source, 2131428012, "field 'descript'");
    target.descript = finder.castView(view, 2131428012, "field 'descript'");
    view = finder.findRequiredView(source, 2131427742, "field 'twoDCodeContainer'");
    target.twoDCodeContainer = finder.castView(view, 2131427742, "field 'twoDCodeContainer'");
    view = finder.findRequiredView(source, 2131428013, "field 'useSure'");
    target.useSure = finder.castView(view, 2131428013, "field 'useSure'");
  }

  @Override public void unbind(T target) {
    target.btnSave = null;
    target.tansNum = null;
    target.sureDate = null;
    target.twoDCode = null;
    target.descript = null;
    target.twoDCodeContainer = null;
    target.useSure = null;
  }
}
