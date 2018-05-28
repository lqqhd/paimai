package me.jessyan.armscomponent.zhihu.di.component;

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
import me.jessyan.armscomponent.zhihu.di.module.ZhihuHomeModule_ProvideLayoutManagerFactory;
import me.jessyan.armscomponent.zhihu.di.module.ZhihuHomeModule_ProvideListFactory;
import me.jessyan.armscomponent.zhihu.di.module.ZhihuHomeModule_ProvideZhihuHomeAdapterFactory;
import me.jessyan.armscomponent.zhihu.mvp.contract.ZhihuHomeContract;
import me.jessyan.armscomponent.zhihu.mvp.model.ZhihuModel;
import me.jessyan.armscomponent.zhihu.mvp.model.ZhihuModel_Factory;
import me.jessyan.armscomponent.zhihu.mvp.model.entity.DailyListBean;
import me.jessyan.armscomponent.zhihu.mvp.presenter.ZhihuHomePresenter;
import me.jessyan.armscomponent.zhihu.mvp.presenter.ZhihuHomePresenter_Factory;
import me.jessyan.armscomponent.zhihu.mvp.ui.activity.ZhihuHomeActivity;
import me.jessyan.armscomponent.zhihu.mvp.ui.activity.ZhihuHomeActivity_MembersInjector;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerZhihuHomeComponent implements ZhihuHomeComponent {
  private com_jess_arms_di_component_AppComponent_repositoryManager repositoryManagerProvider;

  private Provider<ZhihuModel> zhihuModelProvider;

  private Provider<ZhihuHomeContract.View> viewProvider;

  private com_jess_arms_di_component_AppComponent_rxErrorHandler rxErrorHandlerProvider;

  private com_jess_arms_di_component_AppComponent_appManager appManagerProvider;

  private com_jess_arms_di_component_AppComponent_application applicationProvider;

  private Provider<List<DailyListBean.StoriesBean>> provideListProvider;

  private Provider<RecyclerView.Adapter> provideZhihuHomeAdapterProvider;

  private Provider<ZhihuHomePresenter> zhihuHomePresenterProvider;

  private Provider<RecyclerView.LayoutManager> provideLayoutManagerProvider;

  private DaggerZhihuHomeComponent(Builder builder) {
    initialize(builder);
  }

  public static ZhihuHomeComponent.Builder builder() {
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
    this.appManagerProvider =
        new com_jess_arms_di_component_AppComponent_appManager(builder.appComponent);
    this.applicationProvider =
        new com_jess_arms_di_component_AppComponent_application(builder.appComponent);
    this.provideListProvider = DoubleCheck.provider(ZhihuHomeModule_ProvideListFactory.create());
    this.provideZhihuHomeAdapterProvider =
        DoubleCheck.provider(
            ZhihuHomeModule_ProvideZhihuHomeAdapterFactory.create(
                viewProvider, provideListProvider));
    this.zhihuHomePresenterProvider =
        DoubleCheck.provider(
            ZhihuHomePresenter_Factory.create(
                (Provider) zhihuModelProvider,
                viewProvider,
                rxErrorHandlerProvider,
                appManagerProvider,
                applicationProvider,
                provideListProvider,
                provideZhihuHomeAdapterProvider));
    this.provideLayoutManagerProvider =
        DoubleCheck.provider(ZhihuHomeModule_ProvideLayoutManagerFactory.create(viewProvider));
  }

  @Override
  public void inject(ZhihuHomeActivity activity) {
    injectZhihuHomeActivity(activity);
  }

  @CanIgnoreReturnValue
  private ZhihuHomeActivity injectZhihuHomeActivity(ZhihuHomeActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, zhihuHomePresenterProvider.get());
    ZhihuHomeActivity_MembersInjector.injectMLayoutManager(
        instance, provideLayoutManagerProvider.get());
    ZhihuHomeActivity_MembersInjector.injectMAdapter(
        instance, provideZhihuHomeAdapterProvider.get());
    return instance;
  }

  private static final class Builder implements ZhihuHomeComponent.Builder {
    private AppComponent appComponent;

    private ZhihuHomeContract.View view;

    @Override
    public ZhihuHomeComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      if (view == null) {
        throw new IllegalStateException(
            ZhihuHomeContract.View.class.getCanonicalName() + " must be set");
      }
      return new DaggerZhihuHomeComponent(this);
    }

    @Override
    public Builder view(ZhihuHomeContract.View view) {
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
