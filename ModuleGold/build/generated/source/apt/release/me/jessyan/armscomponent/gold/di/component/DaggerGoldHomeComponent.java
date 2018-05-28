package me.jessyan.armscomponent.gold.di.component;

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
import me.jessyan.armscomponent.gold.di.module.GoldHomeModule_ProvideGoldHomeAdapterFactory;
import me.jessyan.armscomponent.gold.di.module.GoldHomeModule_ProvideLayoutManagerFactory;
import me.jessyan.armscomponent.gold.di.module.GoldHomeModule_ProvideListFactory;
import me.jessyan.armscomponent.gold.mvp.contract.GoldHomeContract;
import me.jessyan.armscomponent.gold.mvp.model.GoldModel;
import me.jessyan.armscomponent.gold.mvp.model.GoldModel_Factory;
import me.jessyan.armscomponent.gold.mvp.model.entity.GoldListBean;
import me.jessyan.armscomponent.gold.mvp.presenter.GoldHomePresenter;
import me.jessyan.armscomponent.gold.mvp.presenter.GoldHomePresenter_Factory;
import me.jessyan.armscomponent.gold.mvp.ui.activity.GoldHomeActivity;
import me.jessyan.armscomponent.gold.mvp.ui.activity.GoldHomeActivity_MembersInjector;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerGoldHomeComponent implements GoldHomeComponent {
  private com_jess_arms_di_component_AppComponent_repositoryManager repositoryManagerProvider;

  private Provider<GoldModel> goldModelProvider;

  private Provider<GoldHomeContract.View> viewProvider;

  private com_jess_arms_di_component_AppComponent_rxErrorHandler rxErrorHandlerProvider;

  private com_jess_arms_di_component_AppComponent_appManager appManagerProvider;

  private com_jess_arms_di_component_AppComponent_application applicationProvider;

  private Provider<List<GoldListBean>> provideListProvider;

  private Provider<RecyclerView.Adapter> provideGoldHomeAdapterProvider;

  private Provider<GoldHomePresenter> goldHomePresenterProvider;

  private Provider<RecyclerView.LayoutManager> provideLayoutManagerProvider;

  private DaggerGoldHomeComponent(Builder builder) {
    initialize(builder);
  }

  public static GoldHomeComponent.Builder builder() {
    return new Builder();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.repositoryManagerProvider =
        new com_jess_arms_di_component_AppComponent_repositoryManager(builder.appComponent);
    this.goldModelProvider =
        DoubleCheck.provider(GoldModel_Factory.create(repositoryManagerProvider));
    this.viewProvider = InstanceFactory.create(builder.view);
    this.rxErrorHandlerProvider =
        new com_jess_arms_di_component_AppComponent_rxErrorHandler(builder.appComponent);
    this.appManagerProvider =
        new com_jess_arms_di_component_AppComponent_appManager(builder.appComponent);
    this.applicationProvider =
        new com_jess_arms_di_component_AppComponent_application(builder.appComponent);
    this.provideListProvider = DoubleCheck.provider(GoldHomeModule_ProvideListFactory.create());
    this.provideGoldHomeAdapterProvider =
        DoubleCheck.provider(
            GoldHomeModule_ProvideGoldHomeAdapterFactory.create(viewProvider, provideListProvider));
    this.goldHomePresenterProvider =
        DoubleCheck.provider(
            GoldHomePresenter_Factory.create(
                (Provider) goldModelProvider,
                viewProvider,
                rxErrorHandlerProvider,
                appManagerProvider,
                applicationProvider,
                provideListProvider,
                provideGoldHomeAdapterProvider));
    this.provideLayoutManagerProvider =
        DoubleCheck.provider(GoldHomeModule_ProvideLayoutManagerFactory.create(viewProvider));
  }

  @Override
  public void inject(GoldHomeActivity activity) {
    injectGoldHomeActivity(activity);
  }

  @CanIgnoreReturnValue
  private GoldHomeActivity injectGoldHomeActivity(GoldHomeActivity instance) {
    BaseActivity_MembersInjector.injectMPresenter(instance, goldHomePresenterProvider.get());
    GoldHomeActivity_MembersInjector.injectMLayoutManager(
        instance, provideLayoutManagerProvider.get());
    GoldHomeActivity_MembersInjector.injectMAdapter(instance, provideGoldHomeAdapterProvider.get());
    return instance;
  }

  private static final class Builder implements GoldHomeComponent.Builder {
    private AppComponent appComponent;

    private GoldHomeContract.View view;

    @Override
    public GoldHomeComponent build() {
      if (appComponent == null) {
        throw new IllegalStateException(AppComponent.class.getCanonicalName() + " must be set");
      }
      if (view == null) {
        throw new IllegalStateException(
            GoldHomeContract.View.class.getCanonicalName() + " must be set");
      }
      return new DaggerGoldHomeComponent(this);
    }

    @Override
    public Builder view(GoldHomeContract.View view) {
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
