function leertransporte() {
    transportesTR = document.getElementsByTagName('table')[0].getElementsByTagName('tr')
	transportesTD = document.getElementsByTagName('table')[0].getElementsByTagName('td')
    str='[';
    str='[';
	
    for (i=1;i<=12;i++) {
     
	 fecha= "2017" + 13-i
      urbano  = transportesTR[3].children[i].textContent.replace(',','.');
	  interurbano  = transportesTR[6].children[i].textContent.replace(',','.');
	  
	  metro = transportesTR[4].children[i].textContent;
	  autobus = transportesTR[5].children[i].textContent;
	  
	  inter_autobus = transportesTR[7].children[i].textContent.replace(',','.');
	  inter_autobus_c = transportesTR[8].children[i].textContent.replace(',','.');
	  inter_autobus_md = transportesTR[9].children[i].textContent.replace(',','.');
	  inter_autobus_ld = transportesTR[10].children[i].textContent.replace(',','.');
	  
	  
      inter_ferrocarril = transportesTR[11].children[i].textContent;
	  inter_ferrocarril_c = transportesTR[12].children[i].textContent.replace(',','.');
	  inter_ferrocarril_md = transportesTR[13].children[i].textContent.replace(',','.');
	  inter_ferrocarril_ld = transportesTR[14].children[i].textContent.replace(',','.');
	  
	  especial= transportesTR[22].children[i].textContent;
	  
	 
	  str += "["
	  str += i
	  str += ","
	  str += "'"
	  str += + fecha 
	  str += "'"
      str += "," + urbano
      str += "," + interurbano
	  str += "," + especial
	  str += "," + inter_autobus_c
	  str += "," + inter_autobus_md
	  str += "," + inter_autobus_ld

	 
	  
      str += "]"
	  
	  if (i<12){
	  str += ","
	  }
      
      str += "\n"
    }
	str += "]"
    return str;
}