package me.jessyan.armscomponent.gank.mvp.presenter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.integration.AppManager;
import dagger.MembersInjector;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.gank.mvp.model.entity.GankItemBean;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GankHomePresenter_MembersInjector implements MembersInjector<GankHomePresenter> {
  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<AppManager> mAppManagerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<List<GankItemBean>> mDatasProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public GankHomePresenter_MembersInjector(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GankItemBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.mErrorHandlerProvider = mErrorHandlerProvider;
    this.mAppManagerProvider = mAppManagerProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.mDatasProvider = mDatasProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<GankHomePresenter> create(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<GankItemBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new GankHomePresenter_MembersInjector(
        mErrorHandlerProvider,
        mAppManagerProvider,
        mApplicationProvider,
        mDatasProvider,
        mAdapterProvider);
  }

  @Override
  public void injectMembers(GankHomePresenter instance) {
    injectMErrorHandler(instance, mErrorHandlerProvider.get());
    injectMAppManager(instance, mAppManagerProvider.get());
    injectMApplication(instance, mApplicationProvider.get());
    injectMDatas(instance, mDatasProvider.get());
    injectMAdapter(instance, mAdapterProvider.get());
  }

  public static void injectMErrorHandler(GankHomePresenter instance, RxErrorHandler mErrorHandler) {
    instance.mErrorHandler = mErrorHandler;
  }

  public static void injectMAppManager(GankHomePresenter instance, AppManager mAppManager) {
    instance.mAppManager = mAppManager;
  }

  public static void injectMApplication(GankHomePresenter instance, Application mApplication) {
    instance.mApplication = mApplication;
  }

  public static void injectMDatas(GankHomePresenter instance, List<GankItemBean> mDatas) {
    instance.mDatas = mDatas;
  }

  public static void injectMAdapter(GankHomePresenter instance, RecyclerView.Adapter mAdapter) {
    instance.mAdapter = mAdapter;
  }
}
