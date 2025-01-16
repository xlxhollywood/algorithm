#include <iostream>
#include <algorithm>
#include <stack>
using namespace std;

int main(){

  string word;
  string compare;
  stack<char> a;
  int flag = 0;

  cin >> word; 

  for(int i = 0 ; i < word.length(); i++){ 
    a.push(word[i]);
  }

  while(!a.empty()){
    compare += a.top();
    a.pop();
  }

  if(word == compare)
    flag = 1;
    else
      flag = 0;

    cout << flag << endl;

  return 0;
}