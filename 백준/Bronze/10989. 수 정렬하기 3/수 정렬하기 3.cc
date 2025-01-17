#include <iostream>


using namespace std;

int main(){
    int cnt[10001] = { 0 };             // 0~10000 범위의 수를 카운트할 배열
    int n, count;
    cin >> n;                           // 입력할 숫자의 개수 n을 받음

    for (int i = 0; i < n; i++){         // n번 반복하여 숫자를 입력받음
        cin >> count;                   // 하나의 숫자를 count에 입력받음
        cnt[count]++;                   // 해당 숫자의 등장 횟수를 카운팅 (cnt 배열에서 해당 인덱스 값을 증가)
    }

    for (int i = 1; i < 10001; i++)    // 1부터 10000까지 반복
        for (int j = 0; j < cnt[i]; j++) // cnt[i]번 반복
            cout << i << '\n';           // cnt[i]번만큼 해당 숫자 i를 출력

    return 0;
}