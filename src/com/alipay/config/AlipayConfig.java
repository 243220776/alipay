package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016082500310327";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCf14OKgYYYZfxu0PcaLZTOL+04QUyYKwE8ORZ02HJrV9obFbKRpe5vDR0Nz9Nn74xnZYOuvw3PFCkMvOd8CzPOKJoKlv3lKISh2bfw/I492D2F+FfNDcP1/PbV0csH8IH1KzYvI+SzL5to4ZcstTnZLiR5GgStRQScFGLrRWg4iu4rnFHD6M5lebScUiOIi68yJYOXReFu4xyqBe0vjN8/6mnjw5DNB/VCgL0ufJZkoFM97ZTQcf1VLV9qjDzBnvy9wi5s4SBukQ7TVgkMX9XFGQ5Ipku8JqgUK0ZGqsuEHyfAYeeyjwAmHnIqXmlpRVD65YyU3sF9SYEh1kOeKUxTAgMBAAECggEAU3QpKKKRiaGN16ngqdlMjQ520108iWJCpdfEgsMTkjnvFR8R+Xth7rcxCSoN3YEzlDRrOUxlAE4tVIo4bgpHRQbrzkWhUAkEnqBWqkqiVWXWUWElLllWi9NEaMS9NWr73y5tftVFrcxYXr0RufTwvBScVGIiOPkE/BykvOOjE4mVbcuraNXhq4DPTThdbQ5gaAcUc8nVJAGBTIVKdRWrJkudRXTy0ah9P6kZXURKur2z3XuNvx99dmnE4yum/KyPYI71OsnNs7oLRdqStrZiAJFanS9S+VNozYN5JNd/vkhDUXWrzh2VnzKECv9oAv8HPcPql/smiN9f6GQvJ+rHuQKBgQD8uRIHOIuOA6xsUIIrTm2a6Se92mxJGBVW7qbN/RWySvpcgCJ1OJ9ZYUS73LJ8C0iGzpNQeXyMO9jirtqpADgMKEkLgmp6im8L7m+irWMLi7ZbW5wFV4r+Sku0ho8ho5xI2ZzqsD0iDtZXL8KWBga+mtTPVjGApeLL7re7M/0ThwKBgQCh6h5tMhdFkF8ji8aNiQ7X1ndDdeRLXImTJAcykmMQKumEPghHHGhwAZjzG+yQQJNPhvn/qv2yeXPisZbhpQUjnYsb4pAFqtrrqhKmUI37Lzzc4Qo+bXp7KdapRyPG3NKc/XYhLzqy5LofxVX96RGPcak8OW8dPlWmuXOpoATL1QKBgQDLG/ZoRUKrlTo7Jw0mvvaJ3L7q76O9rxRfdJgszy1jyKykMPsAmMxAqlLyZPIxjWPxrA5rS+gUUHkD3iGwV5Oz+aCTFnJ7H80VmsCvzofenJ+nlt2y0WPM8WscoFRiZbrSNcrON2w6dhA/rAvIRPmgsJE+PXi1exzmZ2nUk3je+wKBgQCU0giHW0wSj2Ey3c1w1/IBpslWAy0Dq5lz2eCXtf9Bo/+gohefrNe9Y2p+wULNT91WcnykZzjp60H9sjc5TSENHEf5KGQyIVk41Mhxf4cQwdlSN7HfsWarf8gjLRUQOnWHAFysoal1NlBw1UN1rtyKGPFxPmUH3vyA0uIhncfqxQKBgEuqGyJY7otZ4eBb0yZvDyt0LP4pWjTsbwxgxxx29VSKl/sE9cTwnS1G0R5XNcDW2oyZPlojxe1IFX+futtSp9fD9EH2ba68mPctZCtGBAvDK3//vXsw81bwjajKu+z0h/buuVJ5kC336ZCTnXKUpn/jKIsgSv69VJsIa698e0U7";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA3xaawLfyw3uA9aDrS15eoOPaeIjEvOTLfGYgFszYZPJBE4RgIOagKfVlkDwqysvYGC6wAUpSciymjUhN07a5JpPvZX6TFUxBWvUwoCrzlCRqmEvJ2IJ+q3ETYjZwmBNvL8Te/Lwe6uhg9IygcWOAtziI5qlntv2l76sX+6fBkUXU93psmjt4soKJfkM1cFpPJ5R4Qi8ESp3PL3EzA6hEkpbcfFaz/HG4ZiecBgEeDwB6q9iaRRDmrAWe1kzk/TALsL+HHZ4anKwDdGyZT5Wj2zUbMM03k52k3Ra1tdKL3qk4tKZb2KlAVx985onjp2y99lau+OtytTCElUmqNHmD9QIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8070/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8070/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "C:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

