package la.xiong.androidquick.demo.features.function.ui.databinding;

import android.os.Bundle;

import la.xiong.androidquick.demo.R;
import la.xiong.androidquick.demo.base.databinding.BaseTFragment;
import la.xiong.androidquick.demo.databinding.FragmentDatabindingBinding;
import la.xiong.androidquick.tool.ToastUtil;

/**
 * @author  ddnosh
 * @website http://blog.csdn.net/ddnosh
 */
public class DatabindingFragment extends BaseTFragment<FragmentDatabindingBinding> {

    @Override
    protected int getContentViewLayoutID() {
        return R.layout.fragment_databinding;
    }

    @Override
    protected void initViewsAndEvents(Bundle savedInstanceState) {
        getBinding().setAct(this);
        getBinding().tvDatabindingEmpty.setText("this is a databinding view");
    }

    public void onConfirmClick() {
        ToastUtil.showToast("clicked");
    }

}
