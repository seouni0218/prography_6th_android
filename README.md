# prography_6th_android
  프로그라피 6기 Android 사전과제
  ViewPager를 이용해 Fragment 3개를 연결한 Swipe가 가능한 Bottom Navigation View와
  retrofit2와 gson을 이용해 JSON 형식의 정보를 받아와 RecyclerView로 나타내는 과제
 
 ## 실행결과
  ViewPager를 이용해 Fragement 3개를 연결한 Swipe가 가능한 Bottom Navigation View는 성공했지만
  2번 과제에서 JSON 형색의 정보를 받아오지 못함
  
  <클래스 설명>
  - FragCalls.java : 첫번째 Fragement, 오른쪽으로 스와이프하면 다음 Fragement로 넘어간다.
  - FragChats.java : 가운데 Fragement로 "GET" 버튼을 누르면 ​https://ghibliapi.herokuapp.com/films 에서 JSON 형식의 정보를 받아온다. 
    (이 다음으로, RecyclerView를 이용해 정보를 나타내는것 까지 해보려했으나 정보를 받아오지 못해서 구현하지 못했다.)
  - FragContacts.java : 마지막 Fragement, 왼쪽으로 스와이프하면 다시 전 FragChats Fragement로 넘어간다.
  - MainActivity.java : tabLayout에 viewPager 연결하는 작업
    (레이아웃 프리뷰에서는 탭의 글자와 아이콘이 잘 보이는데, 에뮬레이터에서는 보이지 않는다. -> 추후에 수정할 예정)
  - MoiveListVO.java : 받아온 JSON 형식을 GSON 객체로 바꾸기 위한 구조
  - RetrofitAPI.java : retrofit의 api를 정의한 인터페이스
  - ViewPagerAdapter.java : 미리 작성한 Fragement의 layout과 Fragement를 연결해줌
  
