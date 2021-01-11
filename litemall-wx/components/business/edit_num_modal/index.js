// components/business/edit_act_num_modal/index.js
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
    
  },

  /**
   * 组件的初始数据
   */
  data: {
    radioInvite: [
      { name: "成员放飞机", imgUrl: '/images/choose.png', imgUrlSel: '/images/choosesel.png', type:'bpromises', checked: true },
      { name: "活动演出人数改变", imgUrl: '/images/choose.png', imgUrlSel: '/images/choosesel.png', type: 'population', checked: false}
    ]
  },

  /**
   * 组件的方法列表
   */
  methods: {
    changeType(e) {
      // console.log(e);
      const { value } = e.detail;
      const { radioInvite } = this.data;
      var children = radioInvite.map((n)=> Object.assign({}, n, { checked: n.name === value })); 
      // console.log(children);
      this.setData({
        radioInvite: children
      })
    },
    onCancel() {
      this.triggerEvent('onClose')
    },
    changeInviteNum(e) {
      const { value } = e.detail;
      this.setData({
        humanNum: value
      })
    },
    onChange() {
      const { radioInvite, humanNum } = this.data;
      // app.utils.setStorage("radioInvite", radioInvite);
      var act_Invite = {};
      radioInvite.map((n) => {
        if (n.checked == true) {
          act_Invite.act_NumType = n.type;
          act_Invite.humanNum = humanNum;
        }
      })
      console.log(act_Invite);
      app.utils.setStorage('act_Invite', act_Invite);
      this.triggerEvent('onChangeNum', act_Invite);
    },
  }
})
