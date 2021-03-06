/*
 * Java bean class for entity table IMP_RESULT 
 * Created on 19 6�� 2018 ( Date ISO 2018-06-19 - Time 10:28:37 )
 * Generated by Telosys Tools Generator ( version 2.1.1 )
 */

package www.uffda.kr.vo;

import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Entity bean for table "IMP_RESULT"
 * 
 * @author Telosys Tools Generator
 *
 */
public class ImpResult extends Paging implements Serializable, Comparable<ImpResult> 
{
	private final static Logger logger = LoggerFactory.getLogger(ImpResult.class.getSimpleName());
	public static final String MERCHANT_ID = "broccoli_97620";
	public static final String imp_key = "5896210574097620";
	
	public static final String CARD_PAID = "card";
	public static final String VBANK_PAID = "vbank";
	public static final String TRANS_PAID = "trans";
	public static final String PHONE_PAID = "phone";
	public static final String SAMSUNG_PAID = "samsung";
	
	public static final String CARD_PAID_TXT = "카드결제";
	public static final String VBANK_PAID_TXT = "무통장입금";
	public static final String TRANS_PAID_TXT = "계좌이체";
	public static final String PHONE_PAID_TXT = "휴대폰소액결제";
	public static final String SAMSUNG_PAID_TXT = "삼성페이";	
	
	public static final String STATUS_READY = "ready";
	public static final String STATUS_PAID = "paid";
	public static final String STATUS_CANCELLED = "cancelled";
	public static final String STATUS_FAILED = "failed";
	
	public static final String [] PAY_STATUS = {STATUS_READY, STATUS_PAID, STATUS_CANCELLED, STATUS_FAILED};
	public static final String [] PAY_METHODS = {CARD_PAID, VBANK_PAID, TRANS_PAID, PHONE_PAID, SAMSUNG_PAID};
	public static final String [] PAY_METHODS_TXT = {CARD_PAID_TXT, VBANK_PAID_TXT, TRANS_PAID_TXT, PHONE_PAID_TXT, SAMSUNG_PAID_TXT};
	
    private static final long serialVersionUID = 1L;

    private final static String applyNumKey 		= "apply_num";
    private final static String bankNameKey 		= "bank_name";
    private final static String buyerAddrKey		= "buyer_addr";
    private final static String buyerEmailKey		= "buyer_email";
    private final static String buyerNameKey		= "buyer_name";
    private final static String buyerPostcodeKey	= "buyer_postcode";
    private final static String buyerTelKey			= "buyer_tel";
    private final static String cardNameKey			= "card_name";
    private final static String cardQuotaKey		= "card_quota";
    private final static String currencyKey			= "currency";
    private final static String customDataKey		= "custom_data";
    private final static String impUidKey			= "imp_uid";
    private final static String merchantUidKey		= "merchant_uid";
    private final static String nameKey				= "name";
    private final static String paidAmountKey		= "paid_amount";
    private final static String paidAtKey			= "paid_at";
    private final static String cancelledAtKey		= "cancelled_at";
    private final static String failedAtKey			= "failed_at";
    
    private final static String payMethodKey		= "pay_method";
    private final static String pgProviderKey 		= "pg_provider";
    private final static String pgTidKey			= "pg_tid";
    private final static String pgTypeKey			= "pg_type";
    private final static String receiptUrlKey		= "receipt_url";
    private final static String statusKey			= "status";
    private final static String amountKey			= "amount";
    private final static String vBankDateKey		= "vbank_date";
    private final static String channelKey			= "channel";
    private final static String pgIdKey				= "pg_id";
    private final static String escrowKey			= "escrow";
    private final static String bankCodeKey			= "bank_code";
    private final static String cardCodeKey			= "card_code";
    private final static String vbankCodeKey		= "vbank_code";
    private final static String vbankNameKey		= "vbank_name";
    private final static String vbankNumKey			= "vbank_num";
    private final static String vbankHolderKey		= "vbank_holder";
    private final static String vbankDateKey		= "vbank_date";
    private final static String vbankIssuedAtKey	= "vbank_issued_at";
    private final static String cancelAmountKey		= "cancel_amount";
    private final static String	failReasonKey		= "fail_reason";
    private final static String	cancelReasonKey		= "cancel_reason";
    private final static String	createdKey			= "created";
    private final static String	impSuccessKey		= "imp_success";
    private final static String	successKey			= "success";
    private final static String	errorMsgKey			= "error_msg";
    private final static String couponKey			= "coupon";
    
    private int        id           ; // Primary Key

    private int			userId		;
    private String     applyNum     ;
    private String     bankName     ;
    private String     buyerAddr    ;
    private String     buyerEmail   ;
    private String     buyerName    ;
    private String     buyerPostcode ;
    private String     buyerTel     ;
    private String     cardName     ;
    private int        cardQuota    ;
    private String     currency     ;
    private String     customData   ;
    private String     impUid       ;
    private String     merchantUid  ;
    private String     name         ;
    private int        paidAmount   ;
    private int        paidAt       ;
    private int        failedAt     ;
    private int        cancelledAt  ;
    private int			vBankDate	;
    private String     payMethod    ;
    private String     pgProvider   ;
    private String     pgTid        ;
    private String     pgType       ;
    private String     receiptUrl   ;
    private String     status       ;
    private int			amount		;
    private String		channel		;
    private String 		pgId		;
    private boolean		escrow		;
    private String		bankCode	;
    private String		cardCode	;
    private String		vBankCode	;
    private String		vBankName	;
    private String		vBankNum	;
    private String		vBankHolder	;
    private int			cancelAmount;
    private String		failReason	;
    private String		cancelReason;
    private String		created		;
    private List<Cart>  cartList	;
    private int			recipeId	;
    private long		trace		;
    private int			impStatus	;
    private boolean		imp_success	;
    private String		error_msg	;
    private int			cartListSize;
    private int			cartListSizeTue;
    private int			cartListSizeFri;
    private LocalDate	searchDateStart;
    private LocalDate	searchDateFinish;
    private String		start;
    private String		finish;
    private String		coupon;
    private String		payMethodView;
    private String		reason;			// 취소사유
    private String		refund_account; // 환불계좌 계좌번호
    private String		refund_bank;	// 환불계좌 은행코드
    private String		refund_holder;	// 환불계좌 예금주
    public static Map<Integer, String> statusMap;
    /**
     * Default constructor
     */
    public ImpResult()
    {
    	cartList = new ArrayList<Cart>();
    	setStatusMap();
    }
    public static ImpResult newInstance() {
    	ImpResult result = new ImpResult();
    	return result;
    }
    public static ImpResult newInstance(int userId) {
    	ImpResult result = new ImpResult();
    	result.setUserId(userId);
    	return result;
    }
    private void setStatusMap() {
    	statusMap = new HashMap<Integer, String>();
    	statusMap.put(1, "입금대기");
    	statusMap.put(2, "결제완료");
    	statusMap.put(3, "주문취소");
    	statusMap.put(4, "상품 준비 중");
    	statusMap.put(5, "배송 준비 중");
    	statusMap.put(6, "배송 중");
    	statusMap.put(7, "배송 완료");
    	statusMap.put(8, "환불 진행 중");
    	statusMap.put(9, "환불 완료");
    	statusMap.put(12, "구매 확정");
    }
    public static String[] getPayMethods() {
		return PAY_METHODS;
	}
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	//----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR THE PRIMARY KEY 
    //----------------------------------------------------------------------
    /**
     * Set the "id" field value
     * This field is mapped on the database column "id" ( type "INT", NotNull : true ) 
     * @param id
     */
	public void setId( int id )
    {
        this.id = id ;
    }
    /**
     * Get the "id" field value
     * This field is mapped on the database column "id" ( type "INT", NotNull : true ) 
     * @return the field value
     */
	public int getId()
    {
        return this.id;
    }

    //----------------------------------------------------------------------
    // GETTER(S) & SETTER(S) FOR DATA FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : apply_num ( INT ) 
    /**
     * Set the "applyNum" field value
     * This field is mapped on the database column "apply_num" ( type "VARCHAR", NotNull : false ) 
     * @param applyNum
     */
    public void setApplyNum( String applyNum )
    {
        this.applyNum = applyNum;
    }
    /**
     * Get the "applyNum" field value
     * This field is mapped on the database column "apply_num" ( type "INT", NotNull : false ) 
     * @return the field value
     */
    public String getApplyNum()
    {
        return this.applyNum;
    }

    //--- DATABASE MAPPING : bank_name ( VARCHAR ) 
    /**
     * Set the "bankName" field value
     * This field is mapped on the database column "bank_name" ( type "VARCHAR", NotNull : false ) 
     * @param bankName
     */
    public void setBankName( String bankName )
    {
        this.bankName = bankName;
    }
    /**
     * Get the "bankName" field value
     * This field is mapped on the database column "bank_name" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getBankName()
    {
        return this.bankName;
    }

    //--- DATABASE MAPPING : buyer_addr ( VARCHAR ) 
    /**
     * Set the "buyerAddr" field value
     * This field is mapped on the database column "buyer_addr" ( type "VARCHAR", NotNull : false ) 
     * @param buyerAddr
     */
    public void setBuyerAddr( String buyerAddr )
    {
        this.buyerAddr = buyerAddr;
    }
    /**
     * Get the "buyerAddr" field value
     * This field is mapped on the database column "buyer_addr" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getBuyerAddr()
    {
        return this.buyerAddr;
    }

    //--- DATABASE MAPPING : buyer_email ( VARCHAR ) 
    /**
     * Set the "buyerEmail" field value
     * This field is mapped on the database column "buyer_email" ( type "VARCHAR", NotNull : false ) 
     * @param buyerEmail
     */
    public void setBuyerEmail( String buyerEmail )
    {
        this.buyerEmail = buyerEmail;
    }
    /**
     * Get the "buyerEmail" field value
     * This field is mapped on the database column "buyer_email" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getBuyerEmail()
    {
        return this.buyerEmail;
    }

    //--- DATABASE MAPPING : buyer_name ( VARCHAR ) 
    /**
     * Set the "buyerName" field value
     * This field is mapped on the database column "buyer_name" ( type "VARCHAR", NotNull : false ) 
     * @param buyerName
     */
    public void setBuyerName( String buyerName )
    {
        this.buyerName = buyerName;
    }
    /**
     * Get the "buyerName" field value
     * This field is mapped on the database column "buyer_name" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getBuyerName()
    {
        return this.buyerName;
    }

    //--- DATABASE MAPPING : buyer_postcode ( VARCHAR ) 
    /**
     * Set the "buyerPostcode" field value
     * This field is mapped on the database column "buyer_postcode" ( type "VARCHAR", NotNull : false ) 
     * @param buyerPostcode
     */
    public void setBuyerPostcode( String buyerPostcode )
    {
        this.buyerPostcode = buyerPostcode;
    }
    /**
     * Get the "buyerPostcode" field value
     * This field is mapped on the database column "buyer_postcode" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getBuyerPostcode()
    {
        return this.buyerPostcode;
    }

    //--- DATABASE MAPPING : buyer_tel ( VARCHAR ) 
    /**
     * Set the "buyerTel" field value
     * This field is mapped on the database column "buyer_tel" ( type "VARCHAR", NotNull : false ) 
     * @param buyerTel
     */
    public void setBuyerTel( String buyerTel )
    {
        this.buyerTel = buyerTel;
    }
    /**
     * Get the "buyerTel" field value
     * This field is mapped on the database column "buyer_tel" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getBuyerTel()
    {
        return this.buyerTel;
    }

    //--- DATABASE MAPPING : card_name ( VARCHAR ) 
    /**
     * Set the "cardName" field value
     * This field is mapped on the database column "card_name" ( type "VARCHAR", NotNull : false ) 
     * @param cardName
     */
    public void setCardName( String cardName )
    {
        this.cardName = cardName;
    }
    /**
     * Get the "cardName" field value
     * This field is mapped on the database column "card_name" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getCardName()
    {
        return this.cardName;
    }

    //--- DATABASE MAPPING : card_quota ( INT ) 
    /**
     * Set the "cardQuota" field value
     * This field is mapped on the database column "card_quota" ( type "INT", NotNull : false ) 
     * @param cardQuota
     */
    public void setCardQuota( int cardQuota )
    {
        this.cardQuota = cardQuota;
    }
    /**
     * Get the "cardQuota" field value
     * This field is mapped on the database column "card_quota" ( type "INT", NotNull : false ) 
     * @return the field value
     */
    public int getCardQuota()
    {
        return this.cardQuota;
    }

    //--- DATABASE MAPPING : currency ( VARCHAR ) 
    /**
     * Set the "currency" field value
     * This field is mapped on the database column "currency" ( type "VARCHAR", NotNull : false ) 
     * @param currency
     */
    public void setCurrency( String currency )
    {
        this.currency = currency;
    }
    /**
     * Get the "currency" field value
     * This field is mapped on the database column "currency" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getCurrency()
    {
        return this.currency;
    }

    //--- DATABASE MAPPING : custom_data ( VARCHAR ) 
    /**
     * Set the "customData" field value
     * This field is mapped on the database column "custom_data" ( type "VARCHAR", NotNull : false ) 
     * @param customData
     */
    public void setCustomData(String customData )
    {
        this.customData = customData;
        this.cartList = new ArrayList<Cart>();
        JSONObject root = new JSONObject();
        try {
        	root = new JSONObject(this.customData);
        }catch(JSONException e) {
        	try {
        		String decoded = URLDecoder.decode(this.customData, "UTF-8");
        		if(decoded.charAt(0) == '\"') {
        			decoded = decoded.substring(1, decoded.length()-1);
        		}
				root = new JSONObject(decoded);
			} catch (JSONException e1) {
				e1.printStackTrace();
			} catch (UnsupportedEncodingException e2) {
				e2.printStackTrace();
			}
        }
        
        JSONArray array = root.getJSONArray("list");
        for(int i=0; i<array.length(); i++) {
        	JSONObject item = array.getJSONObject(i);
        	Cart cart = Cart.parse(item);
        	if(cart.getWeekday() == Cart.WEEK_TUE) {
        		this.cartListSizeTue ++;
        	}else if(cart.getWeekday() == Cart.WEEK_FRI) {
        		this.cartListSizeFri ++;
        	}
        	this.cartList.add(cart);
        }
        
        if(root.has("coupon")) {
	        final String coupon = root.getString("coupon");
	        this.coupon = coupon;
        }
    }
    /**
     * Get the "customData" field value
     * This field is mapped on the database column "custom_data" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getCustomData()
    {
        return this.customData;
    }

    //--- DATABASE MAPPING : imp_uid ( VARCHAR ) 
    /**
     * Set the "impUid" field value
     * This field is mapped on the database column "imp_uid" ( type "VARCHAR", NotNull : false ) 
     * @param impUid
     */
    public void setImpUid( String impUid )
    {
        this.impUid = impUid;
    }
    /**
     * Get the "impUid" field value
     * This field is mapped on the database column "imp_uid" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getImpUid()
    {
        return this.impUid;
    }

    //--- DATABASE MAPPING : merchant_uid ( VARCHAR ) 
    /**
     * Set the "merchantUid" field value
     * This field is mapped on the database column "merchant_uid" ( type "VARCHAR", NotNull : false ) 
     * @param merchantUid
     */
    public void setMerchantUid( String merchantUid )
    {
        this.merchantUid = merchantUid;
    }
    /**
     * Get the "merchantUid" field value
     * This field is mapped on the database column "merchant_uid" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getMerchantUid()
    {
        return this.merchantUid;
    }

    //--- DATABASE MAPPING : name ( VARCHAR ) 
    /**
     * Set the "name" field value
     * This field is mapped on the database column "name" ( type "VARCHAR", NotNull : false ) 
     * @param name
     */
    public void setName( String name )
    {
        this.name = name;
    }
    /**
     * Get the "name" field value
     * This field is mapped on the database column "name" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getName()
    {
        return this.name;
    }

    //--- DATABASE MAPPING : paid_amount ( INT ) 
    /**
     * Set the "paidAmount" field value
     * This field is mapped on the database column "paid_amount" ( type "INT", NotNull : false ) 
     * @param paidAmount
     */
    public void setPaidAmount( int paidAmount )
    {
        this.paidAmount = paidAmount;
    }
    /**
     * Get the "paidAmount" field value
     * This field is mapped on the database column "paid_amount" ( type "INT", NotNull : false ) 
     * @return the field value
     */
    public int getPaidAmount()
    {
        return this.paidAmount;
    }

    //--- DATABASE MAPPING : oaid_at ( INT ) 
    /**
     * Set the "paidAt" field value
     * This field is mapped on the database column "oaid_at" ( type "INT", NotNull : false ) 
     * @param paidAt
     */
    public void setPaidAt( int paidAt )
    {
        this.paidAt = paidAt;
    }
    /**
     * Get the "paidAt" field value
     * This field is mapped on the database column "paid_at" ( type "INT", NotNull : false ) 
     * @return the field value
     */
    public int getPaidAt()
    {
        return this.paidAt;
    }
    
    public int getFailedAt() {
		return failedAt;
	}

	public void setFailedAt(int failedAt) {
		this.failedAt = failedAt;
	}

	public int getCancelledAt() {
		return cancelledAt;
	}

	public void setCancelledAt(int cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	//--- DATABASE MAPPING : pay_method ( VARCHAR ) 
    /**
     * Set the "payMethod" field value
     * This field is mapped on the database column "pay_method" ( type "VARCHAR", NotNull : false ) 
     * @param payMethod
     */
    public void setPayMethod( String payMethod )
    {
        this.payMethod = payMethod;
    }
    /**
     * Get the "payMethod" field value
     * This field is mapped on the database column "pay_method" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getPayMethod()
    {
        return this.payMethod;
    }

    //--- DATABASE MAPPING : pg_provider ( VARCHAR ) 
    /**
     * Set the "pgProvider" field value
     * This field is mapped on the database column "pg_provider" ( type "VARCHAR", NotNull : false ) 
     * @param pgProvider
     */
    public void setPgProvider( String pgProvider )
    {
        this.pgProvider = pgProvider;
    }
    /**
     * Get the "pgProvider" field value
     * This field is mapped on the database column "pg_provider" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getPgProvider()
    {
        return this.pgProvider;
    }

    //--- DATABASE MAPPING : pg_tid ( VARCHAR ) 
    /**
     * Set the "pgTid" field value
     * This field is mapped on the database column "pg_tid" ( type "VARCHAR", NotNull : false ) 
     * @param pgTid
     */
    public void setPgTid( String pgTid )
    {
        this.pgTid = pgTid;
    }
    /**
     * Get the "pgTid" field value
     * This field is mapped on the database column "pg_tid" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getPgTid()
    {
        return this.pgTid;
    }

    //--- DATABASE MAPPING : pg_type ( VARCHAR ) 
    /**
     * Set the "pgType" field value
     * This field is mapped on the database column "pg_type" ( type "VARCHAR", NotNull : false ) 
     * @param pgType
     */
    public void setPgType( String pgType )
    {
        this.pgType = pgType;
    }
    /**
     * Get the "pgType" field value
     * This field is mapped on the database column "pg_type" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getPgType()
    {
        return this.pgType;
    }

    //--- DATABASE MAPPING : receipt_url ( VARCHAR ) 
    /**
     * Set the "receiptUrl" field value
     * This field is mapped on the database column "receipt_url" ( type "VARCHAR", NotNull : false ) 
     * @param receiptUrl
     */
    public void setReceiptUrl( String receiptUrl )
    {
        this.receiptUrl = receiptUrl;
    }
    /**
     * Get the "receiptUrl" field value
     * This field is mapped on the database column "receipt_url" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getReceiptUrl()
    {
        return this.receiptUrl;
    }

    //--- DATABASE MAPPING : status ( VARCHAR ) 
    /**
     * Set the "status" field value
     * This field is mapped on the database column "status" ( type "VARCHAR", NotNull : false ) 
     * @param status
     */
    public void setStatus( String status )
    {
        this.status = status;
    }
    /**
     * Get the "status" field value
     * This field is mapped on the database column "status" ( type "VARCHAR", NotNull : false ) 
     * @return the field value
     */
    public String getStatus()
    {
        return this.status;
    }
    
    public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getvBankDate() {
		return vBankDate;
	}

	public void setvBankDate(int vBankDate) {
		this.vBankDate = vBankDate;
	}
	
	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getPgId() {
		return pgId;
	}

	public void setPgId(String pgId) {
		this.pgId = pgId;
	}

	public boolean isEscrow() {
		return escrow;
	}

	public void setEscrow(boolean escrow) {
		this.escrow = escrow;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getCardCode() {
		return cardCode;
	}

	public void setCardCode(String cardCode) {
		this.cardCode = cardCode;
	}

	public String getvBankCode() {
		return vBankCode;
	}

	public void setvBankCode(String vBankCode) {
		this.vBankCode = vBankCode;
	}

	public String getvBankName() {
		return vBankName;
	}

	public void setvBankName(String vBankName) {
		this.vBankName = vBankName;
	}

	public String getvBankNum() {
		return vBankNum;
	}

	public void setvBankNum(String vBankNum) {
		this.vBankNum = vBankNum;
	}

	public String getvBankHolder() {
		return vBankHolder;
	}

	public void setvBankHolder(String vBankHolder) {
		this.vBankHolder = vBankHolder;
	}

	public int getCancelAmount() {
		return cancelAmount;
	}

	public void setCancelAmount(int cancelAmount) {
		this.cancelAmount = cancelAmount;
	}

	public String getFailReason() {
		return failReason;
	}

	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}
	public String getCreated() {
		return created;
	}
	public void setCreated(String created) {
		this.created = created;
	}
	
	public int getRecipeId() {
		return recipeId;
	}
	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}
	public List<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(List<Cart> cartList) {
		this.cartList = cartList;
	}
	public long getTrace() {
		return trace;
	}
	public void setTrace(long trace) {
		this.trace = trace;
	}
	public int getImpStatus() {
		return impStatus;
	}
	public void setImpStatus(int impStatus) {
		this.impStatus = impStatus;
	}
	public boolean isImp_success() {
		return imp_success;
	}
	public void setImp_success(boolean imp_success) {
		this.imp_success = imp_success;
	}
	public String getError_msg() {
		return error_msg;
	}
	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}
	public int getCartListSize() {
		return cartListSize;
	}
	public void setCartListSize(int cartListSize) {
		this.cartListSize = cartListSize;
	}
	public int getCartListSizeTue() {
		return cartListSizeTue;
	}
	public void setCartListSizeTue(int cartListSizeTue) {
		this.cartListSizeTue = cartListSizeTue;
	}
	public int getCartListSizeFri() {
		return cartListSizeFri;
	}
	public void setCartListSizeFri(int cartListSizeFri) {
		this.cartListSizeFri = cartListSizeFri;
	}
	public LocalDate getSearchDateStart() {
		return searchDateStart;
	}
	public void setSearchDateStart(LocalDate searchDateStart) {
		this.searchDateStart = searchDateStart;
	}
	public LocalDate getSearchDateFinish() {
		return searchDateFinish;
	}
	public void setSearchDateFinish(LocalDate searchDateFinish) {
		this.searchDateFinish = searchDateFinish;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getFinish() {
		return finish;
	}
	public void setFinish(String finish) {
		this.finish = finish;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public String getPayMethodView() {
		return payMethodView;
	}
	public void setPayMethodView(String payMethodView) {
		this.payMethodView = payMethodView;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getRefund_account() {
		return refund_account;
	}
	public void setRefund_account(String refund_account) {
		this.refund_account = refund_account;
	}
	public String getRefund_bank() {
		return refund_bank;
	}
	public void setRefund_bank(String refund_bank) {
		this.refund_bank = refund_bank;
	}
	public String getRefund_holder() {
		return refund_holder;
	}
	public void setRefund_holder(String refund_holder) {
		this.refund_holder = refund_holder;
	}
	//----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE); 
    } 
    
	public static ImpResult parseJson(JSONObject json) {
    	ImpResult result = new ImpResult();
    	if(json.has(applyNumKey)) {
    		try {
    			result.setApplyNum(json.getString(applyNumKey));
    		}catch(JSONException e) {
    			logger.info(e.getMessage());
    		}
    	}
    	if(json.has(bankNameKey)) {
    		try {
    			result.setBankName(json.getString(bankNameKey));
    		}catch(JSONException e) {
    			logger.info(e.getMessage());
    		}
    	}
    	if(json.has(buyerAddrKey)) {
    		try {
    			result.setBuyerAddr(json.getString(buyerAddrKey));
	    	}catch(JSONException e) {
	    		logger.info(e.getMessage());
			}
    	}
    	if(json.has(buyerEmailKey)) {
    		try {
    			result.setBuyerEmail(json.getString(buyerEmailKey));
    		}catch(JSONException e) {
    			logger.info(e.getMessage());
    		}
    	}
    	if(json.has(buyerNameKey)) {
    		try {
    			result.setBuyerName(json.getString(buyerNameKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(buyerPostcodeKey)) {
    		try {
    			result.setBuyerPostcode(json.getString(buyerPostcodeKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(buyerTelKey)) {
    		try {
    			result.setBuyerTel(json.getString(buyerTelKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(cardNameKey)) {
    		try {
    			result.setCardName(json.getString(cardNameKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(cardQuotaKey)) {
    		result.setCardQuota(json.getInt(cardQuotaKey));
    	}
    	if(json.has(couponKey)) {
    		try {
    			result.setCoupon(json.getString(couponKey));
    		}catch(Exception e) {
    			logger.info(e.getLocalizedMessage());
    		}
    	}
    	if(json.has(currencyKey)) {
    		try {
    			result.setCurrency(json.getString(currencyKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(customDataKey)) {
    		try {
    			result.setCustomData(json.getString(customDataKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(impUidKey)) {
    		try {
    			result.setImpUid(json.getString(impUidKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(merchantUidKey)) {
    		try {
    			result.setMerchantUid(json.getString(merchantUidKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(nameKey)) {
    		try {
    			result.setName(json.getString(nameKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(paidAtKey)) {
    		try {
    			result.setPaidAt(json.getInt(paidAtKey));
    		}catch(Exception e) {
    			logger.info(e.getMessage());
    		}
    		if(result.getPaidAt() == 0) {
    			try {
    				result.setPaidAt(json.getInt(vbankIssuedAtKey));
    			}catch(Exception e) {
    				logger.info(e.getLocalizedMessage());
    			}
    			
    		}
    	}
    	if(json.has(cancelledAtKey)) {
    		try {
    			result.setCancelledAt(json.getInt(cancelledAtKey));
    		}catch(Exception e) {
    			logger.info(e.getMessage());
    		}
    	}
    	if(json.has(failedAtKey)) {
    		try {
    			result.setFailedAt(json.getInt(failedAtKey));
    		}catch(Exception e) {
    			logger.info(e.getMessage());
    		}
    	}
    	if(json.has(paidAmountKey)) {
    		try {
    			result.setPaidAmount(json.getInt(paidAmountKey));
    		}catch(Exception e) {
    			logger.info(e.getMessage());
    		}
    	}
    	if(json.has(payMethodKey)) {
    		try {
    			result.setPayMethod(json.getString(payMethodKey));

//    			switch(result.getPayMethod()) {
//    				case ImpResult.CARD_PAID:
//    					result.setPayMethodView(ImpResult.CARD_PAID_TXT);
//    					break;
//    				case ImpResult.VBANK_PAID:
//    					result.setPayMethodView(ImpResult.VBANK_PAID_TXT);
//    					break;
//    				case ImpResult.TRANS_PAID:
//    					result.setPayMethodView(ImpResult.TRANS_PAID_TXT);
//    					break;
//    				case ImpResult.PHONE_PAID:
//    					result.setPayMethodView(ImpResult.PHONE_PAID_TXT);
//    					break;
//    			}
    			if(result.getPayMethod().equalsIgnoreCase(ImpResult.CARD_PAID)) {
    				result.setPayMethodView(ImpResult.CARD_PAID_TXT);
    			}else if(result.getPayMethod().equalsIgnoreCase(ImpResult.VBANK_PAID)) {
    				result.setPayMethodView(ImpResult.VBANK_PAID_TXT);
    			}else if(result.getPayMethod().equalsIgnoreCase(ImpResult.TRANS_PAID)) {
    				result.setPayMethodView(ImpResult.TRANS_PAID_TXT);
    			}else if(result.getPayMethod().equalsIgnoreCase(ImpResult.PHONE_PAID)) {
    				result.setPayMethodView(ImpResult.PHONE_PAID_TXT);
    			}
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(pgProviderKey)) {
    		try {
    			result.setPgProvider(json.getString(pgProviderKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(pgTidKey)) {
    		try {
    			result.setPgTid(json.getString(pgTidKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(pgTypeKey)) {
    		try {
    			result.setPgType(json.getString(pgTypeKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(receiptUrlKey)) {
    		try {
    			result.setReceiptUrl(json.getString(receiptUrlKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(statusKey)) {
    		try {
    			result.setStatus(json.getString(statusKey));
    		}catch (Exception e) {
    			logger.info(e.getMessage());
			}
    	}
    	if(json.has(amountKey)) {
    		try {
    			result.setAmount(json.getInt(amountKey));
    		}catch(JSONException e) {
    			logger.info(e.getMessage());
    		}
    	}
    	if(json.has(vBankDateKey)) {
    		try {
    			result.setvBankDate(json.getInt(vBankDateKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(channelKey)) {
    		try {
    			result.setChannel(json.getString(channelKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(pgIdKey)) {
    		try {
    			result.setPgId(json.getString(pgIdKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(escrowKey)) {
    		try {
    			result.setEscrow(json.getBoolean(escrowKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(bankCodeKey)) {
    		try {
    			result.setBankCode(json.getString(bankCodeKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(cardCodeKey)) {
    		try {
    			result.setCardCode(json.getString(cardCodeKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(vbankCodeKey)) {
    		try {
    			result.setvBankCode(json.getString(vbankCodeKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(vbankNameKey)) {
    		try {
    			result.setvBankName(json.getString(vbankNameKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(vbankNumKey)) {
    		try {
    			result.setvBankNum(json.getString(vbankNumKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(vbankHolderKey)) {
    		try {
    			result.setvBankHolder(json.getString(vbankHolderKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(vbankDateKey)) {
    		try {
    			result.setvBankDate(json.getInt(vBankDateKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(cancelAmountKey)) {
    		try {
    			result.setCancelAmount(json.getInt(cancelAmountKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(failReasonKey)) {
    		try {
    			result.setFailReason(json.getString(failReasonKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(cancelReasonKey)) {
    		try {
    			result.setCancelReason(json.getString(cancelReasonKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(createdKey)) {
    		try {
    			result.setCreated(json.getString(createdKey));
    		}catch(Exception e) {
    			
    		}
    	}
    	if(json.has(successKey)) {
    		result.setImp_success(json.getBoolean(successKey));
    	}
    	if(json.has(errorMsgKey)) {
    		result.setError_msg(json.getString(errorMsgKey));
    	}
    	return result;
    }
	@Override
	public int compareTo(ImpResult r) {
		if(this.paidAt < r.getPaidAt()) {
			return 1;
		}else if(this.paidAt > r.getPaidAt()) {
			return -1;
		}
		return 0;
	}
}
