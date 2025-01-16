#include <iostream>
#include <vector>

using namespace std;

int main() {
    int a[1001] = {0}; // 배열 초기화
    int cnt = 1;
    int input1, input2;
    int result = 0;

    for (int i = 1; i < 46; i++) { // 몇이 마지막인지 알 수 없으나 대략적으로 46이어서 그렇게 적음
        for (int j = 0; j < i; j++) { // 배열 크기 초과 방지
            a[cnt++] = i; // 배열에 i 값 할당 후 cnt 증가
            if (cnt == 1001) break; // cnt가 a[A] <= a[B] <= a[1000] 이므로 1000에서 정지 
        }
        if (cnt == 1001) break;
    }

  
    cin >> input1 >> input2;

                        // 7 - 3 + 1 = 5
    for(int i = 0; i <= input2-input1 ; i ++ ){
      result += a[input1+i] ;
      }

      // 3 ~ 7 => a[3], a[4] , a[5], a[6], a[7]
      //  0 1 2 2 3 3 3 4  => 2 + 3 + 3 + 3 + 4
      cout << result << endl;
  
    return 0;
}
