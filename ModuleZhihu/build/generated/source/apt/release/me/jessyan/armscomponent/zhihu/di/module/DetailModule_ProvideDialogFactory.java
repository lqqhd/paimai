package me.jessyan.armscomponent.zhihu.di.module;

import android.app.Dialog;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.contract.DetailContract;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailModule_ProvideDialogFactory implements Factory<Dialog> {
  private final Provider<DetailContract.View> viewProvider;

  public DetailModule_ProvideDialogFactory(Provider<DetailContract.View> viewProvider) {
    this.viewProvider = viewProvider;
  }

  @Override
  public Dialog get() {
    return Preconditions.checkNotNull(
        DetailModule.provideDialog(viewProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static DetailModule_ProvideDialogFactory create(
      Provider<DetailContract.View> viewProvider) {
    return new DetailModule_ProvideDialogFactory(viewProvider);
  }

  public static Dialog proxyProvideDialog(DetailContract.View view) {
    return Preconditions.checkNotNull(
        DetailModule.provideDialog(view),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
