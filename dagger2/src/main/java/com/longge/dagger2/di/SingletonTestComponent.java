package com.longge.dagger2.di;

import com.longge.dagger2.SingletonTestActivity;
import com.longge.dagger2.SingletonTestActivity1;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by suyunlong on 2016/10/27.
 */

@Component(modules = {DataModule.class})
@Singleton//这个Component的@Scope要和对应的Module的@Scope一致
public abstract class SingletonTestComponent {
    //@Component不仅可以注解接口也可以注解抽象类，为了方便测试单例，把Component改为抽象类，实际开发中可以在Application中创建单例。
    public abstract void inject(SingletonTestActivity singletonTestActivity);

    public abstract void inject(SingletonTestActivity1 singletonTestActivity1);

    private static SingletonTestComponent sComponent;

    public static SingletonTestComponent getInstance() {
        if (sComponent == null) {
            sComponent = DaggerSingletonTestComponent.builder().build();
        }
        return sComponent;
    }

}
