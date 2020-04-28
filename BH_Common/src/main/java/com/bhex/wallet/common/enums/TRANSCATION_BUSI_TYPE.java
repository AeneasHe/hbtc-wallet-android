package com.bhex.wallet.common.enums;

import android.content.Context;

import com.bhex.wallet.common.R;


/**
 * Created by BHEX.
 * User: gdy
 * Date: 2020/4/18
 * Time: 16:28 hbtcchain/transfer/MsgDeposit
 * 交易类型
 *
 */
public enum TRANSCATION_BUSI_TYPE {
    转账("hbtcchain/transfer/MsgSend"),
    委托("hbtcchain/MsgDelegate"),
    取消委托("hbtcchain/MsgUndelegate"),
    跨链地址生成("hbtcchain/keygen/MsgKeyGen"),
    提取收益("hbtcchain/MsgWithdrawDelegationReward"),
    跨链充值("hbtcchain/transfer/MsgDeposit"),
    跨链提币("hbtcchain/transfer/MsgWithdrawal"),
    发起治理提案("hbtcchain/gov/MsgSubmitProposal"),
    治理提案质押("hbtcchain/gov/MsgDeposit"),
    治理提案投票("hbtcchain/gov/MsgVote"),
    Other("other");

    private String type;
    private String label;

    TRANSCATION_BUSI_TYPE(String type) {
        this.type = type;
    }

    TRANSCATION_BUSI_TYPE(String type, String label) {
        this.type = type;
        this.label = label;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public static void init(Context context){
        转账.label = context.getResources().getString(R.string.transfer);
        委托.label = context.getResources().getString(R.string.entrust);
        取消委托.label = context.getResources().getString(R.string.un_entrust);
        跨链地址生成.label = context.getResources().getString(R.string.crosslink_address);
        提取收益.label = context.getResources().getString(R.string.withdraw_reward);
        跨链充值.label = context.getResources().getString(R.string.cross_deposit);
        跨链提币.label = context.getResources().getString(R.string.cross_chian_trans_out);
        发起治理提案.label= context.getResources().getString(R.string.initiate_proposal);
        治理提案质押.label=context.getResources().getString(R.string.pledge_proposal);
        治理提案投票.label=context.getResources().getString(R.string.vote_proposal);
        Other.label = context.getResources().getString(R.string.other);
    }

    public static String getValue(String type) {
        TRANSCATION_BUSI_TYPE[] transcationBusiTypes = values();
        for (TRANSCATION_BUSI_TYPE item : transcationBusiTypes) {
            if (item.getType().equals(type)) {
                return item.label;
            }
        }
        return Other.label;
    }

}