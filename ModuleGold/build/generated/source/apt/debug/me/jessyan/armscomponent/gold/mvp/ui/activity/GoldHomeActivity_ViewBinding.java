// Generated code from Butter Knife. Do not modify!
package me.jessyan.armscomponent.gold.mvp.ui.activity;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.jessyan.armscomponent.gold.R;

public class GoldHomeActivity_ViewBinding implements Unbinder {
  private GoldHomeActivity target;

  @UiThread
  public GoldHomeActivity_ViewBinding(GoldHomeActivity target) {
    this(target, target.getWindow().getDecorView());
  }

  @UiThread
  public GoldHomeActivity_ViewBinding(GoldHomeActivity target, View source) {
    this.target = target;

    target.mRecyclerView = Utils.findRequiredViewAsType(source, R.id.recyclerView, "field 'mRecyclerView'", RecyclerView.class);
    target.mSwipeRefreshLayout = Utils.findRequiredViewAsType(source, R.id.swipeRefreshLayout, "field 'mSwipeRefreshLayout'", SwipeRefreshLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GoldHomeActivity target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mRecyclerView = null;
    target.mSwipeRefreshLayout = null;
  }
}
