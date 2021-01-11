// components/DancesItem/DancesIltem.js
const app = getApp();
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    modalHidden: {
      type: Boolean,
      value: true
    },
    actDances: {
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
    * 筛选栏内多项选择触发 change 事件
    * @param {Object} e 事件对象
    */
    onCheckboxChange(e) {
      const { value } = e.detail;
      const { index, item } = e.currentTarget.dataset;
        const children = item.children.map((n) =>
            Object.assign({}, n,{
              checked: value.includes(n.name)
        }))
        const selected = children.filter((n) => n.checked).map((n) => n.name).join(',');
        this.setData({
          [`actDances[${index}].children`]: children,
          [`actDances[${index}].selected`]: selected,
        })
    },
    /**
     * 提交
     * @param {Object} e 
     */
    onConfirm(e) {
      const { actDances } = this.data;
      app.utils.setStorage("actDances", actDances);
      // console.log(actDances)
      var act_dancesId = []
      // var act_dance = [];

      for(let i=0;i<actDances.length;i++) {
        actDances[i].children.map((n)=>{
          if(n.checked == true) {
            act_dancesId.push(n.id);
            // act_dance.push(n.name);
          }
        })
      }
      // app.utils.setStorage("act_dance", act_dance);
      app.utils.setStorage("act_dancesId", act_dancesId);
      this.triggerEvent('onConfirm', act_dancesId);
    },
    onReset(e) {
      this.triggerEvent('onClose')
    }
  }
})
