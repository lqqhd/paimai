// Generated code from Butter Knife. Do not modify!
package me.jessyan.armscomponent.zhihu.mvp.ui.holder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;
import me.jessyan.armscomponent.zhihu.R;

public class ZhihuHomeItemHolder_ViewBinding implements Unbinder {
  private ZhihuHomeItemHolder target;

  @UiThread
  public ZhihuHomeItemHolder_ViewBinding(ZhihuHomeItemHolder target, View source) {
    this.target = target;

    target.mAvatar = Utils.findRequiredViewAsType(source, R.id.iv_avatar, "field 'mAvatar'", ImageView.class);
    target.mName = Utils.findRequiredViewAsType(source, R.id.tv_name, "field 'mName'", TextView.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    ZhihuHomeItemHolder target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");
    this.target = null;

    target.mAvatar = null;
    target.mName = null;
  }
}
