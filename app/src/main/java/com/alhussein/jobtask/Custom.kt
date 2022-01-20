package com.alhussein.jobtask

import com.flyco.tablayout.listener.CustomTabEntity

data class Custom(private var title: String) : CustomTabEntity {
    override fun getTabTitle(): String {
        return title;
    }

    override fun getTabSelectedIcon(): Int {
        return 0
    }

    override fun getTabUnselectedIcon(): Int {
        return 0

    }
}
