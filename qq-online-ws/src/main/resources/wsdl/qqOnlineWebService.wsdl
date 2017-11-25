<?xml version="1.0" encoding="utf-8"?>
<wsdl:definitions xmlns:soap="http://schemas.xmlsoap.org/wsdl/soap/" xmlns:tm="http://microsoft.com/wsdl/mime/textMatching/" xmlns:soapenc="http://schemas.xmlsoap.org/soap/encoding/" xmlns:mime="http://schemas.xmlsoap.org/wsdl/mime/" xmlns:tns="http://WebXml.com.cn/" xmlns:s="http://www.w3.org/2001/XMLSchema" xmlns:soap12="http://schemas.xmlsoap.org/wsdl/soap12/" xmlns:http="http://schemas.xmlsoap.org/wsdl/http/" targetNamespace="http://WebXml.com.cn/" xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">
  <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; &lt;strong&gt;腾讯QQ在线状态 WEB 服务&lt;/strong&gt;。&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; 和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。&lt;/br&gt;此腾讯QQ在线状态Web Services请不要用于任何商业目的，若有需要请&lt;a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank"&gt;联系我们&lt;/a&gt;，欢迎技术交流。 QQ：8409035&lt;br /&gt;&lt;strong&gt;使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持&lt;/strong&gt;！&lt;br /&gt;&lt;br /&gt;&amp;nbsp;</wsdl:documentation>
  <wsdl:types>
    <s:schema elementFormDefault="qualified" targetNamespace="http://WebXml.com.cn/">
      <s:element name="qqCheckOnline">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="qqCode" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="qqCheckOnlineResponse">
        <s:complexType>
          <s:sequence>
            <s:element minOccurs="0" maxOccurs="1" name="qqCheckOnlineResult" type="s:string" />
          </s:sequence>
        </s:complexType>
      </s:element>
      <s:element name="string" nillable="true" type="s:string" />
    </s:schema>
  </wsdl:types>
  <wsdl:message name="qqCheckOnlineSoapIn">
    <wsdl:part name="parameters" element="tns:qqCheckOnline" />
  </wsdl:message>
  <wsdl:message name="qqCheckOnlineSoapOut">
    <wsdl:part name="parameters" element="tns:qqCheckOnlineResponse" />
  </wsdl:message>
  <wsdl:message name="qqCheckOnlineHttpGetIn">
    <wsdl:part name="qqCode" type="s:string" />
  </wsdl:message>
  <wsdl:message name="qqCheckOnlineHttpGetOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:message name="qqCheckOnlineHttpPostIn">
    <wsdl:part name="qqCode" type="s:string" />
  </wsdl:message>
  <wsdl:message name="qqCheckOnlineHttpPostOut">
    <wsdl:part name="Body" element="tns:string" />
  </wsdl:message>
  <wsdl:portType name="qqOnlineWebServiceSoap">
    <wsdl:operation name="qqCheckOnline">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得腾讯QQ在线状态&lt;/h3&gt;&lt;p&gt;输入参数：QQ号码 String，默认QQ号码：8698053。返回数据：String，Y = 在线；N = 离线；E = QQ号码错误；A = 商业用户验证失败；V = 免费用户超过数量&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:qqCheckOnlineSoapIn" />
      <wsdl:output message="tns:qqCheckOnlineSoapOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="qqOnlineWebServiceHttpGet">
    <wsdl:operation name="qqCheckOnline">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得腾讯QQ在线状态&lt;/h3&gt;&lt;p&gt;输入参数：QQ号码 String，默认QQ号码：8698053。返回数据：String，Y = 在线；N = 离线；E = QQ号码错误；A = 商业用户验证失败；V = 免费用户超过数量&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:qqCheckOnlineHttpGetIn" />
      <wsdl:output message="tns:qqCheckOnlineHttpGetOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:portType name="qqOnlineWebServiceHttpPost">
    <wsdl:operation name="qqCheckOnline">
      <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;br /&gt;&lt;h3&gt;获得腾讯QQ在线状态&lt;/h3&gt;&lt;p&gt;输入参数：QQ号码 String，默认QQ号码：8698053。返回数据：String，Y = 在线；N = 离线；E = QQ号码错误；A = 商业用户验证失败；V = 免费用户超过数量&lt;/p&gt;&lt;br /&gt;</wsdl:documentation>
      <wsdl:input message="tns:qqCheckOnlineHttpPostIn" />
      <wsdl:output message="tns:qqCheckOnlineHttpPostOut" />
    </wsdl:operation>
  </wsdl:portType>
  <wsdl:binding name="qqOnlineWebServiceSoap" type="tns:qqOnlineWebServiceSoap">
    <soap:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="qqCheckOnline">
      <soap:operation soapAction="http://WebXml.com.cn/qqCheckOnline" style="document" />
      <wsdl:input>
        <soap:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="qqOnlineWebServiceSoap12" type="tns:qqOnlineWebServiceSoap">
    <soap12:binding transport="http://schemas.xmlsoap.org/soap/http" />
    <wsdl:operation name="qqCheckOnline">
      <soap12:operation soapAction="http://WebXml.com.cn/qqCheckOnline" style="document" />
      <wsdl:input>
        <soap12:body use="literal" />
      </wsdl:input>
      <wsdl:output>
        <soap12:body use="literal" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="qqOnlineWebServiceHttpGet" type="tns:qqOnlineWebServiceHttpGet">
    <http:binding verb="GET" />
    <wsdl:operation name="qqCheckOnline">
      <http:operation location="/qqCheckOnline" />
      <wsdl:input>
        <http:urlEncoded />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:binding name="qqOnlineWebServiceHttpPost" type="tns:qqOnlineWebServiceHttpPost">
    <http:binding verb="POST" />
    <wsdl:operation name="qqCheckOnline">
      <http:operation location="/qqCheckOnline" />
      <wsdl:input>
        <mime:content type="application/x-www-form-urlencoded" />
      </wsdl:input>
      <wsdl:output>
        <mime:mimeXml part="Body" />
      </wsdl:output>
    </wsdl:operation>
  </wsdl:binding>
  <wsdl:service name="qqOnlineWebService">
    <wsdl:documentation xmlns:wsdl="http://schemas.xmlsoap.org/wsdl/">&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; &lt;strong&gt;腾讯QQ在线状态 WEB 服务&lt;/strong&gt;。&lt;a href="http://www.webxml.com.cn/" target="_blank"&gt;WebXml.com.cn&lt;/a&gt; 和/或其各供应商不为本页面提供信息的错误、残缺、延迟或因依靠此信息所采取的任何行动负责。&lt;/br&gt;此腾讯QQ在线状态Web Services请不要用于任何商业目的，若有需要请&lt;a href="http://www.webxml.com.cn/zh_cn/contact_us.aspx" target="_blank"&gt;联系我们&lt;/a&gt;，欢迎技术交流。 QQ：8409035&lt;br /&gt;&lt;strong&gt;使用本站 WEB 服务请注明或链接本站：http://www.webxml.com.cn/ 感谢大家的支持&lt;/strong&gt;！&lt;br /&gt;&lt;br /&gt;&amp;nbsp;</wsdl:documentation>
    <wsdl:port name="qqOnlineWebServiceSoap" binding="tns:qqOnlineWebServiceSoap">
      <soap:address location="http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="qqOnlineWebServiceSoap12" binding="tns:qqOnlineWebServiceSoap12">
      <soap12:address location="http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="qqOnlineWebServiceHttpGet" binding="tns:qqOnlineWebServiceHttpGet">
      <http:address location="http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx" />
    </wsdl:port>
    <wsdl:port name="qqOnlineWebServiceHttpPost" binding="tns:qqOnlineWebServiceHttpPost">
      <http:address location="http://www.webxml.com.cn/webservices/qqOnlineWebService.asmx" />
    </wsdl:port>
  </wsdl:service>
</wsdl:definitions>