// components/business/instruct_modal/index.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    modalHidden: {
      type: Boolean,
      value: true
    }
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
    onSure() {
      this.triggerEvent('onSure')
    }
  }
})
