package chinchidesign.android.currencyconverter.core.base

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding
import bogdandonduk.appbartoolboxandroidlib.appbar.AppBarHandler
import bogdandonduk.uilanguagestoolboxlib.UILanguageHandler
import bogdandonduk.uithemestoolboxlib.UIThemesHandler
import bogdandonduk.uithemestoolboxlib.bulkconfiguration.UIThemesBulkConfiguratorHandler
import bogdandonduk.viewdatabindingwrapperslib.BaseViewBindingHandlerActivity
import bogdandonduk.viewmodelwrapperslib.automatic.SingleAutomaticInitializationWithInitializationViewModelHandlerActivity

abstract class BaseActivity<ViewBindingType : ViewBinding, ViewModelType : ViewModel>(
    viewBindingInflation: (layoutInflater: LayoutInflater) -> ViewBindingType,
    override var viewModelInitialization: (intent: Intent) -> ViewModelType
) : BaseViewBindingHandlerActivity<ViewBindingType>(
    viewBindingInflation
), SingleAutomaticInitializationWithInitializationViewModelHandlerActivity<ViewModelType>,
    UIThemesHandler,
    UILanguageHandler,
    UIThemesBulkConfiguratorHandler,
    AppBarHandler {



    constructor(
        viewModelNewInstance: ViewModelType,
        viewBindingInflation: (layoutInflater: LayoutInflater) -> ViewBindingType,
    ) : this(
        viewBindingInflation,
        { viewModelNewInstance }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = viewBindingInflation.invoke(layoutInflater)
    }
}