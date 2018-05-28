package me.jessyan.armscomponent.zhihu.mvp.ui.activity;

import android.app.Dialog;
import com.jess.arms.base.BaseActivity_MembersInjector;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.presenter.DetailPresenter;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DetailActivity_MembersInjector implements MembersInjector<DetailActivity> {
  private final Provider<DetailPresenter> mPresenterProvider;

  private final Provider<Dialog> mDialogProvider;

  public DetailActivity_MembersInjector(
      Provider<DetailPresenter> mPresenterProvider, Provider<Dialog> mDialogProvider) {
    this.mPresenterProvider = mPresenterProvider;
    this.mDialogProvider = mDialogProvider;
  }

  public static MembersInjector<DetailActivity> create(
      Provider<DetailPresenter> mPresenterProvider, Provider<Dialog> mDialogProvider) {
    return new DetailActivity_MembersInjector(mPresenterProvider, mDialogProvider);
  }

  @Override
  public void injectMembers(DetailActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, mPresenterProvider.get());
    injectMDialog(instance, mDialogProvider.get());
  }

  public static void injectMDialog(DetailActivity instance, Dialog mDialog) {
    instance.mDialog = mDialog;
  }
}
