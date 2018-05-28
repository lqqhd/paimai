// Generated code from Butter Knife. Do not modify!
package me.jessyan.armscomponent.gank.mvp.ui.holder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.jessyan.armscomponent.gank.R;

public class GankHomeItemHolder_ViewBinding implements Unbinder {
  private GankHomeItemHolder target;

  @UiThread
  public GankHomeItemHolder_ViewBinding(GankHomeItemHolder target, View source) {
    this.target = target;

    target.mAvatar = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'mAvatar'", ImageView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    GankHomeItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAvatar = null;
  }
}
