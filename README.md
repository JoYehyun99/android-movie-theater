# android-movie-theater

## STEP 1

### 기능목록

- [x] 예매 완료 화면에서 극장 이름이 길 경우 말줄임표로 표시되어야 한다.

- [x] 영화 선택 후 극장을 선택할 수 있다.
- [x] 영화 선택 시, 극장 명과 해당 영화의 상영 시간 개수를 표시한다.
- [x] 극장별로 상영하는 영화와 상영시간은 달라질 수 있다.

- [ ] Database의 내용에 따라 Time Spinner 에 표시되는 시간의 내용이 달라진다. 
  - 날짜별로 시간대를 다르게 설정하지는 않는다.

### Domain

- Screen
- [x] 영화 ID와 상영 일시 정보 리스트를 가지고 있다.

- Theater
- [x] 영화관 이름을 가지고 있다.
- [x] 상영중인 영화정보(Screen) 리스트를 가지고 있다.


### TODO
- [ ] Ads 에 대해서도 데이터 바인딩을 사용한다.
