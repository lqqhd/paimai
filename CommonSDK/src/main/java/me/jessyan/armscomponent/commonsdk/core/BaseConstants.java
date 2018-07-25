/*
 * Copyright 2018 JessYan
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.jessyan.armscomponent.commonsdk.core;

/**
 * ================================================
 * CommonSDK 的 Constants 可以定义公用的常量, 比如关于业务的常量或者正则表达式, 每个组件的 Constants 可以定义组件自己的私有常量
 * <p>
 * Created by JessYan on 30/03/2018 17:32
 * <a href="mailto:jess.yan.effort@gmail.com">Contact me</a>
 * <a href="https://github.com/JessYanCoding">Follow me</a>
 * ================================================
 */
public class BaseConstants {
    //电话号码正则
    public static final String TOKEN = "token";
    public static final String IS_LOGIN = "is_login"; //是否已经登录
    public static final String UID = "uid";
    public static final String USERNAME = "username";
    public static final String PASSWORD = "password";
    public static final boolean AUTO_LOGIN = true;
}
