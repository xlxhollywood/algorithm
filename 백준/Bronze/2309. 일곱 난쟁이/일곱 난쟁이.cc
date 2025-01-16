#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;

int main(){
  vector<int> result;
  int value;

  for(int i = 0; i < 9; i++){
    cin >> value;
    result.push_back(value);
  }

  sort(result.begin(), result.end());

  do{
    int total_sum = 0;
    for(int i = 0 ; i < 7; i++){
      total_sum += result[i];
    }
    if(total_sum == 100)
      break;
  }while(next_permutation(result.begin(), result.end()));

  for(int i = 0; i < 7; i++) 
    cout << result[i] << " ";
    
  
  return 0;
}
