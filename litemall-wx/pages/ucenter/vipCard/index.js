var util = require('../../../utils/util.js');
var api = require('../../../config/api.js');
var app = getApp()

Page({

  /**
   * 页面的初始数据
   */
  data: {
    issueList: [],
    page: 1,
    limit: 10,
    count: 0,
    showPage: false
  },

  /**
   * 生命周期函数--监听页面加载
   */
  onLoad: function (options) {
    this.getIssue();
  },

  /**
   * 生命周期函数--监听页面初次渲染完成
   */
  onReady: function () {

  },

  /**
   * 生命周期函数--监听页面显示
   */
  onShow: function () {

  },
  submitOrder: function() {
        util.request(api.OrderSubmit, {
            cardId: 1
        }, 'GET').then(res => {
            if (res.errno === 0) {

            const orderId = res.data.orderId;
            util.request(api.OrderPrepay, {
                orderId: orderId
            }, 'POST').then(function(res) {
                if (res.errno === 0) {
                    const payParam = res.data;
                    console.log("支付过程开始");
                    wx.requestPayment({
                        'timeStamp': payParam.timeStamp,
                        'nonceStr': payParam.nonceStr,
                        'package': payParam.packageValue,
                        'signType': payParam.signType,
                        'paySign': payParam.paySign,
                        'success': function(res) {
                            console.log("支付过程成功");
                            if (grouponLinkId) {
                                setTimeout(() => {
                                    wx.redirectTo({
                                    url: '/pages/groupon/grouponDetail/grouponDetail?id=' + grouponLinkId
                                })
                            }, 1000);
                            } else {
                                wx.redirectTo({
                                    url: '/pages/payResult/payResult?status=1&orderId=' + orderId
                                });
                            }
                        },
                        'fail': function(res) {
                            console.log("支付过程失败");
                            wx.redirectTo({
                                url: '/pages/payResult/payResult?status=0&orderId=' + orderId
                            });
                        },
                        'complete': function(res) {
                            console.log("支付过程结束")
                        }
                    });
                } else {
                    wx.redirectTo({
                        url: '/pages/payResult/payResult?status=0&orderId=' + orderId
                    });
                }
            });

        } else {
            util.showErrorToast(res.errmsg);
        }
    });
    },

  /**
   * 生命周期函数--监听页面隐藏
   */
  onHide: function () {

  },

  /**
   * 生命周期函数--监听页面卸载
   */
  onUnload: function () {

  },

  /**
   * 页面相关事件处理函数--监听用户下拉动作
   */
  onPullDownRefresh: function () {

  },

  /**
   * 页面上拉触底事件的处理函数
   */
  onReachBottom: function () {

  },

  /**
   * 用户点击右上角分享
   */
  onShareAppMessage: function () {

  },
  nextPage: function (event) {
    var that = this;
    if (this.data.page > that.data.count / that.data.limit) {
      return true;
    }

    that.setData({
      page: that.data.page + 1
    });

    this.getIssue();

  },
  getIssue: function () {

    let that = this;
    that.setData({
      showPage: false,
      issueList: []
    });

    util.request(api.IssueList, {
      page: that.data.page,
      limit: that.data.limit
    }).then(function (res) {
      if (res.errno === 0) {

        that.setData({
          issueList: res.data.list,
          showPage: true,
          count: res.data.total
        });
      }
    });

  },
  prevPage: function (event) {
    if (this.data.page <= 1) {
      return false;
    }

    var that = this;
    that.setData({
      page: that.data.page - 1
    });
    this.getIssue();
  }
})