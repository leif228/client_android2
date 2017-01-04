// Generated code from Butter Knife. Do not modify!
package com.eyunda.third.activities.cargo;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class AddCargoActivity$$ViewBinder<T extends com.eyunda.third.activities.cargo.AddCargoActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427350, "field 'ownerSpinner' and method 'onOwnerItemSelected'");
    target.ownerSpinner = finder.castView(view, 2131427350, "field 'ownerSpinner'");
    ((android.widget.AdapterView<?>) view).setOnItemSelectedListener(
      new android.widget.AdapterView.OnItemSelectedListener() {
        @Override public void onItemSelected(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          target.onOwnerItemSelected(p2);
        }
        @Override public void onNothingSelected(
          android.widget.AdapterView<?> p0
        ) {
          
        }
      });
    view = finder.findRequiredView(source, 2131427359, "field 'cargoCate' and method 'onCateItemSelected'");
    target.cargoCate = finder.castView(view, 2131427359, "field 'cargoCate'");
    ((android.widget.AdapterView<?>) view).setOnItemSelectedListener(
      new android.widget.AdapterView.OnItemSelectedListener() {
        @Override public void onItemSelected(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          target.onCateItemSelected(p2);
        }
        @Override public void onNothingSelected(
          android.widget.AdapterView<?> p0
        ) {
          
        }
      });
    view = finder.findRequiredView(source, 2131427352, "field 'startPort' and method 'startPort'");
    target.startPort = finder.castView(view, 2131427352, "field 'startPort'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.startPort(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427355, "field 'endPort' and method 'startPort'");
    target.endPort = finder.castView(view, 2131427355, "field 'endPort'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.startPort(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427362, "field 'cargoName'");
    target.cargoName = finder.castView(view, 2131427362, "field 'cargoName'");
    view = finder.findRequiredView(source, 2131427361, "field 'cargoNameTag'");
    target.cargoNameTag = finder.castView(view, 2131427361, "field 'cargoNameTag'");
    view = finder.findRequiredView(source, 2131427363, "field 'cargoWeightTag'");
    target.cargoWeightTag = finder.castView(view, 2131427363, "field 'cargoWeightTag'");
    view = finder.findRequiredView(source, 2131427365, "field 'cargoPriceTag'");
    target.cargoPriceTag = finder.castView(view, 2131427365, "field 'cargoPriceTag'");
    view = finder.findRequiredView(source, 2131427357, "field 'cargoLogo' and method 'cargoLogo'");
    target.cargoLogo = finder.castView(view, 2131427357, "field 'cargoLogo'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.cargoLogo(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427347, "field 'mContainer'");
    target.mContainer = finder.castView(view, 2131427347, "field 'mContainer'");
    view = finder.findRequiredView(source, 2131427364, "field 'cargoWeight'");
    target.cargoWeight = finder.castView(view, 2131427364, "field 'cargoWeight'");
    view = finder.findRequiredView(source, 2131427366, "field 'cargoPrice'");
    target.cargoPrice = finder.castView(view, 2131427366, "field 'cargoPrice'");
    view = finder.findRequiredView(source, 2131427380, "field 'totalPrice'");
    target.totalPrice = finder.castView(view, 2131427380, "field 'totalPrice'");
    view = finder.findRequiredView(source, 2131427381, "field 'priceDesc'");
    target.priceDesc = finder.castView(view, 2131427381, "field 'priceDesc'");
    view = finder.findRequiredView(source, 2131427360, "field 'containerBoxA'");
    target.containerBoxA = finder.castView(view, 2131427360, "field 'containerBoxA'");
    view = finder.findRequiredView(source, 2131427367, "field 'containerBoxB'");
    target.containerBoxB = finder.castView(view, 2131427367, "field 'containerBoxB'");
    view = finder.findRequiredView(source, 2131427369, "field 'price1'");
    target.price1 = finder.castView(view, 2131427369, "field 'price1'");
    view = finder.findRequiredView(source, 2131427371, "field 'price2'");
    target.price2 = finder.castView(view, 2131427371, "field 'price2'");
    view = finder.findRequiredView(source, 2131427373, "field 'price3'");
    target.price3 = finder.castView(view, 2131427373, "field 'price3'");
    view = finder.findRequiredView(source, 2131427375, "field 'price4'");
    target.price4 = finder.castView(view, 2131427375, "field 'price4'");
    view = finder.findRequiredView(source, 2131427377, "field 'price5'");
    target.price5 = finder.castView(view, 2131427377, "field 'price5'");
    view = finder.findRequiredView(source, 2131427379, "field 'price6'");
    target.price6 = finder.castView(view, 2131427379, "field 'price6'");
    view = finder.findRequiredView(source, 2131427378, "field 'tonTeu6'");
    target.tonTeu6 = finder.castView(view, 2131427378, "field 'tonTeu6'");
    view = finder.findRequiredView(source, 2131427376, "field 'tonTeu5'");
    target.tonTeu5 = finder.castView(view, 2131427376, "field 'tonTeu5'");
    view = finder.findRequiredView(source, 2131427374, "field 'tonTeu4'");
    target.tonTeu4 = finder.castView(view, 2131427374, "field 'tonTeu4'");
    view = finder.findRequiredView(source, 2131427372, "field 'tonTeu3'");
    target.tonTeu3 = finder.castView(view, 2131427372, "field 'tonTeu3'");
    view = finder.findRequiredView(source, 2131427370, "field 'tonTeu2'");
    target.tonTeu2 = finder.castView(view, 2131427370, "field 'tonTeu2'");
    view = finder.findRequiredView(source, 2131427368, "field 'tonTeu1'");
    target.tonTeu1 = finder.castView(view, 2131427368, "field 'tonTeu1'");
    view = finder.findRequiredView(source, 2131427382, "field 'pubStatus'");
    target.pubStatus = finder.castView(view, 2131427382, "field 'pubStatus'");
    view = finder.findRequiredView(source, 2131427383, "field 'privateCargo'");
    target.privateCargo = finder.castView(view, 2131427383, "field 'privateCargo'");
    view = finder.findRequiredView(source, 2131427384, "field 'publicCargo'");
    target.publicCargo = finder.castView(view, 2131427384, "field 'publicCargo'");
    view = finder.findRequiredView(source, 2131427356, "method 'addEnd'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.addEnd(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427353, "method 'addEnd'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.addEnd(p0);
        }
      });
    view = finder.findRequiredView(source, 2131427385, "method 'btnSave'");
    view.setOnClickListener(
      new butterknife.internal.DebouncingOnClickListener() {
        @Override public void doClick(
          android.view.View p0
        ) {
          target.btnSave(p0);
        }
      });
  }

  @Override public void unbind(T target) {
    target.ownerSpinner = null;
    target.cargoCate = null;
    target.startPort = null;
    target.endPort = null;
    target.cargoName = null;
    target.cargoNameTag = null;
    target.cargoWeightTag = null;
    target.cargoPriceTag = null;
    target.cargoLogo = null;
    target.mContainer = null;
    target.cargoWeight = null;
    target.cargoPrice = null;
    target.totalPrice = null;
    target.priceDesc = null;
    target.containerBoxA = null;
    target.containerBoxB = null;
    target.price1 = null;
    target.price2 = null;
    target.price3 = null;
    target.price4 = null;
    target.price5 = null;
    target.price6 = null;
    target.tonTeu6 = null;
    target.tonTeu5 = null;
    target.tonTeu4 = null;
    target.tonTeu3 = null;
    target.tonTeu2 = null;
    target.tonTeu1 = null;
    target.pubStatus = null;
    target.privateCargo = null;
    target.publicCargo = null;
  }
}
