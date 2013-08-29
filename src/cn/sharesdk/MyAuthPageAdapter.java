package cn.sharesdk;

import cn.sharesdk.framework.authorize.AuthorizeAdapter;

public class MyAuthPageAdapter extends AuthorizeAdapter {
    public void onCreate() {
        hideShareSDKLogo();
        disablePopUpAnimation();
    }
}
