package mobi.mobipalma.api;

public class ExtensionMapper {

public static java.lang.Object getTypeObject(java.lang.String namespaceURI,
        java.lang.String typeName,
        javax.xml.stream.XMLStreamReader reader) throws java.lang.Exception{


if (
"https://api.mobipalma.mobi/docs/".equals(namespaceURI) &&
"Bicicleta".equals(typeName)){

return  mobi.mobipalma.api.Bicicleta.Factory.parse(reader);


}


if (
"https://api.mobipalma.mobi/docs/".equals(namespaceURI) &&
"Estacion".equals(typeName)){

return  mobi.mobipalma.api.Estacion.Factory.parse(reader);


}


if (
"https://api.mobipalma.mobi/docs/".equals(namespaceURI) &&
"Anclajes".equals(typeName)){

return  mobi.mobipalma.api.Anclajes.Factory.parse(reader);


}


throw new org.apache.axis2.databinding.ADBException("Unsupported type " + namespaceURI + " " + typeName);
}

}