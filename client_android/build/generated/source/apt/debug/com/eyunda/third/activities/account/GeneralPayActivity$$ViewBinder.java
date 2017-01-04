// Generated code from Butter Knife. Do not modify!
package com.eyunda.third.activities.account;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class GeneralPayActivity$$ViewBinder<T extends com.eyunda.third.activities.account.GeneralPayActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427921, "field 'orderNo'");
    target.orderNo = finder.castView(view, 2131427921, "field 'orderNo'");
    view = finder.findRequiredView(source, 2131427762, "field 'orderNum'");
    target.orderNum = finder.castView(view, 2131427762, "field 'orderNum'");
    view = finder.findRequiredView(source, 2131427923, "field 'orderDesc'");
    target.orderDesc = finder.castView(view, 2131427923, "field 'orderDesc'");
    view = finder.findRequiredView(source, 2131427984, "field 'walletPay' and method 'walletPay'");
    target.walletPay = finder.castView(view, 2131427984, "field 'walletPay'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.walletPay();
        }
      });
    view = finder.findRequiredView(source, 2131427981, "field 'nonBandingPay' and method 'nonBandingPayClick'");
    target.nonBandingPay = finder.castView(view, 2131427981, "field 'nonBandingPay'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.nonBandingPayClick();
        }
      });
    view = finder.findRequiredView(source, 2131427982, "field 'bandingPay' and method 'bandingPayClick'");
    target.bandingPay = finder.castView(view, 2131427982, "field 'bandingPay'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.bandingPayClick();
        }
      });
    view = finder.findRequiredView(source, 2131427983, "field 'bandCardPay' and method 'bandCardPayClick'");
    target.bandCardPay = finder.castView(view, 2131427983, "field 'bandCardPay'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.bandCardPayClick();
        }
      });
  }

  @Override public void unbind(T target) {
    target.orderNo = null;
    target.orderNum = null;
    target.orderDesc = null;
    target.walletPay = null;
    target.nonBandingPay = null;
    target.bandingPay = null;
    target.bandCardPay = null;
  }
}
