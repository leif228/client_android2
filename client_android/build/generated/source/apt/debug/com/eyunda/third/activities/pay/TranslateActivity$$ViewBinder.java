// Generated code from Butter Knife. Do not modify!
package com.eyunda.third.activities.pay;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class TranslateActivity$$ViewBinder<T extends com.eyunda.third.activities.pay.TranslateActivity> implements ViewBinder<T> {
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
    view = finder.findRequiredView(source, 2131428021, "field 'cardNo'");
    target.cardNo = finder.castView(view, 2131428021, "field 'cardNo'");
    view = finder.findRequiredView(source, 2131427705, "field 'tansNum'");
    target.tansNum = finder.castView(view, 2131427705, "field 'tansNum'");
    view = finder.findRequiredView(source, 2131428024, "field 'bankId'");
    target.bankId = finder.castView(view, 2131428024, "field 'bankId'");
    view = finder.findRequiredView(source, 2131428023, "field 'bankName'");
    target.bankName = finder.castView(view, 2131428023, "field 'bankName'");
    view = finder.findRequiredView(source, 2131427448, "field 'userName'");
    target.userName = finder.castView(view, 2131427448, "field 'userName'");
    view = finder.findRequiredView(source, 2131427356, "field 'addEnd' and method 'selectBank'");
    target.addEnd = finder.castView(view, 2131427356, "field 'addEnd'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectBank(p0);
        }
      });
    view = finder.findRequiredView(source, 2131428022, "field 'selectBank' and method 'selectBank'");
    target.selectBank = finder.castView(view, 2131428022, "field 'selectBank'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.selectBank(p0);
        }
      });
    view = finder.findRequiredView(source, 2131428012, "field 'descript'");
    target.descript = finder.castView(view, 2131428012, "field 'descript'");
    view = finder.findRequiredView(source, 2131428026, "field 'chang' and method 'changBank'");
    target.chang = finder.castView(view, 2131428026, "field 'chang'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.changBank(p0);
        }
      });
    view = finder.findRequiredView(source, 2131428025, "field 'changBankName'");
    target.changBankName = finder.castView(view, 2131428025, "field 'changBankName'");
  }

  @Override public void unbind(T target) {
    target.btnSave = null;
    target.cardNo = null;
    target.tansNum = null;
    target.bankId = null;
    target.bankName = null;
    target.userName = null;
    target.addEnd = null;
    target.selectBank = null;
    target.descript = null;
    target.chang = null;
    target.changBankName = null;
  }
}
