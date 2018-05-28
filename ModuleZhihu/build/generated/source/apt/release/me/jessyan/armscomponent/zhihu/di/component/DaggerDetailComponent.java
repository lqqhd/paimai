package me.jessyan.armscomponent.zhihu.di.component;

import android.app.Application;
import android.app.Dialog;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.jess.arms.base.BaseActivity_MembersInjector;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.http.imageloader.ImageLoader;
import com.jess.arms.integration.AppManager;
import com.jess.arms.integration.IRepositoryManager;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.di.module.DetailModule_ProvideDialogFactory;
import me.jessyan.armscomponent.zhihu.mvp.contract.DetailContract;
import me.jessyan.armscomponent.zhihu.mvp.model.ZhihuModel;
import me.jessyan.armscomponent.zhihu.mvp.model.ZhihuModel_Factory;
import me.jessyan.armscomponent.zhihu.mvp.presenter.DetailPresenter;
import me.jessyan.armscomponent.zhihu.mvp.presenter.DetailPresenter_Factory;
import me.jessyan.armscomponent.zhihu.mvp.ui.activity.DetailActivity;
import me.jessyan.armscomponent.zhihu.mvp.ui.activity.DetailActivity_MembersInjector;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerDetailComponent implements DetailComponent {
  private com_jess_arms_di_component_AppComponent_repositoryManager repositoryManagerProvider;

  private Provider<ZhihuModel> zhihuModelProvider;

  private Provider<DetailContract.View> viewProvider;

  private com_jess_arms_di_component_AppComponent_rxErrorHandler rxErrorHandlerProvider;

  private com_jess_arms_di_component_AppComponent_application applicationProvider;

  private com_jess_arms_di_component_AppComponent_imageLoader imageLoaderProvider;

  private com_jess_arms_di_component_AppComponent_appManager appManagerProvider;

  private Provider<DetailPresenter> detailPresenterProvider;

  private Provider<Dialog> provideDialogProvider;

  private DaggerDetailComponent(Builder builder) {
    initialize(builder);
  }

  public static DetailComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.repositoryManagerProvider =
        new com_jess_arms_di_component_AppComponent_repositoryManager(builder.appComponent);
    this.zhihuModelProvider =
        DoubleCheck.provider(ZhihuModel_Factory.create(repositoryManagerProvider));
    this.viewProvider = InstanceFactory.create(builder.view);
    this.rxErrorHandlerProvider =
        new com_jess_arms_di_component_AppComponent_rxErrorHandler(builder.appComponent);
    this.applicationProvider =
        new com_jess_arms_di_component_AppComponent_application(builder.appComponent);
    this.imageLoaderProvider =
        new com_jess_arms_di_component_AppComponent_imageLoader(builder.appComponent);
    this.appManagerProvider =
        new com_jess_arms_di_component_AppComponent_appManager(builder.appComponent);
    this.detailPresenterProvider =
        DoubleCheck.provider(
            DetailPresenter_Factory.create(
                (Provider) zhihuModelProvider,
                viewProvider,
                rxErrorHandlerProvider,
                applicationProvider,
                imageLoaderProvider,
                appManagerProvider));
    this.provideDialogProvider =
        DoubleCheck.provider(DetailModule_ProvideDialogFactory.create(viewProvider));
  }

  @Override
  public void inject(DetailActivity activity) {
    injectDetailActivity(activity);
  }

  @CanIgnoreReturnValue
  private DetailActivity injectDetailActivity(DetailActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, detailPresenterProvider.get());
    DetailActivity_MembersInjector.injectMDialog(instance, provideDialogProvider.get());
    return instance;
  }

  private static final class Builder implements DetailComponent.Builder {
    private AppComponent appComponent;

    private DetailContract.View view;

    @Override
    public DetailComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      if (view == null) {
        throw new IllegalStateException(
            DetailContract.View.class.getCanonicalName() + " must be set");
      }
      return new DaggerDetailComponent(this);
    }

    @Override
    public Builder view(DetailContract.View view) {
      this.view = Preconditions.checkNotNull(view);
      return this;
    }

    @Override
    public Builder appComponent(AppComponent appComponent) {
      this.appComponent = Preconditions.checkNotNull(appComponent);
      return this;
    }
  }

  private static class com_jess_arms_di_component_AppComponent_repositoryManager
      implements Provider<IRepositoryManager> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_repositoryManager(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public IRepositoryManager get() {
      return Preconditions.checkNotNull(
          appComponent.repositoryManager(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_rxErrorHandler
      implements Provider<RxErrorHandler> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_rxErrorHandler(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public RxErrorHandler get() {
      return Preconditions.checkNotNull(
          appComponent.rxErrorHandler(),
          "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_application
      implements Provider<Application> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_application(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public Application get() {
      return Preconditions.checkNotNull(
          appComponent.application(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_imageLoader
      implements Provider<ImageLoader> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_imageLoader(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public ImageLoader get() {
      return Preconditions.checkNotNull(
          appComponent.imageLoader(), "Cannot return null from a non-@Nullable component method");
    }
  }

  private static class com_jess_arms_di_component_AppComponent_appManager
      implements Provider<AppManager> {
    private final AppComponent appComponent;

    com_jess_arms_di_component_AppComponent_appManager(AppComponent appComponent) {
      this.appComponent = appComponent;
    }

    @Override
    public AppManager get() {
      return Preconditions.checkNotNull(
          appComponent.appManager(), "Cannot return null from a non-@Nullable component method");
    }
  }
}
