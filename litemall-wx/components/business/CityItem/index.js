// components/CityItem/index.js
const app = getApp();
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    modalHidden: {
      type:Boolean,
      value: true
    },
    actCity: {
      type: Array,
      value: []
    },
    title: {
      type: String,
      value: '',
    },
    windowHeight: {
      type: Number,
      value: 0
    },
    currentCity: {
      type: String,
      value: ''
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
    /**
    * 筛选栏内单项选择触发 change 事件
    * @param {Object} e 事件对象
    */
    onRadioChange(e) {
      // console.log(e);
      const { value } = e.detail;
      
      const children = this.data.actCity.map((n) => Object.assign({}, n, {
          checked: n.city === value,
      }))
      this.setData({
        actCity: children
      })
    },
    /**
     * 提交
     * @param {Object} e 
     */
    onConfirm(e) {
      const { actCity } = this.data;
      app.utils.setStorage("actCity", actCity);
      // console.log(actCity)
      // var act_city = []
      var act_city = "";
      actCity.map((n) => {
        if (n.checked == true) {
          act_city = n.city
        }
      })
      app.utils.setStorage("act_city", act_city);
      this.triggerEvent('onConfirm', act_city);
    },
    onReset(e) {
      this.triggerEvent('onClose');
    }
  }
})
