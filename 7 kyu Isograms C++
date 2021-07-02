bool is_isogram(std::string str) {
  if (str == ""){
    return true;
  }
  for (int i = 0; i < str.length(); i++){
    for (int j = i + 1; j < str.length(); j++){
      if (tolower(str.at(i)) == tolower(str.at(j))){
        return false;
      }
    }
  }
  return true;  
} 
