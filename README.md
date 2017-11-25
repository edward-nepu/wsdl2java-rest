# wsdl2java-rest
A SpringBoot demo developed by Idea IDE to convert the soap web service to restful web service

when converting the wsdl to java code, it may be throw the exception: undefined element declaration 's:schema'
just find all the element:
      <s:element ref="s:schema" />
      <s:any />
and replace them with the element below:
      <s:any minOccurs="2" maxOccurs="2"/>

