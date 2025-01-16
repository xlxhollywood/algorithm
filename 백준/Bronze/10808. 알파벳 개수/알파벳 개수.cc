#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

int main(){
  string word;
  int check[26] = {0};
  char for_check[26] = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r'
  ,'s','t','u','v','w','x','y','z'};
  
  cin >> word;

  for(int i = 0 ; i < word.size(); i++){
      for(int j = 0 ; j < 26; j++){
        if(word[i] == for_check[j]){
            check[j]++;
        }
      }
  }
  
  for(int n : check)
  cout << n << " ";

  return 0;
}