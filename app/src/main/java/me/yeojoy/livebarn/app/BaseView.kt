package me.yeojoy.mtlhouse.app

interface BaseView<T> {
    fun setPresenter(presenter: T)
}