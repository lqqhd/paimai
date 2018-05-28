package me.jessyan.armscomponent.gank.di.component;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.jess.arms.base.BaseActivity_MembersInjector;
import com.jess.arms.di.component.AppComponent;
import com.jess.arms.integration.AppManager;
import com.jess.arms.integration.IRepositoryManager;
import dagger.internal.DoubleCheck;
import dagger.internal.InstanceFactory;
import dagger.internal.Preconditions;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gank.di.module.GankHomeModule_ProvideGankHomeAdapterFactory;
import me.jessyan.armscomponent.gank.di.module.GankHomeModule_ProvideLayoutManagerFactory;
import me.jessyan.armscomponent.gank.di.module.GankHomeModule_ProvideListFactory;
import me.jessyan.armscomponent.gank.mvp.contract.GankHomeContract;
import me.jessyan.armscomponent.gank.mvp.model.GankModel;
import me.jessyan.armscomponent.gank.mvp.model.GankModel_Factory;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankItemBean;
import me.jessyan.armscomponent.gank.mvp.presenter.GankHomePresenter;
import me.jessyan.armscomponent.gank.mvp.presenter.GankHomePresenter_Factory;
import me.jessyan.armscomponent.gank.mvp.ui.activity.GankHomeActivity;
import me.jessyan.armscomponent.gank.mvp.ui.activity.GankHomeActivity_MembersInjector;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerGankHomeComponent implements GankHomeComponent {
  private com_jess_arms_di_component_AppComponent_repositoryManager repositoryManagerProvider;

  private Provider<GankModel> gankModelProvider;

  private Provider<GankHomeContract.View> viewProvider;

  private com_jess_arms_di_component_AppComponent_rxErrorHandler rxErrorHandlerProvider;

  private com_jess_arms_di_component_AppComponent_appManager appManagerProvider;

  private com_jess_arms_di_component_AppComponent_application applicationProvider;

  private Provider<List<GankItemBean>> provideListProvider;

  private Provider<RecyclerView.Adapter> provideGankHomeAdapterProvider;

  private Provider<GankHomePresenter> gankHomePresenterProvider;

  private Provider<RecyclerView.LayoutManager> provideLayoutManagerProvider;

  private DaggerGankHomeComponent(Builder builder) {
    initialize(builder);
  }

  public static GankHomeComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.repositoryManagerProvider =
        new com_jess_arms_di_component_AppComponent_repositoryManager(builder.appComponent);
    this.gankModelProvider =
        DoubleCheck.provider(GankModel_Factory.create(repositoryManagerProvider));
    this.viewProvider = InstanceFactory.create(builder.view);
    this.rxErrorHandlerProvider =
        new com_jess_arms_di_component_AppComponent_rxErrorHandler(builder.appComponent);
    this.appManagerProvider =
        new com_jess_arms_di_component_AppComponent_appManager(builder.appComponent);
    this.applicationProvider =
        new com_jess_arms_di_component_AppComponent_application(builder.appComponent);
    this.provideListProvider = DoubleCheck.provider(GankHomeModule_ProvideListFactory.create());
    this.provideGankHomeAdapterProvider =
        DoubleCheck.provider(
            GankHomeModule_ProvideGankHomeAdapterFactory.create(provideListProvider));
    this.gankHomePresenterProvider =
        DoubleCheck.provider(
            GankHomePresenter_Factory.create(
                (Provider) gankModelProvider,
                viewProvider,
                rxErrorHandlerProvider,
                appManagerProvider,
                applicationProvider,
                provideListProvider,
                provideGankHomeAdapterProvider));
    this.provideLayoutManagerProvider =
        DoubleCheck.provider(GankHomeModule_ProvideLayoutManagerFactory.create(viewProvider));
  }

  @Override
  public void inject(GankHomeActivity activity) {
    injectGankHomeActivity(activity);
  }

  @CanIgnoreReturnValue
  private GankHomeActivity injectGankHomeActivity(GankHomeActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, gankHomePresenterProvider.get());
    GankHomeActivity_MembersInjector.injectMLayoutManager(
        instance, provideLayoutManagerProvider.get());
    GankHomeActivity_MembersInjector.injectMAdapter(instance, provideGankHomeAdapterProvider.get());
    return instance;
  }

  private static final class Builder implements GankHomeComponent.Builder {
    private AppComponent appComponent;

    private GankHomeContract.View view;

    @Override
    public GankHomeComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      if (view == null) {
        throw new IllegalStateException(
            GankHomeContract.View.class.getCanonicalName() + " must be set");
      }
      return new DaggerGankHomeComponent(this);
    }

    @Override
    public Builder view(GankHomeContract.View view) {
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
}
