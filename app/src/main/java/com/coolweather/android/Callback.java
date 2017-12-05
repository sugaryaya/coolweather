package com.coolweather.android;

import java.io.IOException;

/**
 * Created by 唐彩霞我 on 2017/12/5.
 */

abstract class Callback {
    public abstract void onResponse(Call call, Response response) throws IOException;

    public abstract void onFailure(Call call, IOException e);
}
