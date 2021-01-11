// components/authLogin/authLogin.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    modalHidden: {
      type: Boolean,
      value: false
    },
  },

  /**
   * 组件的初始数据
   */
  data: {

  },

  /**
   * 组件的方法列表
   */
  methods: {
    hideModal() {
      this.setData({
        modalHidden:false
      })
    },
    onGotUserInfo(e) {
      this.triggerEvent("GotUserInfo", e);
    }
  }
})
