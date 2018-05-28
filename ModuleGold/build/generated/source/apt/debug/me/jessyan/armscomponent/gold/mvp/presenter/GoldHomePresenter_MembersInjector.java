package me.jessyan.armscomponent.gold.mvp.presenter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.integration.AppManager;
import dagger.MembersInjector;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gold.mvp.model.entity.GoldListBean;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GoldHomePresenter_MembersInjector implements MembersInjector<GoldHomePresenter> {
  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<AppManager> mAppManagerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<List<GoldListBean>> mDatasProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public GoldHomePresenter_MembersInjector(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GoldListBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.mErrorHandlerProvider = mErrorHandlerProvider;
    this.mAppManagerProvider = mAppManagerProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.mDatasProvider = mDatasProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<GoldHomePresenter> create(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GoldListBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new GoldHomePresenter_MembersInjector(
        mErrorHandlerProvider,
        mAppManagerProvider,
        mApplicationProvider,
        mDatasProvider,
        mAdapterProvider);
  }

  @Override
  public void injectMembers(GoldHomePresenter instance) {
    injectMErrorHandler(instance, mErrorHandlerProvider.get());
    injectMAppManager(instance, mAppManagerProvider.get());
    injectMApplication(instance, mApplicationProvider.get());
    injectMDatas(instance, mDatasProvider.get());
    injectMAdapter(instance, mAdapterProvider.get());
  }

  public static void injectMErrorHandler(GoldHomePresenter instance, RxErrorHandler mErrorHandler) {
    instance.mErrorHandler = mErrorHandler;
  }

  public static void injectMAppManager(GoldHomePresenter instance, AppManager mAppManager) {
    instance.mAppManager = mAppManager;
  }

  public static void injectMApplication(GoldHomePresenter instance, Application mApplication) {
    instance.mApplication = mApplication;
  }

  public static void injectMDatas(GoldHomePresenter instance, List<GoldListBean> mDatas) {
    instance.mDatas = mDatas;
  }

  public static void injectMAdapter(GoldHomePresenter instance, RecyclerView.Adapter mAdapter) {
    instance.mAdapter = mAdapter;
  }
}
