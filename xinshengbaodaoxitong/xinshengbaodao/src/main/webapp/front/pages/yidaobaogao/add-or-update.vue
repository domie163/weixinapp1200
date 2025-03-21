<template>
	<view class="content">
		<form class="app-update-pv">
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#47EDB5","textAlign":"left"}' class="title">
					专业确认</view>
				<picker @change="zhuanyeTypesChange" :value="zhuanyeTypesIndex" :range="zhuanyeTypesOptions"
					range-key="indexName">
					<view
						:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#47EDB5","borderRadius":"0px","color":"#47EDB5","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
						class="uni-input">{{ruleForm.zhuanyeTypes?ruleForm.zhuanyeValue:"请选择专业确认"}}</view>
				</picker>
			</view>
			<view
				:style='{"boxShadow":"0","backgroundColor":"rgba(255, 255, 255, 0.25)","borderColor":"rgba(228, 232, 230, 1)","margin":"0 0 0px 0","borderWidth":"2rpx","borderStyle":"none none solid none ","height":"88rpx"}'
				class="cu-form-group">
				<view :style='{"width":"160rpx","fontSize":"28rpx","color":"#47EDB5","textAlign":"left"}' class="title">
					身份信息</view>
				<input disabled
					:style='{"boxShadow":"0 0 0px rgba(0,0,0,.6) inset","backgroundColor":"rgba(255, 255, 255, 1)","borderColor":"#47EDB5","borderRadius":"0px","color":"#47EDB5","textAlign":"left","borderWidth":"0 0 6rpx","fontSize":"24rpx","borderStyle":"solid","height":"88rpx","marginTop":"7rpx"}'
					:disabled="ro.yidaobaogaoPaizhao" type="text" v-model="ruleForm.yidaobaogaoPaizhao"
					placeholder="身份信息"></input>
			</view>

			<view class="btn">
				<button
					:style='{"boxShadow":"0 0 16rpx rgba(0,0,0,0) inset","backgroundColor":"#47EDB5","borderColor":"#409EFF","borderRadius":"8rpx","color":"rgba(255, 255, 255, 1)","borderWidth":"0","width":"70%","fontSize":"32rpx","borderStyle":"solid","height":"80rpx"}'
					@tap="onSubmitTap" class="bg-red">提交</button>
			</view>
		</form>

		<w-picker mode="dateTime" step="1" :current="false" :hasSecond="false" @confirm="createTimeConfirm"
			ref="createTime" themeColor="#333333"></w-picker>


	</view>
</template>

<script>
	import wPicker from "@/components/w-picker/w-picker.vue";

	export default {
		data() {
			return {
				cross: '',
				ro: {
					yonghuId: false,
					zhuanyeTypes: false,
					yidaobaogaoPaizhao: false,
					yidaobaogaoYesnoTypes: false,
					yidaobaogaoYesnoText: false,
					createTime: false,
				},
				ruleForm: {
					yonghuId: '',
					zhuanyeTypes: '', //数字
					zhuanyeValue: '', //数字对应的值
					yidaobaogaoPaizhao: '',
					yidaobaogaoYesnoTypes: '1', //数字
					yidaobaogaoYesnoValue: '', //数字对应的值
					yidaobaogaoYesnoText: '',
					createTime: '',
				},
				// 登陆用户信息
				user: {},
				zhuanyeTypesOptions: [],
				zhuanyeTypesIndex: 0,
				yidaobaogaoYesnoTypesOptions: [],
				yidaobaogaoYesnoTypesIndex: 0,

			}
		},
		components: {
			wPicker
		},
		computed: {
			baseUrl() {
				return this.$base.url;
			},
		},
		async onLoad(options) {

			/*下拉框*/
			let zhuanyeTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'zhuanye_types',
			}
			let zhuanyeTypes = await this.$api.page(`dictionary`, zhuanyeTypesParams);
			this.zhuanyeTypesOptions = zhuanyeTypes.data.list
			/*下拉框*/
			let yidaobaogaoYesnoTypesParams = {
				page: 1,
				limit: 100,
				dicCode: 'yidaobaogao_yesno_types',
			}
			let yidaobaogaoYesnoTypes = await this.$api.page(`dictionary`, yidaobaogaoYesnoTypesParams);
			this.yidaobaogaoYesnoTypesOptions = yidaobaogaoYesnoTypes.data.list


			// 如果是更新操作
			if (options.id) {
				this.ruleForm.id = options.id;
				// 获取信息
				let res = await this.$api.info(`yidaobaogao`, this.ruleForm.id);
				this.ruleForm = res.data;
			}
			if (options.yidaobaogaoId) {
				this.ruleForm.yidaobaogaoId = options.yidaobaogaoId;
			}
			// 跨表
			// this.styleChange()
		},
		methods: {
			// 下拉变化
			zhuanyeTypesChange(e) {
				this.zhuanyeTypesIndex = e.target.value
				this.ruleForm.zhuanyeValue = this.zhuanyeTypesOptions[this.zhuanyeTypesIndex].indexName
				this.ruleForm.zhuanyeTypes = this.zhuanyeTypesOptions[this.zhuanyeTypesIndex].codeIndex
			},
			yidaobaogaoYesnoTypesChange(e) {
				this.yidaobaogaoYesnoTypesIndex = e.target.value
				this.ruleForm.yidaobaogaoYesnoValue = this.yidaobaogaoYesnoTypesOptions[this.yidaobaogaoYesnoTypesIndex]
					.indexName
				this.ruleForm.yidaobaogaoYesnoTypes = this.yidaobaogaoYesnoTypesOptions[this.yidaobaogaoYesnoTypesIndex]
					.codeIndex
			},


			// styleChange() {
			// 	this.$nextTick(() => {
			// 		// document.querySelectorAll('.app-update-pv .cu-form-group .uni-yaoxianStyle-yaoxianStyle').forEach(el=>{
			// 		//   el.style.backgroundColor = this.addUpdateForm.yaoxianStyle.content.backgroundColor
			// 		// })
			// 	})
			// },


			// 日期控件
			createTimeConfirm(val) {
				console.log(val)
				this.ruleForm.createTime = val.result;
				this.$forceUpdate();
			},




			getUUID() {
				return new Date().getTime();
			},
			async onSubmitTap() {
				if ((!this.ruleForm.zhuanyeTypes)) {
					this.$utils.msg(`专业确认不能为空`);
					return
				}
				if ((!this.ruleForm.yidaobaogaoPaizhao)) {
					this.$utils.msg(`身份信息不能为空`);
					return
				}
				if (this.ruleForm.id) {
					await this.$api.update(`yidaobaogao`, this.ruleForm);
				} else {
					await this.$api.save(`yidaobaogao`, this.ruleForm);
				}
				uni.setStorageSync('pingluenStateState', true);
				this.$utils.msgBack('提交成功');
			},
			getDate(type) {
				const date = new Date();
				let year = date.getFullYear();
				let month = date.getMonth() + 1;
				let day = date.getDate();
				if (type === 'start') {
					year = year - 60;
				} else if (type === 'end') {
					year = year + 2;
				}
				month = month > 9 ? month : '0' + month;;
				day = day > 9 ? day : '0' + day;
				return `${year}-${month}-${day}`;
			},
			toggleTab(str) {
				this.$refs[str].show();
			}
		}
	}
</script>

<style lang="scss" scoped>
	.container {
		padding: 20upx;
	}

	.content:after {
		position: fixed;
		top: 0;
		right: 0;
		left: 0;
		bottom: 0;
		content: '';
		background-attachment: fixed;
		background-size: cover;
		background-position: center;
	}

	textarea {
		border: 1upx solid #EEEEEE;
		border-radius: 20upx;
		padding: 20upx;
	}

	.title {
		width: 180upx;
	}

	.avator {
		width: 150upx;
		height: 60upx;
	}

	.right-input {
		flex: 1;
		text-align: left;
		padding: 0 24upx;
	}

	.cu-form-group.active {
		justify-content: space-between;
	}

	.btn {
		display: flex;
		align-items: center;
		justify-content: center;
		flex-wrap: wrap;
		padding: 20upx 0;
	}

	.cu-form-group {
		padding: 0 24upx;
		background-color: transparent;
		min-height: inherit;
	}

	.cu-form-group+.cu-form-group {
		border: 0;
	}

	.cu-form-group uni-input {
		padding: 0 30upx;
	}

	.uni-input {
		padding: 0 30upx;
	}

	.cu-form-group uni-textarea {
		padding: 30upx;
		margin: 0;
	}

	.cu-form-group uni-picker::after {
		line-height: 68rpx;
	}

	.select .uni-input {
		line-height: 68rpx;
	}

	.input .right-input {
		line-height: 68rpx;
	}
</style>
