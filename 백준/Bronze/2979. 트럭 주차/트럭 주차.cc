#include <iostream>
using namespace std;

int main() {
  /*
  5 3 1

  1 6 
  3 5
  2 8

  1 2 3 4 5 6 
   1 1 1 1 1 
    2 3 4 5 6 7 8
     1 1 1 1 1 1
      3 4 5
       1 1 
  1 2 3 4 5 6 
    2 3 4 5 6 7 8
      3 4 5
  5 6 3 3 6 5 5  = 33원

  1시부터 2시까지는 1대 요금 이므로 5원
  2시부터 3시까지는 2대 요금이므로 3 * 2(cnt) = 6원
  3시부터 5시까지는 3대 요금 이므로 1 * 2(time) * 3(cnt) = 6원
  5시부터 6시까지는 2대 요금이므로 3 * 2(cnt) = 6원
  6시부터 8시까지는 1대 요금이므로 5 * 2 = 10원
  5 + 6 + 6+ 6 + 10 = 33원 

  1-1) 인덱스를 통해서 입력 받은 입출차 시간 사이에 1을 넣어준다. 
  1-2) 세 트럭의 인덱스를 확인하여 요금을 확인하고 정산한다. 

  */
  int truck_a[100] = {0}; // 트럭 A의 입차 및 출차 상태를 저장할 배열, 0으로 초기화
  int truck_b[100] = {0}; // 트럭 B의 상태 배열 (필요시 추가)
  int truck_c[100] = {0}; // 트럭 C의 상태 배열 (필요시 추가)
  int truck_a_in , truck_a_out; 
  int truck_b_in , truck_b_out; 
  int truck_c_in , truck_c_out; 
  int total_sum = 0 ;

  int fee[3]; 

  cin >> fee[0] >> fee[1] >> fee[2]; // 요금을 입력 받는다.

  cin >> truck_a_in >> truck_a_out; // 각 트럭의 입차 및 출차 시간을 받는다.
  cin >> truck_b_in >> truck_b_out; // 각 트럭의 입차 및 출차 시간을 받는다.
  cin >> truck_c_in >> truck_c_out; // 각 트럭의 입차 및 출차 시간을 받는다.
  
  

  for(int i =truck_a_in; i < truck_a_out; i++ ){
        truck_a[i]++;
        }
  for(int i =truck_b_in; i < truck_b_out; i++ ){
        truck_b[i]++;
        }
  for(int i =truck_c_in; i < truck_c_out; i++ ){
        truck_c[i]++;
        }
      
    for(int i = 1; i < 100; i++){
      if(truck_a[i] + truck_b[i] + truck_c[i] == 0)
              total_sum += 0;
        else if(truck_a[i] + truck_b[i] + truck_c[i] == 1){
                total_sum += fee[0] * 1;
        }
        else if(truck_a[i] + truck_b[i] + truck_c[i] == 2){
                total_sum += fee[1] * 2;
        }
        else if(truck_a[i] + truck_b[i] + truck_c[i] == 3){
                total_sum += fee[2] * 3;
        }
    }

    cout << total_sum << endl;


  


    return 0;
}
