#include<iostream>
#include<set>
using namespace std;

int main(){
  int num;
  int k = 0;

  string player[150];
  set<char> f_name;
  int stack = 1;
  int flag = 0;



  cin >> num;

  for(int i = 0 ; i < num ; i++)
    cin >> player[i];

  // 선수의 수 만큼 반복한다 ex) 0 ~ 17번.. 
  for(int i = 0 ; i < num ; i++){
      // ex) 선수의 수 + 1 만큼 반복한다 ex) j = 1 ~ 17
      for(int j = i + 1 ; j < num; j ++) {
        // 0과 1를 비교 , 0과 2를 비교, 1과 2를 비교, 1과 3을 비교
        if (player[i].front() == player[j].front()) {
          flag = 1; // 다음 선수 성과 같으면 flag = 1이된다.
        }
          if(flag==1){ // flag가 1이되면 스택이 쌓이고 flag를 0으로 만든다.
            stack++;
            flag = 0;
          }
        
        if(stack >= 5){ // 스택이 5개 이상이 되면 원본이 배열에 들어간다.
        f_name.insert(player[i].front());
        break;        
      } 
    }
    stack = 1;

  }

    if (!f_name.empty()) {
          for (char c : f_name) {
              cout << c;
          }
          cout << endl;
      } else {
          cout << "PREDAJA" << endl;
      }

  return 0;
}