// components/business/passModal/index.js
Component({
  /**
   * 组件的属性列表
   */
  properties: {
    modalHidden: {
      type: Boolean,
      value:　true
    },
    imageUrl: {
      type: String,
      value: '加载中...'
    },
    explainText: {
      type: String,
      value: ''
    },
    actId: {
      type: Number,
      value: ''
    }
  },

  /**
   * 组件的初始数据
   */
  data: {
    // uploadCode: false
  },
  pageLifetimes: {
    show: function() {
      if(!!wx.getStorageSync('uploadCode')){
        this.setData({
          fileImg: `https://notice.g5378.com/realSync241?authKey=${wx.getStorageSync('authKey')}&id=${this.data.actId}`
        })
      }
    }
  },
  /**
   * 组件的方法列表
   */
  methods: {
    onbindUpdate() {
      var that = this;
      const { actId } = this.data;
      wx.chooseImage({
        count: 1,
        sizeType: ['original', 'compressed'],
        sourceType: ['album', 'camera'],
        success (res) {
          console.log(res);
          // tempFilePath可以作为img标签的src属性显示图片
          const tempFilePaths = res.tempFilePaths[0];
          // console.log(tempFilePaths);
          wx.uploadFile({
            url: `https://notice.g5378.com/realSync234?authKey=${wx.getStorageSync('authKey')}&id=${actId}`,
            filePath: tempFilePaths,
            name: 'file',
            header: {
              'content-type': 'multipart/form-data'
            },
            success(res){
              var data = JSON.parse(res.data);
              wx.setStorageSync('uploadCode', true)
              that.setData({
                fileImg: data.path
              })
            }
          })
        }
      })
    },
    onCancel() {
      this.triggerEvent('onClose')
    },
    onChange(e) {
      console.log(e);
      const { codeimg } = e.currentTarget.dataset;
      if(!!codeimg) {
        this.triggerEvent('onSure', codeimg);
      } else {
        wx.showToast({
          title: '请上传二维码',
          icon: 'none'
        })
      }
    }
  }
})
