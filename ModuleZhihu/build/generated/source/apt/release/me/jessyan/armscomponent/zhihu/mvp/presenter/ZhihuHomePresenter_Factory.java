package me.jessyan.armscomponent.zhihu.mvp.presenter;

import android.app.Application;
import android.support.v7.widget.RecyclerView;
import com.jess.arms.integration.AppManager;
import dagger.internal.Factory;
import java.util.List;
import javax.annotation.Generated;
import javax.inject.Provider;
import me.jessyan.armscomponent.zhihu.mvp.contract.ZhihuHomeContract;
import me.jessyan.armscomponent.zhihu.mvp.model.entity.DailyListBean;
import me.jessyan.rxerrorhandler.core.RxErrorHandler;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ZhihuHomePresenter_Factory implements Factory<ZhihuHomePresenter> {
  private final Provider<ZhihuHomeContract.Model> modelProvider;

  private final Provider<ZhihuHomeContract.View> rootViewProvider;

  private final Provider<RxErrorHandler> mErrorHandlerProvider;

  private final Provider<AppManager> mAppManagerProvider;

  private final Provider<Application> mApplicationProvider;

  private final Provider<List<DailyListBean.StoriesBean>> mDatasProvider;

  private final Provider<RecyclerView.Adapter> mAdapterProvider;

  public ZhihuHomePresenter_Factory(
      Provider<ZhihuHomeContract.Model> modelProvider,
      Provider<ZhihuHomeContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<DailyListBean.StoriesBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    this.modelProvider = modelProvider;
    this.rootViewProvider = rootViewProvider;
    this.mErrorHandlerProvider = mErrorHandlerProvider;
    this.mAppManagerProvider = mAppManagerProvider;
    this.mApplicationProvider = mApplicationProvider;
    this.mDatasProvider = mDatasProvider;
    this.mAdapterProvider = mAdapterProvider;
  }

  @Override
  public ZhihuHomePresenter get() {
    ZhihuHomePresenter instance =
        new ZhihuHomePresenter(modelProvider.get(), rootViewProvider.get());
    ZhihuHomePresenter_MembersInjector.injectMErrorHandler(instance, mErrorHandlerProvider.get());
    ZhihuHomePresenter_MembersInjector.injectMAppManager(instance, mAppManagerProvider.get());
    ZhihuHomePresenter_MembersInjector.injectMApplication(instance, mApplicationProvider.get());
    ZhihuHomePresenter_MembersInjector.injectMDatas(instance, mDatasProvider.get());
    ZhihuHomePresenter_MembersInjector.injectMAdapter(instance, mAdapterProvider.get());
    return instance;
  }

  public static ZhihuHomePresenter_Factory create(
      Provider<ZhihuHomeContract.Model> modelProvider,
      Provider<ZhihuHomeContract.View> rootViewProvider,
      Provider<RxErrorHandler> mErrorHandlerProvider,
      Provider<AppManager> mAppManagerProvider,
      Provider<Application> mApplicationProvider,
      Provider<List<DailyListBean.StoriesBean>> mDatasProvider,
      Provider<RecyclerView.Adapter> mAdapterProvider) {
    return new ZhihuHomePresenter_Factory(
        modelProvider,
        rootViewProvider,
        mErrorHandlerProvider,
        mAppManagerProvider,
        mApplicationProvider,
        mDatasProvider,
        mAdapterProvider);
  }

  public static ZhihuHomePresenter newZhihuHomePresenter(
      ZhihuHomeContract.Model model, ZhihuHomeContract.View rootView) {
    return new ZhihuHomePresenter(model, rootView);
  }
}
