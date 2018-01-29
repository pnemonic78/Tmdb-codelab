package com.tikalk.mobileevent.mobileevent

interface BaseView<P: BasePresenter> {

    var presenter: P?

}