package com.bhex.wallet.market.adapter;

import android.view.View;

import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;

import com.bhex.tools.utils.ImageLoaderUtil;
import com.bhex.tools.utils.LogUtils;
import com.bhex.wallet.balance.helper.BHBalanceHelper;
import com.bhex.wallet.common.cache.CacheCenter;
import com.bhex.wallet.common.model.BHBalance;
import com.bhex.wallet.common.model.BHToken;
import com.bhex.wallet.common.model.BHTokenMapping;
import com.bhex.wallet.market.R;
import com.chad.library.adapter.base.BaseQuickAdapter;
import com.chad.library.adapter.base.viewholder.BaseViewHolder;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

/**
 * @author gongdongyang
 * 2020-10-10 17:04:36
 */
public class ChooseTokenAdapter extends BaseQuickAdapter<BHTokenMapping, BaseViewHolder> {
    private String mSymbol;

    public ChooseTokenAdapter( @Nullable List<BHTokenMapping> data,String symbol) {
        super(R.layout.item_choose_token, data);
        this.mSymbol = symbol;
    }

    @Override
    protected void convert(@NotNull BaseViewHolder holder, BHTokenMapping item) {
        holder.setText(R.id.tv_token_name,item.issue_symbol.toUpperCase());
        AppCompatImageView iv_token_icon = holder.getView(R.id.iv_token_icon);
        BHToken bhToken = CacheCenter.getInstance().getSymbolCache().getBHToken(item.issue_symbol.toLowerCase());

        int resId = BHBalanceHelper.getDefaultResId(item.issue_symbol);
        if(resId==0){
            ImageLoaderUtil.loadImageView(getContext(),
                    bhToken.logo, iv_token_icon, R.mipmap.ic_default_coin);
        }else{
            iv_token_icon.setImageResource(resId);
        }

        AppCompatTextView tv_token_amount = holder.getView(R.id.tv_token_amount);
        BHBalance balance = BHBalanceHelper.getBHBalanceFromAccount(item.issue_symbol.toLowerCase());

        String[]  res = BHBalanceHelper.getAmountToCurrencyValue(getContext(),balance.amount,item.issue_symbol.toLowerCase(),false);
        tv_token_amount.setText(res[0]);

        if(item.issue_symbol.equalsIgnoreCase(mSymbol)){
            holder.getView(R.id.ck_token).setVisibility(View.VISIBLE);
        }else{
            holder.getView(R.id.ck_token).setVisibility(View.INVISIBLE);
        }
    }


}
