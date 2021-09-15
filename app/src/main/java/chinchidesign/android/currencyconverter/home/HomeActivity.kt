package chinchidesign.android.currencyconverter.home

import android.os.Bundle
import chinchidesign.android.currencyconverter.R
import chinchidesign.android.currencyconverter.core.base.BaseActivity
import chinchidesign.android.currencyconverter.databinding.ActivityHomeBinding

class HomeActivity : BaseActivity<ActivityHomeBinding, HomeActivityViewModel>(
    HomeActivityViewModel(),
    viewBindingInflation = {
        ActivityHomeBinding.inflate(it)
    }
) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_home)


    }
}