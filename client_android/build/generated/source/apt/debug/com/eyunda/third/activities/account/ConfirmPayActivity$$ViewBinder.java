// Generated code from Butter Knife. Do not modify!
package com.eyunda.third.activities.account;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ConfirmPayActivity$$ViewBinder<T extends com.eyunda.third.activities.account.ConfirmPayActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427921, "field 'orderNo'");
    target.orderNo = finder.castView(view, 2131427921, "field 'orderNo'");
    view = finder.findRequiredView(source, 2131427762, "field 'orderNum'");
    target.orderNum = finder.castView(view, 2131427762, "field 'orderNum'");
    view = finder.findRequiredView(source, 2131427923, "field 'orderDesc'");
    target.orderDesc = finder.castView(view, 2131427923, "field 'orderDesc'");
    view = finder.findRequiredView(source, 2131427926, "field 'payType'");
    target.payType = finder.castView(view, 2131427926, "field 'payType'");
    view = finder.findRequiredView(source, 2131427928, "field 'confirmPay' and method 'confirmPayClick'");
    target.confirmPay = finder.castView(view, 2131427928, "field 'confirmPay'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.confirmPayClick();
        }
      });
    view = finder.findRequiredView(source, 2131427927, "method 'changPayType'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.changPayType();
        }
      });
  }

  @Override public void unbind(T target) {
    target.orderNo = null;
    target.orderNum = null;
    target.orderDesc = null;
    target.payType = null;
    target.confirmPay = null;
  }
}
