// components/business/schedule_match/index.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    modalHidden: {
      type: Boolean,
      value: true
    },
    imageUrl: {
      type: String,
      value: ''
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
    ToTry() {
      this.triggerEvent('ToTry');
    },
    onCancel() {
      this.triggerEvent('onCancel');
    }
  }
})
