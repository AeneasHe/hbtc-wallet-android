package com.bhex.wallet.common.tx;

import com.google.gson.JsonObject;

import java.io.Serializable;
import java.util.List;

/**
 * Created by BHEX.
 * User: gdy
 * Date: 2020/4/10
 * Time: 15:42
 */
public class TransactionOrder implements Serializable {

    public TransactionOrder() {
    }

    /**
     * hash : A2BB12B074A23339D0C072551F7B96B1949882B89B2139B67A180ABC08A26E88
     * height : 369283
     * fee : 2 bht
     * success : true
     * error_message : null
     * activities : [{"type":"cosmos-sdk/MsgSend","value":{"amount":[{"amount":"9223372036854775807","denom":"bht"}],"from_address":"BHYc5BsYgne5SPNKYreBGpjYY9jyXAHLGbK","to_address":"BHj2wujKtAxw9XZMA7zDDvjGqKjoYUdw1FZ"}}]
     * time : 1586503293
     * gas_used : 42276
     * gas_wanted : 2000000
     * memo : test memo
     */



    private String hash;
    private int height;
    private String fee;
    private boolean success;
    private Object error_message;
    private long time;
    private int gas_used;
    private int gas_wanted;
    private String memo;
    private List<ActivitiesBean> activities;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getError_message() {
        return error_message;
    }

    public void setError_message(Object error_message) {
        this.error_message = error_message;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public int getGas_used() {
        return gas_used;
    }

    public void setGas_used(int gas_used) {
        this.gas_used = gas_used;
    }

    public int getGas_wanted() {
        return gas_wanted;
    }

    public void setGas_wanted(int gas_wanted) {
        this.gas_wanted = gas_wanted;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public List<ActivitiesBean> getActivities() {
        return activities;
    }

    public void setActivities(List<ActivitiesBean> activities) {
        this.activities = activities;
    }

    public static class ActivitiesBean {
        /**
         * type : cosmos-sdk/MsgSend
         * value : {"amount":[{"amount":"9223372036854775807","denom":"bht"}],"from_address":"BHYc5BsYgne5SPNKYreBGpjYY9jyXAHLGbK","to_address":"BHj2wujKtAxw9XZMA7zDDvjGqKjoYUdw1FZ"}
         */

        private String type;
        private JsonObject value;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public JsonObject getValue() {
            return value;
        }

        public void setValue(JsonObject value) {
            this.value = value;
        }

        public static class ValueBean {
            /**
             * amount : [{"amount":"9223372036854775807","denom":"bht"}]
             * from_address : BHYc5BsYgne5SPNKYreBGpjYY9jyXAHLGbK
             * to_address : BHj2wujKtAxw9XZMA7zDDvjGqKjoYUdw1FZ
             */

            private String from_address;
            private String to_address;
            private List<AmountBean> amount;

            public String getFrom_address() {
                return from_address;
            }

            public void setFrom_address(String from_address) {
                this.from_address = from_address;
            }

            public String getTo_address() {
                return to_address;
            }

            public void setTo_address(String to_address) {
                this.to_address = to_address;
            }

            public List<AmountBean> getAmount() {
                return amount;
            }

            public void setAmount(List<AmountBean> amount) {
                this.amount = amount;
            }

            public static class AmountBean {
                /**
                 * amount : 9223372036854775807
                 * denom : bht
                 */

                private String amount;
                private String denom;

                public String getAmount() {
                    return amount;
                }

                public void setAmount(String amount) {
                    this.amount = amount;
                }

                public String getDenom() {
                    return denom;
                }

                public void setDenom(String denom) {
                    this.denom = denom;
                }
            }
        }

        public static class AddressGenBean{
            public String From;
            public String To;
            public String OrderId;
            public String Symbol;
        }

        public static class WithdrawalBean{
            public String amount;
            public String from_cu;
            public String gas_fee;
            public String order_id;
            public String symbol;
            public String to_multi_sign_address;
        }

        public static class DepositBean{

            /**
             * amount : 500000000000000000
             * from_cu : HBCbV2tuSYE2WG6sHEaxteiZwHbfU559avFC
             * height : 7714737
             * index : 0
             * memo :
             * order_id : a4fe6a96-1221-42d0-bf23-562cdfc2ab0b
             * symbol : eth
             * to_adddress : 0x218da933EAe48436b228FB65E2A57cB92E20Dc25
             * to_cu : HBCYu3Xf77dvNqAceLQQSmtto3utEi4kBd4r
             * txhash : 0x065b2d9d1d2378a1aa1635ffb8ad2b62c952878cc29a2c7e32a7ac8639d73765
             */
            public String amount;
            public String from_cu;
            public String height;
            public int index;
            public String memo;
            public String order_id;
            public String symbol;
            public String to_adddress;
            public String to_cu;
            public String txhash;

        }
    }
}
