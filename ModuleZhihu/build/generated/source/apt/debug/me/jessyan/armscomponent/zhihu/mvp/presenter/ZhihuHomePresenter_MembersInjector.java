package me.jessyan.armscomponent.zhihu.mvp.presenter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.integration.AppManager;
import dagger.MembersInjector;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.model.entity.DailyListBean;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ZhihuHomePresenter_MembersInjector
    implements MembersInjector<ZhihuHomePresenter> {
  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<AppManager> mAppManagerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<List<DailyListBean.StoriesBean>> mDatasProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public ZhihuHomePresenter_MembersInjector(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<DailyListBean.StoriesBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.mErrorHandlerProvider = mErrorHandlerProvider;
    this.mAppManagerProvider = mAppManagerProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.mDatasProvider = mDatasProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  public static MembersInjector<ZhihuHomePresenter> create(
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<DailyListBean.StoriesBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new ZhihuHomePresenter_MembersInjector(
        mErrorHandlerProvider,
        mAppManagerProvider,
        mApplicationProvider,
        mDatasProvider,
        mAdapterProvider);
  }

  @Override
  public void injectMembers(ZhihuHomePresenter instance) {
    injectMErrorHandler(instance, mErrorHandlerProvider.get());
    injectMAppManager(instance, mAppManagerProvider.get());
    injectMApplication(instance, mApplicationProvider.get());
    injectMDatas(instance, mDatasProvider.get());
    injectMAdapter(instance, mAdapterProvider.get());
  }

  public static void injectMErrorHandler(
      ZhihuHomePresenter instance, RxErrorHandler mErrorHandler) {
    instance.mErrorHandler = mErrorHandler;
  }

  public static void injectMAppManager(ZhihuHomePresenter instance, AppManager mAppManager) {
    instance.mAppManager = mAppManager;
  }

  public static void injectMApplication(ZhihuHomePresenter instance, Application mApplication) {
    instance.mApplication = mApplication;
  }

  public static void injectMDatas(
      ZhihuHomePresenter instance, List<DailyListBean.StoriesBean> mDatas) {
    instance.mDatas = mDatas;
  }

  public static void injectMAdapter(ZhihuHomePresenter instance, RecyclerView.Adapter mAdapter) {
    instance.mAdapter = mAdapter;
  }
}
